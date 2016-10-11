package chapitre1;

import java.util.Arrays;

public class ZeroMatrix {

	
	/**
	 * precondition: int[][]
	 * postcondition: boolean
	 * @param matrix
	 * @return
	 */
	static boolean isMatrix(int[][] matrix){
		int length = matrix[0].length;
		for(int[] row : matrix) if(row.length != length) return false;
		
		return true;
			
	}
	
	/**
	 * precondition: a matrix
	 * postcondition: matrix
	 * @param matrix
	 * @return
	 */
	static int[][] zeroMatrix(int[][] matrix){
		assert matrix != null : "cant be null";
		assert !isMatrix(matrix) : "must be a matrix";
		
		boolean[] indexRow = new boolean[matrix.length];
		boolean[] indexColumn = new boolean[matrix[0].length];
		
		for(int row = 0 ; row < matrix.length ; row++) for(int column = 0 ; column < matrix[0].length; column++)
			if(matrix[row][column] == 0) indexRow[row] = indexColumn[column] = true;
				
		
		
		for(int row = 0 ; row < indexRow.length ; row++)
			if( indexRow[row] == true)
				for(int i = 0 ; i < indexColumn.length ; i ++) matrix[row][i] = 0;
		
		for(int column = 0 ; column < indexColumn.length ; column++)
			if( indexColumn[column] == true)
				for(int i = 0 ; i < indexRow.length ; i ++) matrix[i][column] = 0;
		
		return matrix;
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] [ ] scores = {   { 20, 18, 22, 20, 16 },
                { 18, 20, 18, 21, 20 },
                { 16, 18, 0, 20, 24 },
                {  25, 24, 22, 24, 25 }
            };
		System.out.println(Arrays.deepToString(zeroMatrix(scores)));
	}

}

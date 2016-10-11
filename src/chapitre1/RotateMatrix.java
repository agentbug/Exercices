package chapitre1;

import java.util.Arrays;

public class RotateMatrix {

	
	static void rotateMatrix(int[][] matrix){
		assert !isSquare(matrix): "be square please";
		
		
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++){
			int first = layer;
			int last = n - 1 -layer;
			for(int i = first; i < last; i++){
				int offset = i - first;
				int top = matrix[first][i];
				
				matrix[first][i]= matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}
	
	
	
	static boolean isSquare(int[][] matrix){
		for(int[] m: matrix){
			if (m.length != matrix.length) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [ ] [ ] scores = {   { 20, 18, 22, 20, 16 },
                { 18, 20, 18, 21, 20 },
                { 16, 18, 0, 20, 24 },
                {  25, 24, 22, 24, 25 }
            };
		rotateMatrix(scores);
		System.out.println(Arrays.deepToString(scores));
	}

}

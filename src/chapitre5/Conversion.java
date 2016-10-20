package chapitre5;

public class Conversion {

	
	
	static int bitSwapRequired(int a, int b){
		int count = 0 ;
		for(int c = a^b; c!=0;c = c &(c-1)){
			count++;
		}
		return count;
	}
	
	static int bitSwapRequiredBis(int a, int b){
		
		
		//49 is 1 in AscII
		return (int) Integer.toBinaryString(a ^ b).chars().filter(e -> (e == 49)).count();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(bitSwapRequired(29,15));
		System.out.println(bitSwapRequiredBis(29,15));
	}

}

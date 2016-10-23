package chapitre5;

public class PairwiseSwap {
	
	
	static int swapOddEvenBits(int x){
		return (((x & 0xaaaaaaaa) >>> 1) | (( x & 0x55555555) << 1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(swapOddEvenBits(5));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(swapOddEvenBits(5)));
	}
}

package chapitre5;

public class Insertion {

	
	static String updateBits(int n, int m, int i, int j){
		assert m > n : "m can't be bigger than n";
		assert j <= i: "j cant be small than i";
		
		int allOne = ~0;
		int left = allOne << (j+1);
		int right = (1 << i) - 1;
		int mask = left | right;
		int n_cleared = n & mask;
		int m_shifted = m << i;
		return Integer.toBinaryString(m_shifted | n_cleared);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(updateBits(0b10000000000,0b10011,2,6));
	}

}

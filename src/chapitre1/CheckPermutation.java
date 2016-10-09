package chapitre1;


import java.util.stream.Collectors;

public class CheckPermutation {

	/**
	 * precondition: a and b, two non-null string
	 * postcondition: boolean true or flase
	 * @param a
	 * @param b
	 * @return
	 */
	static boolean  isPermutation(String a, String b){
		assert a != null || b != null :" a or b cant be null";

		return a.chars()
				.sorted()
				.boxed()
				.collect(Collectors.toList())
				.equals(b.chars()
						.sorted()
						.boxed()
						.collect(Collectors.toList())
						);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPermutation("abcc","cba"));
		
		System.out.println(isPermutation("abc","cba"));
		
		System.out.println(isPermutation(null, null));
	}

}

package chapitre1;

public class OneAway {
	
	
	/**
	 * precondition: string a and b cant be null
	 * postcondition: boolean
	 * @param a
	 * @param b
	 * @return
	 */
	static boolean isOneAway(String a,String b){
		
		assert a != null || b != null: "a or b cant be null";

		
		if(a.length() == b.length()) return a.chars().filter(e -> !b.contains(String.valueOf((char)e))).count() == 1;
		else if(a.length() == b.length() +1) return a.chars().filter(e -> !b.contains(String.valueOf((char)e))).count() == 1;
		else if(a.length() == b.length() -1) return b.chars().filter(e -> !a.contains(String.valueOf((char)e))).count() == 1;
		
		
		
		return false;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isOneAway("pale","ple"));
		System.out.println(isOneAway("pales","pale"));
		System.out.println(isOneAway("pale","bale"));
		System.out.println(isOneAway("pale","bae"));
	}

}

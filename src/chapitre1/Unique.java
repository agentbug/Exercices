package chapitre1;



public class Unique {
	
	
	/**
	 * Precondition: string non-null
	 * postcondition: boolean
	 * @param str
	 * @return
	 */
	static boolean isUniqueChar(String str){
		assert str != null :"the string is null";
		
		//if they have the same size, then str is unique
		return str.chars().distinct().count() == str.length();
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(isUniqueChar("test"));
		
		System.out.println(isUniqueChar("dsiuvcnh"));
		
		System.out.println(isUniqueChar("dsiuvcnh"));
		
		System.out.println(isUniqueChar(null));
	}

}

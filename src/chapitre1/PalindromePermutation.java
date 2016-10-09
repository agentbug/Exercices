package chapitre1;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	
	
	
	/**
	 * precondition string non null
	 * postecondition, boolean
	 * @param str
	 * @return
	 */
	static boolean isPermutationOfPalindrom(String str){
		assert str != null : "str cant be null";
		
		Map<Integer,Integer> mapping = new HashMap<>();
		
		//mapping the chars
		str.toLowerCase().chars()
			.filter(e -> !Character.isSpaceChar(e))
			.forEach(e -> { 
							if(mapping.get(e) == null)mapping.put( e, 1); 
							else mapping.replace( e, (mapping.get(e)+1) );
						});
		
		//get the length of String without space
		int length = str.replace(" ", "").length();
		
		//if odd length, then there is a letter which can be found odd times,
		//and others can be found even times
		if( (length & 0x0001) == 1){
			if(((mapping.entrySet().stream().filter(e -> e.getValue()== 1).count() & 0x0001) == 1)
			&& mapping.entrySet().stream().filter(e -> ((e.getValue() & 0x001) != 1)).count() == mapping.size()-1)
				return true;
			
		//if even length, all letter should be found even times
		}else{
			if(mapping.entrySet().stream().filter(e -> ((e.getValue() & 0x001) != 1)).count() == mapping.size())
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		System.out.println(isPermutationOfPalindrom("abbcc"));

		
		System.out.println(isPermutationOfPalindrom("Tact Coa"));
	}

}

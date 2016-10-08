package chapitre1;

import java.util.List;
import java.util.stream.Collectors;

public class URLify {

	
	/**
	 * precondition string non null;
	 * postcondition string with %20 in space
	 * @param str
	 * @return
	 */
	static String  replaceSpaces(String str){
		
		//delete all space
		List<Integer> list = str.chars().filter(e -> !Character.isSpaceChar(e)).boxed().collect(Collectors.toList());

		StringBuilder strb = new StringBuilder();
		
		
		/**
		 * list :{MrJohnSmith}   with index i
		 * array:{Mr John smith} with index j
		 * if list[i] == array[j], then stringbuilder will add the letter,
		 * if not, stringbuilder will add %20, and i stays in the same letter, j++;
		 */
		int j = 0;
		for( int i = 0; i < list.size(); i++){
			
			if(str.charAt(j) != list.get(i)) {
				i--;
				strb.append("%20");
			}else{
				strb.append(str.charAt(j));
				
			}
			j++;
		}
		
		return strb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(replaceSpaces("Mr John Smith     "));
		
		System.out.println(replaceSpaces(" A B C "));
		
	}

}

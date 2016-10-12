package chapitre1;

public class StringRotation {

	
	static boolean isRotation(String s1, String s2){
		assert s1!=null || s2!=null : "can't be null";
		assert s1.length() >0 || s2.length()>0 : "can't be empty";
		
		int len = s1.length();
		
		if(len == s2.length() && len > 0 ){
			String s1s1 = s1 +s1;
			return s1s1.contains(s2);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isRotation("waterbottle","erbottlewat"));
		
		
	}

}

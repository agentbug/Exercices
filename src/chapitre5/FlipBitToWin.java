package chapitre5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FlipBitToWin {

	
	static int getLongest(int x){
		
		String[] temp = Integer.toBinaryString(x).split("0");
		final Map<String,Integer> stringMapping = new HashMap<>();
		Stream.of(temp).reduce((a,b) -> { 
											stringMapping.put(a+b, (a+b).length());
											return b;
											});
		
		int result = 1+ stringMapping.entrySet().stream().max((a,b) -> a.getValue() - b.getValue()).get().getValue();
		
		return result;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLongest(1775));
		System.out.println(getLongest(3535));
	}

}

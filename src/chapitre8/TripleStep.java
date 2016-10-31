package chapitre8;

import java.util.Arrays;

public class TripleStep {

	static private int countWaysStandard(int n){
		if( n < 0){
			return 0 ; 
		}else if( n == 0){
			return 1;
		}else{
			return countWaysStandard(n-1)+countWaysStandard(n-2)+countWaysStandard(n-3);
		}
	}
	
	
	static private int countWaysMemoized(int n){
		int[] memo = new int[n+1];
		Arrays.fill(memo, -11);
		return countWays(n,memo);
	}
	static private int countWays(int n , int[] memo){
		if(n<0) return 0;
		else if (n == 0) return 1;
		else if (memo[n] >-1) return memo[n];
		else {
			memo[n] = countWays(n -1,memo) + countWays(n-2,memo) + countWays(n-3,memo);
			return memo[n];
		}
	}
	
	
	public static void main(String[] args) {
		System.out.printf("%d %d %b", countWaysStandard(10), countWaysMemoized(10),countWaysStandard(10)==countWaysMemoized(10));

	}

}

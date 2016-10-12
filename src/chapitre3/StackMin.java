package chapitre3;

import java.util.Stack;

public class StackMin extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> stackMin;
	
	public StackMin(){
		stackMin = new Stack<Integer>();
	}
	
	public int min(){
		if( stackMin.isEmpty()) return Integer.MAX_VALUE;
		else return stackMin.peek();
	}
	
	public void push(int value){
		if(value <= min()) stackMin.push(value);
		
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min()) stackMin.pop();
		
		return value;
	}
	
	public static void main(String[] args) {
		
		StackMin sm = new StackMin();
		sm.push(5);
		System.out.println(sm.min());
		sm.push(4);
		System.out.println(sm.min());
		sm.push(5);
		System.out.println(sm.min());
		sm.push(2);
		sm.pop();
		System.out.println(sm.min());
	}

}

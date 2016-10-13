package chapitre3;

import java.util.Stack;

public class SortStack {

	static void sortStack(Stack<Integer> stack){
		assert !stack.isEmpty() :"cant be empty";
		
		Stack<Integer> stackTemp = new Stack<>();
		int temp;
		
		while(!stack.isEmpty()){
			 temp = stack.pop();
			 
			 if(temp >= (stackTemp.isEmpty()? Integer.MIN_VALUE: stackTemp.peek()) ){

			 }else while(!stackTemp.isEmpty() && stackTemp.peek() >= temp){
				 stack.push(stackTemp.pop());
			 }
				 
			 stackTemp.push(temp);
		}
		
		while(!stackTemp.isEmpty()) stack.push(stackTemp.pop());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> test = new Stack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		System.out.println(test);
		sortStack(test);
		System.out.println(test);
	}

}

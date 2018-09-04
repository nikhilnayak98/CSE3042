/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack Linked List App
 */
package Example;

public class StackApp {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(44, 45.8);
		stack.push(45, 43.7);
		stack.push(24, 42.6);
		stack.push(78, 93.70);
		
		stack.displayStack();
		
		stack.pop();
		
		stack.displayStack();
	}

}

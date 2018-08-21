/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack using array
 */
package ProgrammingProjects;

public class StackX
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	private int nItems;

	public StackX(int max) {
		maxSize = max;
		stackArray = new long[maxSize];
		top = -1;
		nItems = 0;
	}

	public void push(int j) {
		top++;
		stackArray[top] = j;
	}
	
	public void pushDown(int j) {
		if(top < (maxSize - 1))
			for(int i = top + 1; i > 0; i--)
				stackArray[i] = stackArray[i - 1];
	}

	public long pop() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return 0;
		}
		return stackArray[top--];
	}
	
	public void popDown() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public void display() {
		for(int i = top; i >= 0; i--)
			System.out.println(stackArray[top]);
	}

}

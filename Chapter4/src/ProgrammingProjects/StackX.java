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

	public void pushTop(int j) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		top++;
		stackArray[top] = j;
	}

	public long popTop() {
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
		for(int i = 0; i <= top; i++)
			stackArray[i] = stackArray[i + 1];
		top--;
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
			System.out.println(stackArray[i]);
		System.out.println();
	}

}

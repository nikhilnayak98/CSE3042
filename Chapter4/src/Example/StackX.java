/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack using array
 */
package Example;

public class StackX
{
	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackX(int max) {
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char j) {
		top++;
		stackArray[top] = j;
	}

	public char pop() {
		return stackArray[top--];
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

}

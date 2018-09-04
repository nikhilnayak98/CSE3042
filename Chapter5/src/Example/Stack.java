/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack using Linked List
 */
package Example;

public class Stack {
	
	private LinkedList linkedList;
	
	public Stack() {
		linkedList = new LinkedList();
	}
	
	public void push(int iData, double dData) {
		linkedList.insertFirst(iData, dData);
	}
	
	public void pop() {
		linkedList.deleteFirst();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void displayStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("top -> bottom");
		linkedList.display();
	}

}

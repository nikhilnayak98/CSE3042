/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue Model
 */
package Examples;

public class Queue {
	private final int Size = 20;
	private int[] QArray;
	private int front;
	private int rear;

	public Queue() {
		QArray = new int[Size];
		front = 0;
		rear = -1;
	}

	public void insert(int i) {
		if(rear == Size - 1)
			rear = -1;
		QArray[++rear] = i;
	}

	public int remove() {
		int temp = QArray[front++];
		if(front == Size)
			front = 0;
		return temp;
	}

	public boolean isEmpty() {
		return (rear + 1 == front || (front + Size -1 == rear));
	}
}

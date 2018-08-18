/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue using array
 */
package ProgrammingProjects;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(rear == maxSize - 1)
			rear = -1;
		queArray[++rear] = j;
		nItems++;
	}

	public long remove() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return 0;
		}
		long temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		if(nItems == 0)
			return true;
		return false;
	}

	public boolean isFull() {
		if(nItems == maxSize)
			return true;
		return false;
	}

	public int size() {
		return nItems;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else if(rear >= front) {
			for(int i = front; i <= rear; i++) {
				System.out.print(queArray[i] + " ");
			}
			System.out.println();
		} else if(front <= rear) {
			for(int i = rear; i <= front; i++) {
				System.out.print(queArray[i] + " ");
			}
			System.out.println();
		}
	}
	
	public void displayRev() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else if(rear >= front) {
			for(int i = rear; i >= front; i--) {
				System.out.print(queArray[i] + " ");
			}
			System.out.println();
		} else if(front <= rear) {
			for(int i = front; i >= rear; i--) {
				System.out.print(queArray[i] + " ");
			}
			System.out.println();
		}
	}

}

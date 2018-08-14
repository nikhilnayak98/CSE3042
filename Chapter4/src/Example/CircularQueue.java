/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Circular Queue
 */
package Example;

public class CircularQueue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public CircularQueue(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = -1;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if(front == -1 && rear == -1)
			front++;
		else if((front == 0 && rear == maxSize - 1) || (front == rear + 1)) {
			System.out.println("Overflow");
			return;
		}
		if(rear == maxSize - 1)
			rear = 0;
		else
			rear++;
		queArray[rear] = j;
		nItems++;
	}

	public void remove() {
		if(front == -1) {
			System.out.println("Underflow");
			return;
		}
		else if(front == maxSize - 1)
			front = 0;
		else if(front == rear) {
			front = -1;
			rear = -1;
			return;
		}
		else {
			long temp = queArray[front];
			queArray[front] = -1;
			front++;
			nItems--;
		}
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
		for(int i = 0; i < maxSize; i++) {
			if(queArray[i] != -1)
				System.out.print(queArray[i] + " ");
		}
		System.out.println();
	}

}

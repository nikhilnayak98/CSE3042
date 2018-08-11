/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Custom queue using array
 */
package Example;

public class CustomQueue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public CustomQueue(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		rear++;
		queArray[rear] = j;
		nItems++;
	}

	public long remove() {
		long temp = queArray[front];
		front++;
		nItems--;
		return temp;
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
		for(int i = front; i <= rear; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.println();
	}
}

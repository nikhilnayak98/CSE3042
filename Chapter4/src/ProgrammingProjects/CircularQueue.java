/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Circular Queue
 */
package ProgrammingProjects;

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
			front++;
			nItems--;
		}
	}

	public void insertLeft(long j) {
		if(isFull()) {
			System.out.println("Overflow");
		} else if(front > 0)
			front--;
		queArray[front] = j;
		nItems++;
	}

	public void insertRight(long j) {
		if(front == -1 && rear == -1)
			front++;
		else if(isFull()) {
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

	public void removeLeft() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		front++;
		nItems--;
	}

	public void removeRight() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		rear--;
		nItems--;
	}


	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if((front == 0 && rear == maxSize - 1) || (front == rear + 1))
			return true;
		else if(rear == maxSize - 1)
			return true;
		return false;
	}

	public int size() {
		return nItems;
	}

	public void insertDeQueue(long item) {
		int j;
		if(nItems == 0)
			queArray[nItems++] = item;
		else {
			for(j = nItems - 1; j >= 0; j--) {
				if(item > queArray[j])
					queArray[j + 1] = queArray[j];
				else
					break;
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public void display() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else if(rear < front) {

			for(int i = front; i < maxSize; i++)
				System.out.print(queArray[i] + " ");

			for(int i = 0; i <= rear; i++)
				System.out.print(queArray[i] + " ");

			System.out.println();
		}  else if(rear > front) {

			for(int i = front; i <= rear; i++)
				System.out.print(queArray[i] + " ");

			System.out.println();
		}
	}

}

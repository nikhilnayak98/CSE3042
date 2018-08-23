/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Priority Queue
 */
package ProgrammingProjects;

public class RevisedPriorityQueue {

	private int maxSize;
	private long[] queArray;
	private int nItems;

	public RevisedPriorityQueue(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = -1;
	}

	public void insert(long item) {
		nItems++;
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		queArray[nItems] = item;
	}

	public void remove() {
		int min = 0;
		for(int i = 0; i <= nItems; i++) {
			if(queArray[i] < queArray[min])
				min = i;
		}
		System.out.println("Deleted element - " + queArray[min]);
		for(int i = min; i < nItems ; i++)
			queArray[i] = queArray[i + 1];
		nItems--;
	}
	
	public long peekMin() {
		return queArray[nItems - 1];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull()  { 
		return (nItems == maxSize);
	}
	
	public void display() {
		System.out.println();
		for(int i = 0; i <= nItems; i++)
			System.out.println(queArray[i] + " ");
		System.out.println();
	}
	
}

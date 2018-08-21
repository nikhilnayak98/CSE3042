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
		nItems = 0;
	}

	public void insert(long item) {
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

	public long remove() {
		return queArray[--nItems];
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
		for(int i = 0; i < maxSize; i++)
			System.out.println(queArray[i] + " ");
	}
	
}

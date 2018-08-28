/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue Linked List Model
 */
package Example;

public class QueueList {
	private Link first;
	private Link last;

	public QueueList() {
		first = null;
		last = null;
	}

	public void insertLast(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		if(isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}

	public void removeFirst() {
		System.out.println("Deleted Node - ");
		first.displayLink();
		System.out.println();
		if(first.next == null)
			last = null;
		first = first.next;
	}

	public boolean isEmpty() {
		if(first == null && last == null)
			return true;
		return false;
	}

	public void displayList() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else {
			System.out.println("front -> rear");
			Link current = first;
			while(current != null) {
				current.displayLink();
				current = current.next;
			}
		}
		System.out.println();
	}
}
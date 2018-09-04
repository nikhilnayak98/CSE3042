/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue Linked List Model
 */
package ProgrammingProjects;

public class QueueList {
	private Link first;
	private Link last;

	public QueueList() {
		first = null;
		last = null;
	}

	public void insert(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		if(isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}

	public void remove() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else if(first.next == null)
			last = null;
		else {
			Link current = first, tCurrent = first;
			int min = current.iData;
			while(current.next != null) {
				if(current.iData <= min) {
					min = current.iData;
					tCurrent = current;
				}
				current = current.next;
			}
			System.out.println("Temp ------ ");
			tCurrent.displayLink();
			System.out.println();
		}
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
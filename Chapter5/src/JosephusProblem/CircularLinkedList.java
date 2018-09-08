/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Singly Linked List
 */
package JosephusProblem;

public class CircularLinkedList {

	private Link first;
	private Link last;

	public CircularLinkedList() {
		first = null;
		last = null;
	}

	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		if(isEmpty()) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = first;
			last = newLink;
		}
	}

	public void insertLast(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		if(isEmpty()) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = first;
			last.next = newLink;
		}
	}

	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Link temp = first;
		first = first.next;
		System.out.println("Deleted Link - ");
		temp.displayLink();
	}

	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Link current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		System.out.println("Deleted Link - ");
		current.next.displayLink();
		last = current;
	}

	public boolean isEmpty() {
		if(first == null && last == null)
			return true;
		return false;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		System.out.print("List (first->last): ");
		Link current = first;
		while(current != last) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
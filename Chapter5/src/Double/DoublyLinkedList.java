/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Doubly Linked List
 */
package Double;

public class DoublyLinkedList {

	private Link first;
	private Link last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		if(isEmpty())
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
	}

	public void insertLast(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		Link current = first;
		newLink.next = null;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newLink;
		
		if( isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void deleteLast() {
		Link current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public Link deleteWithKey(int key) {
		Link current = first;
		Link previous = first;
		while(current.iData != key) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	public boolean isEmpty() {
		if(first == null)
			return true;
		return false;
	}

	public void find(int key) {
		Link current = first;
		int pos = 0;
		while(current.next != null) {
			pos++;
			if(current.iData == key) {
				System.out.println("Found at pos - " + pos);
				current.displayLink();
				System.out.println();
				return;
			}
			current = current.next;
		}
		System.out.println("Not found");
	}

	public Link findBookMethod(int key) {
		Link current = first;
		while(current.iData != key) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public void display() {
		System.out.print("List (first->last): ");
		Link current = first;
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
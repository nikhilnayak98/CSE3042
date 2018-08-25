/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Linked List Model
 */
package Example;

class Link {
	public int iData;
	public double dData;
	public Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
		next = null;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}

public class LinkedList {

	private Link first;

	public LinkedList() {
		first = null;
	}

	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		Link current = first;
		newLink.next = null;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newLink;
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
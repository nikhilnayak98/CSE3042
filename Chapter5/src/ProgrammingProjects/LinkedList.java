/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Linked List
 */
package ProgrammingProjects;

public class LinkedList {
	private NewLink current;
	private int nItems; 

	public LinkedList() {
		current = null;
		nItems = 0;
	}

	public boolean isEmpty() {
		if(current == null)
			return true;
		return false;
	}

	public long getItems() {
		return nItems;
	}

	public void step() {
		current = current.next;
	}

	public void insert(long value) {
		if(isEmpty()) {
			current = new NewLink(value);
			current.next = current;
		} else {
			NewLink newLink = new NewLink(value);
			newLink.next = current.next;
			current.next = newLink;
		}
		nItems++;
	}

	public void find(long value) {
		NewLink temp = current;
		for(int i = 0; i < nItems; i++) {
			if(temp.intData == value) {
				System.out.println("Found at pos " + (i + 1));
				return;
			}
			temp = temp.next;
		}
		System.out.println("Not found");
	}

	public void delete() {
		if(isEmpty()) {
			System.out.println("List is empty!");
			return;
		} else if(current.next == current) {
			current = null;
			nItems = 0;
			return;
		} else {
			NewLink temp = current.next.next;
			System.out.println("Deleted element - ");
			temp.displayLink();
			System.out.println();
			current.next = current.next.next;
			nItems--;
		}
	}
	
	public void deleteCurrent() {
		if(isEmpty()) {
			System.out.println("List is empty!");
			return;
		} else if(current.next == current) {
			current = null;
			nItems = 0;
			return;
		} else {
			for(int i = 0; i < nItems; i++) {
				current = current.next;
			}
			System.out.println("Deleted element - ");
			current.next.displayLink();
			System.out.println();
			current.next = current.next.next;
			nItems--;
		}
	}

	public NewLink peek() {
		return current;
	}

	public void display() {
		System.out.print("From current ->  ");
		NewLink start = current;
		for(int i = 0; i < nItems; i++) {
			System.out.print(start.intData + " ");
			start = start.next;
		}
		System.out.println();
	}
}

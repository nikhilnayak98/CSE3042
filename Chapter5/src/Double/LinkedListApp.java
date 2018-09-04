/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Doubly Linked List App
 */
package Double;

public class LinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertFirst(22, 2.99);
		doublyLinkedList.insertFirst(44, 4.99);
		doublyLinkedList.insertFirst(66, 6.99);
		doublyLinkedList.insertFirst(88, 8.99);
		doublyLinkedList.find(44);
		doublyLinkedList.insertLast(100, 10.99);
		doublyLinkedList.display();
	}

}

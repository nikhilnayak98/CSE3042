/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Doubly Linked List App
 */
package DoubleEndedQueue;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertLast(22, 2.99);
		doublyLinkedList.insertLast(44, 4.99);
		doublyLinkedList.insertLast(66, 6.99);
		doublyLinkedList.insertLast(88, 8.99);
		doublyLinkedList.display();
		doublyLinkedList.displayFromLast();
		doublyLinkedList.find(44);
		doublyLinkedList.insertFirst(100, 10.99);
		doublyLinkedList.display();
	}

}

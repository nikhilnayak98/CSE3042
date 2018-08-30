/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Linked List App
 */
package Double;

public class LinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.insertFirst(22, 2.99);
		linkedList.insertFirst(44, 4.99);
		linkedList.insertFirst(66, 6.99);
		linkedList.insertFirst(88, 8.99);
		linkedList.find(44);
		linkedList.insertLast(100, 10.99);
		linkedList.display();
	}

}

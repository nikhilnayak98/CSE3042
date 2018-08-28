/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue Linked List App
 */
package Example;

public class QueueListApp {
	
	public static void main(String[] args) {
		QueueList queueList = new QueueList();
		queueList.insertLast(55, 66.9);
		queueList.insertLast(54, 90.3);
		queueList.insertLast(33, 1.56);
		queueList.insertLast(5225, 21.9);
		queueList.displayList();
		queueList.removeFirst();
		queueList.displayList();
	}
}

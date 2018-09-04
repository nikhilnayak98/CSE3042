/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue Linked List App
 */
package ProgrammingProjects;

public class QueueListApp {
	
	public static void main(String[] args) {
		QueueList queueList = new QueueList();
		queueList.insert(55, 66.9);
		queueList.insert(54, 90.3);
		queueList.insert(33, 1.56);
		queueList.insert(5225, 21.9);
		queueList.displayList();
		
		queueList.remove();
		queueList.displayList();
		
		queueList.remove();
		queueList.displayList();
		
		queueList.insert(100, 20.1);
		queueList.displayList();
		
		queueList.remove();
		queueList.displayList();
	}
}

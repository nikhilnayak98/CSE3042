/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Circular Queue app
 */
package ProgrammingProjects;

public class CircularQueueApp {

	public static void main(String[] args) {
		int size = 5;
		CircularQueue circularQueue = new CircularQueue(size);
		
		circularQueue.insert(50);
		circularQueue.insertLeft(100);
		circularQueue.insertRight(200);
		circularQueue.display();
	}

}

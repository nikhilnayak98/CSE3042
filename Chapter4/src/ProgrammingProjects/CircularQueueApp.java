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
		circularQueue.insert(60);
		circularQueue.insert(70);
		circularQueue.insert(80);

		circularQueue.display();
		circularQueue.insert(90);
		
		circularQueue.display();
		circularQueue.remove();
		
		circularQueue.display();
		circularQueue.insert(45);
		
		circularQueue.display();
		circularQueue.insert(100);
		
		circularQueue.display();
		
		circularQueue.insert(102);
		
		circularQueue.remove();
		circularQueue.insert(102);
		
		circularQueue.insert(110);
		circularQueue.display();
		
		circularQueue.remove();
		circularQueue.remove();
		circularQueue.remove();
		circularQueue.remove();
		circularQueue.remove();
		circularQueue.remove();
		
		circularQueue.display();
	}

}

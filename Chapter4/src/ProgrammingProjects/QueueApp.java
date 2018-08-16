/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue app
 */
package ProgrammingProjects;

public class QueueApp {

	public static void main(String[] args) {
		int size;
		size = 5;
		Queue queue = new Queue(size);
		
		queue.insert(50);
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);
		queue.display();
		
		queue.insert(90);
		queue.display();
		
		queue.insert(100);
		
		queue.remove();
		queue.display();
		queue.remove();
		queue.display();
		queue.remove();
		queue.display();
		queue.remove();
		queue.display();
		queue.remove();
		queue.remove();
		queue.display();
	}

}

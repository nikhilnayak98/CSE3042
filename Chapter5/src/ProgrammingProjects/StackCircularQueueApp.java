/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack based Circular Queue App
 */
package ProgrammingProjects;

public class StackCircularQueueApp {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(10);
		linkedList.insert(234);
		linkedList.insert(66);
		linkedList.insert(43);
		linkedList.insert(30);
		linkedList.insert(50);
		linkedList.insert(36);
		linkedList.insert(578);
		linkedList.display();
		
		linkedList.deleteCurrent();
		linkedList.display();
		
		linkedList.find(50);
		
		linkedList.deleteCurrent();
		linkedList.display();
		
		linkedList.deleteCurrent();
		linkedList.display();
	}
}

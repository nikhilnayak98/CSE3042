/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Priority Queue app
 */
package ProgrammingProjects;

public class RevisedPriorityQueueApp {

	public static void main(String[] args) {
		RevisedPriorityQueue revisedPriorityQueue = new RevisedPriorityQueue(5);
		revisedPriorityQueue.insert(30);
		revisedPriorityQueue.insert(50);
		revisedPriorityQueue.insert(10);
		revisedPriorityQueue.insert(40);
		revisedPriorityQueue.insert(20);
		while(!revisedPriorityQueue.isEmpty()) {
			long item = revisedPriorityQueue.remove();
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
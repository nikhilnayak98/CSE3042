/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Queue app
 */
package Example;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size - ");
		size = 5; // sc.nextInt();
		CustomQueue customQueue = new CustomQueue(size);
		
		System.out.println();
		for(int i = 0; i < size; i++) {
			customQueue.insert((i + 5) * 10);
			//customQueue.insert(sc.nextLong());
		}
		
		customQueue.display();
		customQueue.remove();
		customQueue.display();
		customQueue.remove();
		customQueue.display();
		customQueue.remove();
		customQueue.display();
		customQueue.insert(100);
	}

}

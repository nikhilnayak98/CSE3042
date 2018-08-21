/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Stack app
 */
package ProgrammingProjects;

public class StackApp {

	public static void main(String[] args) {
		int size = 5;
		StackX stackX = new StackX(size);
		
		stackX.push(50);
		stackX.pushDown(100);
		stackX.display();

	}

}

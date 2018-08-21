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
		
		stackX.pushTop(50);
		stackX.pushTop(40);
		stackX.pushTop(60);
		stackX.pushTop(20);
		stackX.display();
		stackX.popDown();
		stackX.display();
		stackX.popTop();
		stackX.display();
	}

}

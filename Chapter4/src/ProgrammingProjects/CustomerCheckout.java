/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Customer Checkout
 */
package ProgrammingProjects;

import java.util.Scanner;

public class CustomerCheckout {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, temp = -1;
		System.out.println("Enter number of customers");
		size = sc.nextInt();
		CustomerQueue customerQueue = new CustomerQueue(size); 
		while(temp != 0) {
			displayMessages();
			temp = sc.nextInt();
			if(temp == 1) {
				customerQueue.insert();
			} else if(temp == 2) {
				customerQueue.remove();
			} else if(temp == 3) {
				customerQueue.display();
			} else {
				System.out.println("Wrong input");
				temp = sc.nextInt();
			}
		}
	}
	
	public static void displayMessages() {
		System.out.println();
		System.out.println("1. Add customer");
		System.out.println("2. Checkout customer");
		System.out.println("3. Disply queue");
	}

}

/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Customer Queue
 */
package ProgrammingProjects;

import java.util.Scanner;

public class CustomerQueue {
	private int maxSize;
	private Customer customer[];
	private int front;
	private int rear;
	private int nCustomers;

	public CustomerQueue(int size) {
		maxSize = size;
		customer = new Customer[maxSize];
		front = 0;
		rear = -1;
		nCustomers = 0;
	}

	public void insert() {
		Scanner sc = new Scanner(System.in);
		if(isFull()) {
			System.out.println("Line is full");
			return;
		}
		if(rear == maxSize - 1)
			rear = -1;
		String name;
		double grocerySize;
		System.out.println("Enter name of customer");
		name = sc.next();
		System.out.println("Enter grocery size");
		grocerySize = sc.nextDouble();
		customer[++rear] = new Customer();
		customer[rear].setName(name);
		customer[rear].setGrocerySize(grocerySize);
		nCustomers++;
	}

	public void remove() {
		if(isEmpty()) {
			System.out.println("No customers in line");
			return;
		}
		String removedCustomer = customer[front].getName();
		System.out.println("Customer checkout - " +  removedCustomer);
		front++;
		if(front == maxSize)
			front = 0;
		nCustomers--;
	}

	public void peekFront() {
		System.out.println("First Cusomter Name - " + customer[front].getName());
		System.out.println("Grocery Size- " + customer[front].getGrocerySize());
		return;
	}

	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		if(nCustomers == 0)
			return true;
		return false;
	}

	public boolean isFull() {
		if(rear == maxSize - 1)
			return true;
		if(nCustomers == maxSize)
			return true;
		return false;
	}

	public int size() {
		return nCustomers;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else if(rear >= front) {
			for(int i = front; i <= rear; i++) {
				System.out.println(customer[i].getName());
			}
			System.out.println();
		} else if(front <= rear) {
			for(int i = rear; i <= front; i++) {
				System.out.println(customer[i].getName());
			}
			System.out.println();
		}
	}
	
	public void displayRev() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else if(rear >= front) {
			for(int i = rear; i >= front; i--) {
				System.out.println(customer[i].getName());
			}
			System.out.println();
		} else if(front <= rear) {
			for(int i = front; i >= rear; i--) {
				System.out.println(customer[i].getName());
			}
			System.out.println();
		}
	}

}

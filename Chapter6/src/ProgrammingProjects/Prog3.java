/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Raising power using recursion
 */
package ProgrammingProjects;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x - ");
		int x = sc.nextInt();
		System.out.println("Enter y - ");
		int y = sc.nextInt();
		System.out.println(x + " ^ " + y + " = " + power(x, y));
	}

	public static int power(int x, int y) {
		if(y == 1) {
			return x;
		} else if(y % 2 == 0) {
			System.out.println("power() called");
			return power(x * x, y / 2);
		} else {
			System.out.println("power() called");
			return x * power(x, y - 1);
		}
	}

}

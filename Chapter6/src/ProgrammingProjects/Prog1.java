/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Multiplication using recursion
 */
package ProgrammingProjects;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x - ");
		int x = sc.nextInt();
		System.out.println("Enter y - ");
		int y = sc.nextInt();
		System.out.println(x + " x " + y + " = " + mult(x, y));
	}

	public static int mult(int x, int y) {
		while(y != 0) {
			return x + mult(x, y - 1);
		}
		return 0;
	}

}

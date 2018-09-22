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
		power(x, y);
		System.out.println(x + " ^ " + y + " = ");
	}

	public static void power(int x, int y) {
		while(y != 1) {
			x *=  x;
			y /= 2;
			power(x, y);
		}
		if(y == 1) {
			System.out.println(x);
			return;
		}
	}

}

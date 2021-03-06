/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Triangular numbers
 */
package Examples;

import java.util.Scanner;

public class TriangleApp {

	static int number;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		int answer = triangle(number);
		System.out.println("Triangle = " + answer);
	}

	public static int triangle(int n) {
		if(n == 1)
			return 1;
		else
			return (n + triangle(n - 1));
	}
	
}

/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Permutation
 */
package ProgrammingProjects;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter group size (n) - ");
		int n = sc.nextInt();
		System.out.println("Enter team size (k) - ");
		int k = sc.nextInt();
		System.out.println(n);
		System.out.println(" C");
		System.out.println("  " + k);
		showTeams(n, k);
	}

	public static void showTeams(int n, int k) {
		System.out.println("Number of possible combinations = "
				+ (factorial(n) / (factorial(n - k) * factorial(k))));
	}

	public static int factorial(int n) {
		while(n != 0) {
			return n * factorial(n - 1);
		}
		return 1;
	}

}

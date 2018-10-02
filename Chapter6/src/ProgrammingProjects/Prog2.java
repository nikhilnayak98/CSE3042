/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Binary tree using recursion
 */
package ProgrammingProjects;

import java.util.Scanner;

public class Prog2 {

	public static char[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines - ");
		int lines = sc.nextInt();
		int characters = (int) Math.pow(2, lines - 1); // symmetrical if: characters = Math.pow(2, lines) - 1
		arr = new char[characters];
		for (int i = 0; i < lines; i++) {
			makeBranches(0, characters - 1, (int) Math.pow(2, i));
			display();
		}
	}

	public static void makeBranches(int left, int right, int nodes) {
		int center = (left + right) / 2;
		if(nodes == 1) {
			arr[center] = 'X';
			for(int i = left; i < center; i++)
				arr[i] = '-';

			for(int i = center + 1; i <= right; i++)
				arr[i] = '-';
		} else {
			makeBranches(left, center, nodes / 2);
			makeBranches(center + 1, right, nodes / 2);
		}
	}

	public static void display() {
		String s = String.valueOf(arr);
		System.out.println(s);
	}
}

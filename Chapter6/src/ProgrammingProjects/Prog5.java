/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Permutation
 */
package ProgrammingProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Prog5 {

	public static char[] seq;
	public static int seqIndex = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int groupSize, teamSize;
		System.out.println("Enter group size - ");
		groupSize = sc.nextInt();
		System.out.println("Enter team size - ");
		teamSize = sc.nextInt();
		seq = new char[teamSize];
		System.out.println("Number of possible combinations = "
				+ (factorial(groupSize) / (factorial(groupSize - teamSize) * factorial(teamSize))));
		System.out.println("Combinations - ");
		showTeams(groupSize, teamSize, 'A');
	}

	public static void showTeams(int groupSize, int teamSize, char layer) {
		if (groupSize == 0 || teamSize == 0 || teamSize > groupSize)
			return;
		else {
			// left branch
			seq[seqIndex++] = layer;
			showTeams(groupSize - 1, teamSize - 1, (char)(layer + 1));
			seqIndex--;

			// right branch
			if (teamSize == 1) {
				seq[seqIndex] = layer;
				System.out.println(Arrays.toString(seq));
			}
			showTeams(groupSize - 1, teamSize, (char)(layer + 1));
		}
	}

	public static int factorial(int n) {
		while(n != 0) {
			return n * factorial(n - 1);
		}
		return 1;
	}
}
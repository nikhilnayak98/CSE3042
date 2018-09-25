/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Knapsack
 */
package ProgrammingProjects;

public class Prog2 {

	public static double[] sack;

	public static void main(String[] args) {
		sack = new double[]{11, 8, 7, 6, 5};
		if(!knapsack(20,0))
			System.out.println("No Combinations");		
	}

	public static boolean knapsack(double targetWeight, int index) {
		boolean complete = false;	
		if(index == sack.length) 
			return false;

		if(sack[index] == targetWeight) {
			System.out.print("Answer: " + sack[index] + " ");
			complete = true;
		}

		if(sack[index] < targetWeight) {
			complete = knapsack(targetWeight - sack[index], index + 1);
			if(complete) 
				System.out.print(sack[index] + " ");
			for(int i = index + 1; i < sack.length; i++) {
				if(!complete) 
					complete = knapsack(targetWeight, i);
			}
		}
		if(sack[index] > targetWeight)
			complete = knapsack(targetWeight, index + 1);
		return complete;
	}
}

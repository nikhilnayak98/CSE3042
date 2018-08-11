/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Reverse a string using stack
 */
package Example;

import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string - ");
		input = sc.next();
		Reverser reverser = new Reverser(input);
		System.out.println("Reversed string - " + reverser.doRev());
	}

}

class Reverser {
	private String input;
	private String output;

	public Reverser(String in) {
		input = in;
	}

	public String doRev() {
		int size = input.length();
		StackX stackX = new StackX(size);

		for(int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			stackX.push(ch);
		}

		output = "";

		while(!stackX.isEmpty()) {
			char ch = stackX.pop();
			output = output + ch;
		}
		return output;
	}

}

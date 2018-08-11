/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Matching brackets using stack
 */
package Example;

import java.util.Scanner;

public class BracketsApp {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string - ");
		input = sc.next(); // "a{b(c[d]e)f}";
		BracketMatcher bracketMatcher = new BracketMatcher(input);
		bracketMatcher.doBracketMatch();
	}

}

class BracketMatcher {
	private String input;

	public BracketMatcher(String in) {
		input = in;
	}

	public void doBracketMatch() {
		int size = input.length();
		StackX stackX = new StackX(size);
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			switch(ch) {
			case '{':
			case '[':
			case '(':
				stackX.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!stackX.isEmpty()) {
					char chX = stackX.pop();
					if((ch == '}' && chX != '{') || (ch == ']' && chX != '[') || (ch == ')' && chX != '(')) {
						System.out.println("Error");
					} else {
						System.out.println("Correct");
						break;
					}
				}
			default:
				break;
			}
		}
		
		if(!stackX.isEmpty()) {
			System.out.println("Missing right bracket");
		}
	}
}

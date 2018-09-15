/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Josephus Problem
 */

package JosephusProblem;
import java.util.Scanner;

public class JosephusProblem {

	private Person head;

	public static void main(String[] args) {
		int n, k ;           
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of people, at least 2 - ");
		n = sc.nextInt();
		if(n < 2) {
			System.out.println("Enter people > 2");
			return;
		}
		System.out.println("Enter spacing of victims, between 1 and n - ");
		k = sc.nextInt();
		if(k < 1 || k > n) {
			System.out.println("Spacing should be between 1 and n");
			return;
		}
		System.out.println();
		new JosephusProblem(n, k);
	}

	public JosephusProblem(int n, int k) {
		start(n);
		remove(k, n);
	}

	public void start(int n) {
		Person tempPerson = null;
		if(n < 2){
			System.out.println("Parameter must be at least 2");
			return;
		}

		for(int i = 1; i < n + 1; i++) {
			Person person = new Person(n);
			person.data = i;
			if(i == 1) {
				head = person;
				tempPerson = person;
				continue;
			}
			tempPerson.next = person;
			person.previous = tempPerson;
			tempPerson = person;

			if(i == n) {
				person.next = head;
				head.previous = person;
				continue;
			}
		}
	}

	public void remove(int k, int n) {
		Person x; 
		int i = 0;
		for(x = head; x.next != x && x.previous != x; x = x.next) {
			if(i == k) {
				x.previous.next = x.next;
				x.next.previous = x.previous;
				System.out.println("Person at pos " + x.data + " executed(DEAD)");
				i = 0;
				continue;
			}
			i++;
		}
		System.out.println("Last person ALIVE is at pos " + x.data);
	}
}

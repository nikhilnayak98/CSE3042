/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Person Model
 */
package JosephusProblem;

public class Person {

	public int data;                 
	public Person next;           
	public Person previous;       

	public Person(int number) {
		next = previous = null; 
		data = number;              
	}
}

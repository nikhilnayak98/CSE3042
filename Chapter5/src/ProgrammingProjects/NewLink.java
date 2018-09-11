/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: New Link/Node Model for Circular Queue
 */
package ProgrammingProjects;

public class NewLink {
	public long intData;
	public NewLink next;

	public NewLink(long value) {
		intData = value;
	}

	public void displayLink() {
		System.out.print("{" + intData + "} ");
	}
}

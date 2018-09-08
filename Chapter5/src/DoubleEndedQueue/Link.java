/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Link/Node Model
 */
package DoubleEndedQueue;

public class Link {
	public int iData;
	public double dData;
	public Link next;
	public Link previous;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
		this.next = null;
		this.previous = null;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}

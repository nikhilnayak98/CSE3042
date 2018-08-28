/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Link/Node Model
 */
package Example;

public class Link {
	public int iData;
	public double dData;
	public Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
		next = null;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}
}

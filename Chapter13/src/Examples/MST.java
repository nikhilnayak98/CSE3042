/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: MST App
 */
package Examples;

public class MST {

	public static void main(String args[]) {
		Graph graph = new Graph("mst");
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		System.out.print("Minimum spanning tree: ");
		graph.mst();
		System.out.println();
	}
}


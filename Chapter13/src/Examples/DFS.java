/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: DFS App
 */
package Examples;

public class DFS {

	public static void main(String args[]) {
		Graph graph = new Graph("dfs");
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		System.out.print("Visits : ");
		graph.dfs();
		System.out.println();
	}
}

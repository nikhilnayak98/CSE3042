/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: BFS App
 */
package Examples;

public class BFS {

	public static void main(String args[]) {
		Graph gr = new Graph("bfs");
		gr.addVertex('A');
		gr.addVertex('B');
		gr.addVertex('C');
		gr.addVertex('D');
		gr.addVertex('E');
		gr.addEdge(0, 1);
		gr.addEdge(1, 2);
		gr.addEdge(2, 3);
		gr.addEdge(3, 4);
		System.out.print("Visits : ");
		gr.bfs();
		System.out.println();
	}
}
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

public class BFSClient
{

	public static void main(String[] args)
	{
		Graph graph = new Graph();

		// add vertex
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		// add edge
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 4);
		graph.addEdge("C", "D", 7);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 9);
		graph.addEdge("E", "G", 8);
		graph.addEdge("F", "G", 6);

		// display
		graph.display();
		/*
		 * ---------------------------------------------------------------------
		 * Vertex Neighbors
		 * A : {B=2, D=3}
		 * B : {A=2, C=4}
		 * C : {B=4, D=7}
		 * D : {A=3, C=7, E=10}
		 * E : {D=10, F=9, G=8}
		 * F : {E=9, G=6}
		 * G : {E=8, F=6}
		 * ---------------------------------------------------------------------
		 */
		// BFS Client
		// BFS gives shortest path for unweighted graph
		graph.bfsDisplay("A");
		/*
		 * ---------------------------------------------------------------------
		 * A, B, D, C, E, F, G, END
		 * ---------------------------------------------------------------------
		 */

		// bfs(v1,v2)
		System.out.println(graph.bfs("A", "G"));
		/*
		 * ADEG
		 * true
		 */

		// bft
		graph.bft();
		/*
		 * ---------------------------------------------------------------------
		 * Reaching A via A
		 * Reaching B via AB
		 * Reaching D via AD
		 * Reaching C via ABC
		 * Reaching C via ADC
		 * Reaching E via ADE
		 * Reaching F via ADEF
		 * Reaching G via ADEG
		 * Reaching G via ADEFG
		 * ---------------------------------------------------------------------
		 */
		graph.removeEdge("D", "E");
		graph.bft();
		/*
		 * ---------------------------------------------------------------------
		 * Reaching A via A
		 * Reaching B via AB
		 * Reaching D via AD
		 * Reaching C via ABC
		 * Reaching C via ADC
		 * Reaching E via E
		 * Reaching F via EF
		 * Reaching G via EG
		 * Reaching G via EFG
		 * ---------------------------------------------------------------------
		 */

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

import java.util.HashMap;

public class DijkstraClient
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
		graph.addEdge("A", "D", 10);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 6);
		graph.addEdge("F", "G", 4);

		// display
		graph.display();
		/*
		 * ---------------------------------------------------------------------
		 * Vertex Neighbors
		 * A : {B=2, D=10}
		 * B : {A=2, C=3}
		 * C : {B=3, D=1}
		 * D : {A=10, C=1, E=8}
		 * E : {D=8, F=5, G=6}
		 * F : {E=5, G=4}
		 * G : {E=6, F=4}
		 * ---------------------------------------------------------------------
		 */

		 HashMap<String, Integer> sssp = graph.dijsktra("A");
		 System.out.println(sssp);
		 //{A=0, B=2, C=5, D=6, E=14, F=19, G=20}

		 

	}

}

/* https://github.com/shahiddhariwala */
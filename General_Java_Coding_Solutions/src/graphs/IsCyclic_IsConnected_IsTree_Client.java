/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

import java.util.ArrayList;

public class IsCyclic_IsConnected_IsTree_Client
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

		// isCyclic
		System.out.println(graph.isCyclic());
		// true
		graph.removeEdge("B", "C");
		System.out.println(graph.isCyclic());
		graph.removeEdge("F", "G");
		System.out.println(graph.isCyclic());
		/*
		 * true
		 * true
		 * false
		 */

		graph.addEdge("B", "C", 4);
		graph.addEdge("F", "G", 6);
		// isConnected
		System.out.println(graph.isConnected());
		graph.removeEdge("D", "E");
		System.out.println(graph.isConnected());
		/*
		 * true
		 * false
		 */

		// get connected components
		System.out.println(graph.getConnectedComponent());
		graph.addVertex("X");
		System.out.println(graph.getConnectedComponent());
		graph.removeVertex("X");
		/*
		 * [[A, B, D, C], [E, F, G]]
		 * [[A, B, D, C], [E, F, G], [X]]
		 */

		// IsTree
		// Tree is acyclic & single connected graph && also evert tree has N-1 edges
		System.out.println(graph.isTree());
		graph.addEdge("D", "E", 10);
		graph.removeEdge("B", "C");
		graph.removeEdge("F", "G");
		System.out.println(graph.isTree());
		/*
		 * false
		 * true
		 */

	}

}

/* https://github.com/shahiddhariwala */
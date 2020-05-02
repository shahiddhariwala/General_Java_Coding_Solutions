/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

public class DFSClient
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

		System.out.println(graph.dfs("A", "G"));
		/*
		 * ---------------------------------------------------------------------
		 * ADEG
		 * true
		 */

		graph.dft();
		/*
		 * ---------------------------------------------------------------------
		 * Reaching A via A
		 * Reaching D via AD
		 * Reaching E via ADE
		 * Reaching G via ADEG
		 * Reaching F via ADEGF
		 * Reaching C via ADC
		 * Reaching B via ADCB
		 * ---------------------------------------------------------------------
		 */

		graph.removeEdge("D", "E");
		graph.dft();
		/*
		 * ---------------------------------------------------------------------
		 * Reaching A via A
		 * Reaching D via AD
		 * Reaching C via ADC
		 * Reaching B via ADCB
		 * ---------------------------------------------------------------------
		 * Reaching E via E
		 * Reaching G via EG
		 * Reaching F via EGF
		 * ---------------------------------------------------------------------
		 */
	}

}

/* https://github.com/shahiddhariwala */
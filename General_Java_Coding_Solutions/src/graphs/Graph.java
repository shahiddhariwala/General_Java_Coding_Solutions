/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph
{

	private class Vertex
	{
		HashMap<String, Integer> neighbors = new HashMap<>();
	}

	HashMap<String, Vertex> vertices;

	public Graph()
	{
		vertices = new HashMap<String, Vertex>();
	}

	public int numVertex()
	{
		return this.vertices.size();
	}

	public boolean containsVertex(String vertexName)
	{
		return this.vertices.containsKey(vertexName);
	}

	public void addVertex(String vertexName)
	{
		Vertex vtx = new Vertex();
		vertices.put(vertexName, vtx);
	}

	public void removeVertex(String vertexName)
	{
		Vertex currentVertex = this.vertices.get(vertexName);
		if (currentVertex != null)
		{
			// if vertex exists
			ArrayList<String> keys = new ArrayList<>(currentVertex.neighbors.keySet());
			for (String key : keys)
			{
				this.vertices.get(key).neighbors.remove(vertexName);
			}
			this.vertices.remove(vertexName);
		}
	}

	public int numEdges()
	{
		int count = 0;
		Set<Map.Entry<String, Vertex>> entrySet = this.vertices.entrySet();
		for (Map.Entry<String, Vertex> entry : entrySet)
		{
			count = count + entry.getValue().neighbors.size();
		}
		return count >> 1;
	}

	public boolean containsEdge(String parentVertex, String possibleNeighbor)
	{
		Vertex pv = this.vertices.get(parentVertex);
		if (pv == null)
		{
			// Vertex doesnot exist
			return false;
		}
		return pv.neighbors.containsKey(possibleNeighbor);
	}

	public void addEdge(String v1, String v2, int cost)
	{
		Vertex vertex1 = this.vertices.get(v1);
		Vertex vertex2 = this.vertices.get(v2);
		if (vertex1 == null || vertex2 == null || vertex1.neighbors.containsKey(v2))
		{
			// return
			return;
		}

		vertex1.neighbors.put(v2, cost);
		vertex2.neighbors.put(v1, cost);

	}

	public void removeEdge(String v1, String v2)
	{
		Vertex vertex1 = this.vertices.get(v1);
		Vertex vertex2 = this.vertices.get(v2);
		if (vertex1 == null || vertex2 == null || !vertex1.neighbors.containsKey(v2))
		{
			// return
			return;
		}

		vertex1.neighbors.remove(v2);
		vertex2.neighbors.remove(v1);

	}

	public void display()
	{
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Vertex\tNeighbors");
		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());
		for (String key : keys)
		{
			Vertex currentVertex = this.vertices.get(key);
			System.out.println(key + " : \t" + currentVertex.neighbors);
		}
		System.out.println("---------------------------------------------------------------------");
	}

	public boolean hasPath(String sourceVertex, String destinationVertex, HashMap<String, Boolean> processed)
	{

		Vertex sv = this.vertices.get(sourceVertex);
		Vertex dv = this.vertices.get(destinationVertex);
		if (sv == null || dv == null)
		{
			// vertex does not exist
			return false;
		}

		processed.put(sourceVertex, true);
		if (this.containsEdge(sourceVertex, destinationVertex))
		{
			// checking direct edge
			return true;
		}

		// Traverse Neighbors
		ArrayList<String> keys = new ArrayList<>(sv.neighbors.keySet());
		for (String key : keys)
		{
			// if Node is not processed , then recurs, this is done to avoid the infinite
			// recursion
			if (!processed.containsKey(key) && this.hasPath(key, destinationVertex, processed))
			{
				return true;
			}
		}
		return false;

	}

	public boolean hasPath(String sourceVertex, String destinationVertex)
	{

		return this.hasPath(sourceVertex, destinationVertex, new HashMap<String, Boolean>());
	}

	public void bfsDisplay(String sourceVertex)
	{
		// we will be getting all nodes from this source in bfs fashion
		if (this.containsVertex(sourceVertex))
		{
			HashMap<String, Boolean> processed = new HashMap<String, Boolean>();
			Queue<String> q = new LinkedList<String>();
			StringBuilder stringSoFar = new StringBuilder();
			q.add(sourceVertex);
			while (!q.isEmpty())
			{
				String key = q.remove();
				if (!processed.containsKey(key))
				{
					stringSoFar.append(key + ", ");
					Vertex keyVertex = this.vertices.get(key);
					processed.put(key, true);
					ArrayList<String> neighbors = new ArrayList<String>(keyVertex.neighbors.keySet());
					for (String neighbor : neighbors)
					{

						q.add(neighbor);

					}
				}

			}
			stringSoFar.append("END");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(stringSoFar.toString());
			System.out.println("---------------------------------------------------------------------");
		} else
		{
			System.out.println("Vertex does not Exist");
		}
	}

	private class Pair
	{

		String vertexName;
		String pathSoFar;
	}

	public boolean bfs(String sourceVertex, String destinationVertex)
	{
		HashMap<String, Boolean> processed = new HashMap<>();

		Queue<Pair> queue = new LinkedList<>();

		// create a new pair
		Pair sp = new Pair();
		sp.vertexName = sourceVertex;
		sp.pathSoFar = sourceVertex;

		// put the new pair in queue
		queue.add(sp);

		// while queue is not empty keep on doing the work
		while (!queue.isEmpty())
		{

			// remove a pair from queue
			Pair rp = queue.remove();

			if (processed.containsKey(rp.vertexName))
			{
				continue;
			}

			// processed put
			processed.put(rp.vertexName, true);

			// direct edge
			if (containsEdge(rp.vertexName, destinationVertex))
			{
				System.out.println(rp.pathSoFar + destinationVertex);
				return true;
			}

			// nighbors
			Vertex rpvtx = this.vertices.get(rp.vertexName);
			ArrayList<String> neighbors = new ArrayList<>(rpvtx.neighbors.keySet());

			// loop on nbrs
			for (String neighbor : neighbors)
			{

				// process only unprocessed nbrs
				if (!processed.containsKey(neighbor))
				{

					// make a new pair of nbr and put in queue
					Pair np = new Pair();
					np.vertexName = neighbor;
					np.pathSoFar = rp.pathSoFar + neighbor;

					queue.add(np);
				}
			}

		}

		return false;

	}

	public void bft()
	{

		HashMap<String, Boolean> processed = new HashMap<>();

		Queue<Pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(this.vertices.keySet());

		System.out.println("---------------------------------------------------------------------");
		for (String key : keys)
		{

			if (processed.containsKey(key))
			{
				continue;
			}
			// create a new pair
			Pair sp = new Pair();
			sp.vertexName = key;
			sp.pathSoFar = key;

			// put the new pair in queue
			queue.add(sp);

			// while queue is not empty keep on doing the work
			while (!queue.isEmpty())
			{

				// remove a pair from queue
				Pair rp = queue.remove();

				// processed put
				processed.put(rp.vertexName, true);

				// syso
				System.out.println("Reaching " + rp.vertexName + " via " + rp.pathSoFar);

				// neighbors
				Vertex rpvtx = this.vertices.get(rp.vertexName);
				ArrayList<String> neighbors = new ArrayList<>(rpvtx.neighbors.keySet());

				// loop on nbrs
				for (String neighbor : neighbors)
				{

					// process only unprocessed nbrs
					if (!processed.containsKey(neighbor))
					{

						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vertexName = neighbor;
						np.pathSoFar = rp.pathSoFar + neighbor;

						queue.add(np);
					}
				}

			}
		}
		System.out.println("---------------------------------------------------------------------");
	}

	public boolean dfs(String sourceVertex, String destinationVertex)
	{
		HashMap<String, Boolean> processed = new HashMap<>();

		Stack<Pair> stack = new Stack<>();

		// create a new pair
		Pair sp = new Pair();
		sp.vertexName = sourceVertex;
		sp.pathSoFar = sourceVertex;

		// put the new pair in queue
		stack.push(sp);

		// while queue is not empty keep on doing the work
		while (!stack.isEmpty())
		{

			// remove a pair from stack
			Pair rp = stack.pop();

			if (processed.containsKey(rp.vertexName))
			{
				continue;
			}

			// processed put
			processed.put(rp.vertexName, true);

			// direct edge
			if (containsEdge(rp.vertexName, destinationVertex))
			{
				System.out.println(rp.pathSoFar + destinationVertex);
				return true;
			}

			// neighbors
			Vertex rpvtx = this.vertices.get(rp.vertexName);
			ArrayList<String> neighbors = new ArrayList<>(rpvtx.neighbors.keySet());

			// loop on nbrs
			for (String neighbor : neighbors)
			{

				// process only unprocessed nbrs
				if (!processed.containsKey(neighbor))
				{

					// make a new pair of nbr and put in queue
					Pair np = new Pair();
					np.vertexName = neighbor;
					np.pathSoFar = rp.pathSoFar + neighbor;

					stack.push(np);
				}
			}

		}

		return false;

	}

	public void dft()
	{
		HashMap<String, Boolean> processed = new HashMap<>();
		ArrayList<String> keys = new ArrayList<String>(this.vertices.keySet());

		System.out.println("---------------------------------------------------------------------");
		for (String key : keys)
		{

			Stack<Pair> stack = new Stack<>();
			if (processed.containsKey(key))
			{
				continue;
			}

			// create a new pair
			Pair sp = new Pair();
			sp.vertexName = key;
			sp.pathSoFar = key;

			// put the new pair in queue
			stack.push(sp);

			// while queue is not empty keep on doing the work
			while (!stack.isEmpty())
			{

				// remove a pair from stack
				Pair rp = stack.pop();

				if (processed.containsKey(rp.vertexName))
				{
					continue;
				}

				// processed put
				processed.put(rp.vertexName, true);

				// syso
				System.out.println("Reaching " + rp.vertexName + " via " + rp.pathSoFar);

				// neighbors
				Vertex rpvtx = this.vertices.get(rp.vertexName);
				ArrayList<String> neighbors = new ArrayList<>(rpvtx.neighbors.keySet());

				// loop on nbrs
				for (String neighbor : neighbors)
				{

					// process only unprocessed nbrs
					if (!processed.containsKey(neighbor))
					{

						// make a new pair of nbr and put in queue
						Pair np = new Pair();
						np.vertexName = neighbor;
						np.pathSoFar = rp.pathSoFar + neighbor;

						stack.push(np);
					}
				}

			}

			System.out.println("---------------------------------------------------------------------");
		}
	}
}

/* https://github.com/shahiddhariwala */
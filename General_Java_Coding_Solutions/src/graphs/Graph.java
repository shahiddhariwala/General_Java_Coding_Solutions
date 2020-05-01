/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
			//if Node is not processed , then recurs, this is done to avoid the infinite recursion
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
}

/* https://github.com/shahiddhariwala */
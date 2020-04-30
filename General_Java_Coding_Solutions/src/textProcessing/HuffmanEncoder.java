/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package textProcessing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanEncoder
{
	private HashMap<Character, String> encoder;
	private HashMap<String, Character> decoder;

	private class Node implements Comparable<Node>
	{
		char data;
		Node left;
		Node right;
		int cost;

		Node(char data, int cost)
		{
			this.data = data;
			left = null;
			right = null;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o)
		{

			return this.cost - o.cost;
		}
	}

	HuffmanEncoder(String feeder)
	{
		// 1.Get Max Frequency of each character in hashmap
		HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (char c : feeder.toCharArray())
		{
			if (freqMap.containsKey(c))
			{
				int oldValue = freqMap.get(c);
				freqMap.put(c, oldValue + 1);

			} else
			{
				freqMap.put(c, 1);
			}
		}
		// 2. Create the MinHeap of Trees
		PriorityQueue<Node> minHeap = new PriorityQueue<Node>();
		Set<Map.Entry<Character, Integer>> entrySet = freqMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet)
		{
			Node node = new Node(entry.getKey(), entry.getValue());
			minHeap.add(node);
		}

		// 3. Generate Huffman Tree , Combine nodes untill one node is left in minHeap
		while (minHeap.size() != 1)
		{
			Node n1 = minHeap.remove();
			Node n2 = minHeap.remove();
			Node combined = new Node('\0', n1.data + n2.data);
			combined.left = n1;
			combined.right = n2;
			minHeap.add(combined);
		}

		// 4. Init endCOder and encoder
		Node fullTree = minHeap.remove();
		this.encoder = new HashMap<>();
		this.decoder = new HashMap<>();
		this.initEncoderDecoder(fullTree, "");

	}

	private void initEncoderDecoder(Node node, String stringSoFar)
	{
		if (node == null)
		{
			return;
		}
		if (node.left == null && node.right == null)
		{
			this.encoder.put(node.data, stringSoFar);
			this.decoder.put(stringSoFar, node.data);
		}
		this.initEncoderDecoder(node.left, stringSoFar + "0");
		this.initEncoderDecoder(node.right, stringSoFar + "1");

	}

	public String encode(String source)
	{
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < source.length(); i++)
		{
			String code = this.encoder.get(source.charAt(i));
			res.append(code);
		}
		return res.toString();
	}

	public String decode(String codeString)
	{
		StringBuilder res = new StringBuilder();
		String key = "";
		for (int i = 0; i < codeString.length(); i++)
		{
			key = key + codeString.charAt(i);
			if (this.decoder.containsKey(key))
			{
				res.append(this.decoder.get(key));
				key = "";
			}

		}
		return res.toString();
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package textProcessing;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Tries
{
	private Node root;
	private int size;

	private class Node
	{
		char data;
		// Using tree map to keep hahsmap in sorted order
		TreeMap<Character, Node> childrens;
		boolean isEndOfWord;

		Node(char data)
		{
			this.data = data;
			childrens = new TreeMap<>();
			isEndOfWord = false;
		}
	}

	public Tries()
	{
		this.root = new Node('\0');
		this.size = 0;
	}

	public void add(String str)
	{
		this.add(this.root, str);
	}

	private void add(Node parentNode, String wordSoFar)
	{
		if (wordSoFar.length() == 0)
		{
			if (parentNode.isEndOfWord == false)
			{
				parentNode.isEndOfWord = true;
				this.size++;
			}
			return;
		}
		char currentChar = wordSoFar.charAt(0);
		Node childNode = parentNode.childrens.get(currentChar);
		if (childNode == null)
		{
			childNode = new Node(currentChar);
			parentNode.childrens.put(currentChar, childNode);

		}
		this.add(childNode, wordSoFar.substring(1));
	}

	public void display()
	{
		this.display(this.root, "");
	}

	private void display(Node parentNode, String wordSoFar)
	{
		if (parentNode.isEndOfWord == true)
		{
			System.out.println(wordSoFar);
		}

		Set<Map.Entry<Character, Node>> entries = parentNode.childrens.entrySet();
		for (Map.Entry<Character, Node> entry : entries)
		{
			this.display(entry.getValue(), wordSoFar + entry.getKey());
		}
	}

	public int size()
	{
		return this.size;
	}

	public int numWords()
	{

		return this.size();
	}

	public boolean search(String string)
	{

		return this.search(this.root, string);
	}

	private boolean search(Node parentNode, String wordSoFar)
	{
		if (wordSoFar.length() == 0)
		{
			return parentNode.isEndOfWord;
		}

		char currentChar = wordSoFar.charAt(0);
		if (parentNode.childrens.containsKey(currentChar))
		{
			return this.search(parentNode.childrens.get(currentChar), wordSoFar.substring(1));
		}
		return false;
	}

	public void remove(String word)
	{
		this.remove(this.root, word);

	}

	private void remove(Node parentNode, String wordSoFar)
	{
		if (wordSoFar.length() == 0)
		{
			if (parentNode.isEndOfWord == false)
			{
				// word does not exists
			} else
			{
				// word exist
				parentNode.isEndOfWord = false;
				this.size--;

			}
			return;
		}

		char currentChar = wordSoFar.charAt(0);
		String restOfWord = wordSoFar.substring(1);
		Node child = parentNode.childrens.get(currentChar);
		if(child==null)
		{
			//char-word does not exist
			return;
		}
		this.remove(child,restOfWord);
		if(child.childrens.size()==0 && child.isEndOfWord==false)
			parentNode.childrens.remove(currentChar);
	}
}

/* https://github.com/shahiddhariwala */
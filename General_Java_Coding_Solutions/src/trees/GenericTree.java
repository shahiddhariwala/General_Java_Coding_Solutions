/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree
{

	private Node root;
	private int size;

	private class Node
	{
		ArrayList<Node> childrens;
		int data;

		public Node(int data)
		{
			this.data = data;
			childrens = new ArrayList<Node>();
		}
	}

	GenericTree()
	{
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, 0);
	}

	private Node takeInput(Scanner sc, Node parent, int ithChild)
	{
		if (parent == null)
		{
			System.out.println("Enter the data of root Node");
		} else
		{
			System.out.printf("Enter the data of child:%d of %d\n", ithChild + 1, parent.data);
		}
		int nodeData = sc.nextInt();
		Node node = new Node(nodeData);
		this.size++;
		System.out.println("Enter the Number of Children of " + nodeData);
		int numChild = sc.nextInt();
		for (int i = 0; i < numChild; i++)
		{
			Node child = this.takeInput(sc, node, i);
			node.childrens.add(child);
		}
		return node;
	}

	public void display()
	{
		this.display(this.root);
	}

	private void display(Node tempNode)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(tempNode.data + " => \t");

		for (Node children : tempNode.childrens)
		{
			sb.append(children.data + ", ");
		}
		sb.append("END");
		System.out.println(sb.toString());
		for (Node children : tempNode.childrens)
		{
			this.display(children);
		}
	}

}

/* https://github.com/shahiddhariwala */
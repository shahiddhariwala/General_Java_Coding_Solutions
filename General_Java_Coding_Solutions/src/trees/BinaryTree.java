/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree
{

	private Node root;
	private int size;

	private class Node
	{
		int data;
		Node left;
		Node right;

		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public BinaryTree()
	{
		Scanner sc = new Scanner(System.in);
		this.root = this.takeInput(sc, null, false);
		sc.close();
	}

	private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight)
	{
		if (parent == null)
		{
			System.out.println("Enter the data of root node ");
		} else
		{
			if (isLeftOrRight)
			{
				System.out.println("Enter the data of left child of " + parent.data);
			} else
			{
				System.out.println("Enter the data of right child of " + parent.data);
			}
		}
		int nodeData = sc.nextInt();
		Node node = new Node(nodeData);
		this.size++;
		boolean choice = false;
		System.out.println("Do you have left child of " + nodeData);
		choice = sc.nextBoolean();
		if (choice)
		{
			node.left = this.takeInput(sc, node, true);
		}
		choice = false;
		System.out.println("Do you have right child of " + nodeData);
		choice = sc.nextBoolean();
		if (choice)
		{
			node.right = this.takeInput(sc, node, false);
		}
		return node;
	}

	public int size()
	{
		return this.size;
	}

	public void display()
	{
		this.display(this.root);
	}

	private void display(Node node)
	{
		String leftData = node.left == null ? "END" : node.left.data + "";
		String rightData = node.right == null ? "END" : node.right.data + "";
		System.out.println(leftData + "=>" + node.data + "<=" + rightData);
		if (node.left != null)
		{
			this.display(node.left);
		}
		if (node.right != null)
		{
			this.display(node.right);
		}

	}

	public int height()
	{
		return this.height(this.root);

	}

	private int height(Node node)
	{
		if (node == null)
		{
			return -1;
		}
		int leftSubtreeHeight = this.height(node.left);
		int rightSubtreeHeight = this.height(node.right);
		return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
	}

	public void preorderTraversal()
	{
		// root,left,right
		System.out.print("PreOrder Traversal :\t");
		this.preorderTraversal(this.root);
		System.out.println();
	}

	private void preorderTraversal(Node node)
	{
		if (node == null)
			return;

		System.out.print(node.data + " ");
		this.preorderTraversal(node.left);
		this.preorderTraversal(node.right);

	}

	public void inorderTraversal()
	{
		// left,root,right
		System.out.print("InOrder Traversal :\t");
		this.inorderTraversal(this.root);
		System.out.println();
	}

	private void inorderTraversal(Node node)
	{
		if (node == null)
			return;
		this.inorderTraversal(node.left);
		System.out.print(node.data + " ");
		this.inorderTraversal(node.right);

	}

	public void postorderTraversal()
	{
		// left,right,root
		System.out.print("PostOrder Traversal :\t");
		this.postorderTraversal(this.root);
		System.out.println();
	}

	private void postorderTraversal(Node node)
	{
		if (node == null)
			return;

		this.postorderTraversal(node.left);
		this.postorderTraversal(node.right);
		System.out.print(node.data + " ");

	}

	public void levelorderTraversal()
	{
		if (this.root == null)
			return;
		System.out.print("LevelOrder Traversal :\t");

		Queue<Node> q = new LinkedList<Node>();
		q.add(this.root);
		while (!q.isEmpty())
		{
			Node node = q.poll();
			System.out.print(node.data + " ");
			if (node.left != null)
			{
				q.add(node.left);
			}
			if (node.right != null)
			{
				q.add(node.right);
			}
		}
		System.out.println();
	}
}

/* https://github.com/shahiddhariwala */
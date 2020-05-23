/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 23-May-2020
*/
/*
 * You are given a sorted data of n integers. You have to form a balanced Binary Search Tree and then print preorder traversal of the tree.

Input Format
First line contains integer t as number of test cases.
Each test case contains following input. First line contains integer n which represents the length of the data and next line contains n space separated integers denoting the elements for the BST.

Constraints
1 < t < 100
1< n < 1000

Output Format
For each testcase , print the preorder traversal of the BST in a new line.

Sample Input
1
7
1 2 3 4 5 6 7
Sample Output
4 2 1 3 6 5 7
Explanation
The tree looks like

             4
          /      \
       2           6
    /     \      /    \
   1       3    5      7
We print the preorder of the final tree.
 */

package trees.challeneging_Program_On_Trees;

import java.util.Scanner;

class AVLTree
{
	Node root;

	private class Node
	{
		int data;
		Node left;
		Node right;
		int height;

		Node(int data)
		{
			this.data = data;
			this.height = 1;
			this.left = null;
			this.right = null;
		}
	}

	public void add(int data)
	{
		this.root = this.add(this.root, data);
	}

	private Node add(Node node, int data)
	{
		if (node == null)
		{
			return new Node(data);
		}

		if (data < node.data)
		{
			node.left = this.add(node.left, data);
		} else if (data > node.data)
		{
			node.right = this.add(node.right, data);
		}

		node.height = 1 + Math.max(this.height(node.left), this.height(node.right));
		int balanceFactor = this.balanceFactor(node);

		if (balanceFactor > 1 && data < node.left.data)
		{
			// Right Rotate
			node = this.rightRotate(node);

		} else if (balanceFactor < -1 && data > node.right.data)
		{
			// Left Rotate
			node = this.leftRotate(node);
		} else if (balanceFactor > 1 && data > node.left.data)
		{
			// LR Problem
			node.left = this.leftRotate(node.left);
			node = this.rightRotate(node);
		} else if (balanceFactor < -1 && data < node.right.data)
		{
			// RL problem
			node.right = this.rightRotate(node.right);
			node = this.leftRotate(node);
		}

		return node;
	}

	private Node leftRotate(Node node)
	{
		Node b = node.right;
		node.right = b.left;
		b.left = node;
		node.height = 1 + Math.max(this.height(node.left), this.height(node.right));
		b.height = 1 + Math.max(this.height(node.left), this.height(node.right));
		return b;
	}

	private Node rightRotate(Node node)
	{
		Node b = node.left;
		node.left = b.right;
		b.right = node;
		node.height = 1 + Math.max(this.height(node.left), this.height(node.right));
		b.height = 1 + Math.max(this.height(node.left), this.height(node.right));
		return b;
	}

	public void display()
	{
		this.display(this.root);
	}

	private void display(Node node)
	{
		if (node == null)
		{
			return;
		}
		String left = node.left == null ? "END => " : Integer.toString(node.left.data) + " => ";
		String right = node.right == null ? " <= END" : " <= " + Integer.toString(node.right.data);

		System.out.println(left + node.data + right);
		this.display(node.left);
		this.display(node.right);
	}

	public void preorder()
	{
		this.preorder(this.root);
		System.out.println();
	}

	private void preorder(Node node)
	{
		if (node == null)
			return;

		System.out.print(node.data + " ");
		this.preorder(node.left);
		this.preorder(node.right);

	}

	public int height()
	{
		return this.height(this.root);
	}

	private int height(Node node)
	{
		if (node == null)
		{
			return 0;
		}
		return node.height;
	}

	private int balanceFactor(Node node)
	{
		if (node == null)
			return 0;

		return this.height(node.left) - this.height(node.right);
	}

}

public class Build_Balanced_BST
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();

		while (numCases > 0)
		{
			numCases--;
			int num = sc.nextInt();
			AVLTree b1 = new AVLTree();
			for (int i = 0; i < num; i++)
			{
				b1.add(sc.nextInt());
			}
			// b1.display();
			b1.preorder();
		}
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
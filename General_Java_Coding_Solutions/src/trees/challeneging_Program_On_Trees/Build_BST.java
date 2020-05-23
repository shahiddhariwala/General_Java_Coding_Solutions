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

public class Build_BST
{
	private static class BSTTree
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

		public void constructBST(int[] arr, int start, int end)
		{
			this.root = this.constructBST2(arr, start, end);
		}

		public Node constructBST2(int[] arr, int start, int end)
		{
			if (start > end)
			{
				return null;
			}
			int mid = start + end;
			mid= mid>>1;
			Node node = new Node(arr[mid]);
			node.left = this.constructBST2(arr, start, mid - 1);
			node.right = this.constructBST2(arr, mid + 1, end);
			return node;

		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();

		while (numCases > 0)
		{
			numCases--;
			int num = sc.nextInt();
			BSTTree b1 = new BSTTree();
			int arr[] = new int[num];
			for (int i = 0; i < num; i++)
			{
				arr[i] = sc.nextInt();
			}
			b1.constructBST(arr, 0, num-1);
			// b1.display();
			b1.preorder();
		}
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
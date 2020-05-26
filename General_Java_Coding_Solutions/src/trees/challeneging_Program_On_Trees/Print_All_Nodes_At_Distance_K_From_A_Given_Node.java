/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 24-May-2020
*/

/*
 * Given a binary tree, a target node in the binary tree, and an integer value k, print all the nodes that are at distance k from the given target node. No parent pointers are available. Print 0 if no such node exist at distance k.

Input Format
The first line of input will contain an integer n. The next line will contain n integers denoting the the preorder traversal of the BT. The next line will contain n more integers denoting the inorder traversal of the BT. The next line will contain an integer T. Then T lines follow you will be given 2 integers the first one denoting the value of Node and the second one denoting the value of k.

Constraints
2 ≤ N ≤ 10^3

Output Format
On T lines print space separated desired output for each test case in sorted form

Sample Input
4
60 65 50 70
50 65 60 70
2
60 1
65 2
Sample Output
65 70
70
Explanation
The tree looks like

             60
          /      \
       65         70
     /
  50
For testcase 1 : The nodes 65 and 70 are the only ones at distance k=1 from 60.
For testcase 2 : The node 70 is at distance k=2 from 65.
 */
package trees.challeneging_Program_On_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print_All_Nodes_At_Distance_K_From_A_Given_Node
{
	private static class Tree
	{
		Node root;

		class Node
		{
			int data;
			Node left;
			Node right;

			Node(int data)
			{
				this.data = data;
				left = right = null;
			}
		}

		Tree(int preOrder[], int arrInOrdr[])
		{
			this.root = this.buildTree(0, arrInOrdr.length - 1, preOrder, arrInOrdr, 0);
		}

		private Node buildTree(int start, int end, int[] preOrder, int[] arrInOrdr, int preIndex)
		{
			if (end < start || start >= arrInOrdr.length || preIndex >= arrInOrdr.length)
			{
				return null;
			}
			int data = preOrder[preIndex];
			Node newNode = new Node(data);
			/* If this node has no children then return */
			if (end == start)
				return newNode;

			int index;
			for (index = start; index <= end; index++)
			{
				if (arrInOrdr[index] == preOrder[preIndex])
				{
					break;
				}
			}

			// postIndex for left side
			newNode.left = buildTree(start, index - 1, preOrder, arrInOrdr, preIndex + 1);
			newNode.right = buildTree(index + 1, end, preOrder, arrInOrdr, preIndex + (index - start) + 1);

			return newNode;

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
			String left = node.left == null ? "END" : Integer.toString(node.left.data);
			String right = node.right == null ? "END" : Integer.toString(node.right.data);
			System.out.println(left + " => " + node.data + " <= " + right);
			this.display(node.left);
			this.display(node.right);
		}

		public void printKNear(int sourceData, int distance)
		{
			ArrayList<Integer> res = new ArrayList<>();
			distanceK(this.root, sourceData, distance, res);
			if (res.size() == 0)
			{
				System.out.println(0);
			} else
			{
				Collections.sort(res);
				res.forEach(el -> System.out.print(el + " "));
				System.out.println();
			}

		}

		private int distanceK(Node node, int sourceData, int k, ArrayList<Integer> res)
		{
			if (node == null)
			{
				return -1;
			}

			if (node.data == sourceData)
			{
				// Traget node found, do dfs to print bottom K dstanced descendent nodes
				dfsUtil(node, k, res);
				return 1;
			}

			int lefty = distanceK(node.left, sourceData, k, res);
			if (lefty >= 0)
			{
				if (lefty == k)
				{
					res.add(node.data);
				} else
				{
					dfsUtil(node.right, k - lefty - 1, res);
				}
				return lefty + 1;
			}

			int righty = distanceK(node.right, sourceData, k, res);
			if (righty >= 0)
			{
				if (righty == k)
				{
					res.add(node.data);
				} else
				{
					dfsUtil(node.left, k - lefty - 1, res);
				}
				return righty + 1;
			}
			return -1;

		}

		private void dfsUtil(Node node, int k, ArrayList<Integer> res)
		{
			if (node == null)
				return;

			if (k == 0)
			{
				res.add(node.data);
			}

			dfsUtil(node.left, k - 1, res);
			dfsUtil(node.right, k - 1, res);
		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int preOrder[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			preOrder[i] = sc.nextInt();
		}
		int arrInOrdr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arrInOrdr[i] = sc.nextInt();
		}
		Tree tree = new Tree(preOrder, arrInOrdr);

		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			tree.printKNear(sc.nextInt(), sc.nextInt());
		}
		sc.close();

	}
}

/* https://github.com/shahiddhariwala */
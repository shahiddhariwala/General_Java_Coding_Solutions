/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 29-May-2020
*/
/*
 * You will be given a Binary Tree. Your task is to print the binary tree in Vertical Fashion. The image below describes how we define a vertical traversal of a tree.

Input Format
You will be given an Integer N denoting the number of levels in the corresponding tree. On the next line you will be given (2^N)-1 integers denoting the level order input for the tree. If at any level any node is absent then that will denoted by -1 and every integer other than -1 shows the presence of a node at that level.

Constraints
1 <= N <= 10^5

Output Format
Print all nodes of a given column in the same line.

Image

Sample Input
4 
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1
Sample Output
4
2
1 5 6
3 8 
7
9
Explanation
Refer to the image.
We are to simply print the traversal of each vertical level from left to right.
 */

package hashMap.challenging_Program_on_Hashing_And_Tries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class Vertical_Order_Print_Binary_Tree
{
	public static Scanner sc = new Scanner(System.in);

	private static class BinaryTree
	{

		private Node root;
		private int size;

		private class Node
		{
			int data;
			Node left;
			Node right;
			int level;

			Node(int data)
			{
				this.data = data;
				this.left = null;
				this.right = null;
			}

			Node(int data, Node parent)
			{
				this.data = data;
				this.left = null;
				this.right = null;
				if (parent == null)
				{
					this.level = 1;
				} else
				{
					this.level = parent.level + 1;
				}

			}
		}

		BinaryTree()
		{
			this.root = this.takeInput();
		}

		private Node takeInput()
		{
			Queue<Node> q = new LinkedList<Node>();
			Node node = new Node(sc.nextInt());
			q.add(node);
			while (!q.isEmpty())
			{
				Node temp = q.poll();
				int child1 = sc.nextInt();
				int child2 = sc.nextInt();
				if (child1 != -1)
				{
					temp.left = new Node(child1, temp);
					q.add(temp.left);
				}
				if (child2 != -1)
				{
					temp.right = new Node(child2, temp);
					q.add(temp.right);
				}
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
			// System.out.println("Level : " + node.level);
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

		public void verticalOrder()
		{
			if (this.root == null)
			{
				System.out.println("No ");
				return;
			}
			TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<Integer, ArrayList<Integer>>();
			this.verticalOrder(this.root, 0, tm);
			tm.forEach((k, v) ->
			{
				for (Integer i : v)
				{
					System.out.print(i+" ");
				}
				System.out.println();

			});

		}

		private void verticalOrder(Node node, int col, TreeMap<Integer, ArrayList<Integer>> tm)
		{
			if(node==null)
			{
				return;
			}
			
			if(tm.containsKey(col))
			{
				tm.get(col).add(node.data);
			}
			else
			{
				ArrayList<Integer> list = new ArrayList<>();
				list.add(node.data);
				tm.put(col,list);
			}
			
			this.verticalOrder(node.left, col-1, tm);
			this.verticalOrder(node.right, col+1, tm);
		}
	}

	public static void main(String[] args)
	{
		int levelOrder = sc.nextInt();
		BinaryTree bt = new BinaryTree();
		//bt.display();
		bt.verticalOrder();
		
	}

}

/* https://github.com/shahiddhariwala */
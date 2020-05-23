/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/
/*
Given a binary tree , print the nodes in left to right manner as visible from below the tree

Input Format
Level order input for the binary tree will be given.

Constraints
No of nodes in the tree can be less than or equal to 10^7

Output Format
A single line containing space separated integers representing the bottom view of the tree

Sample Input
1 2 3 4 5 6  -1 -1 -1 -1 -1 -1 -1
Sample Output
4 2 6 3
Explanation
The tree looks like

             1
          /      \
       2           3
    /     \       /
   4       5     6
(Note that 5 and 6 are at the same position so we consider the right one to lower)
 */
package trees.challeneging_Program_On_Trees;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class Binary_tree_Bottom_View
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
			int column;

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

		private void rightView()
		{
			int[] maxlevel = new int[1];
			maxlevel[0] = -1;
			this.rightView(this.root, 0, maxlevel);
		}

		private void rightView(Node node, int level, int[] maxlevel)
		{
			if (node == null)
			{
				return;
			}

			if (maxlevel[0] < level)
			{
				System.out.print(node.data + " ");
				maxlevel[0] = level;
			}

			this.rightView(node.right, level + 1, maxlevel);
			this.rightView(node.left, level + 1, maxlevel);

		}

		private void leftView()
		{
			int[] maxlevel = new int[1];
			maxlevel[0] = -1;
			this.leftView(this.root, 0, maxlevel);
		}

		private void leftView(Node node, int level, int[] maxlevel)
		{
			if (node == null)
			{
				return;
			}

			if (maxlevel[0] < level)
			{
				System.out.print(node.data + " ");
				maxlevel[0] = level;
			}

			this.leftView(node.left, level + 1, maxlevel);
			this.leftView(node.right, level + 1, maxlevel);

		}

		private void topView()
		{
			if (this.root == null)
			{
				return;
			}

			Queue<Node> q = new LinkedList<Node>();
			// Using TreeMap so that keys i.e colums are sorted i natual order
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			q.add(this.root);
			while (!q.isEmpty())
			{
				Node pop = q.poll();
				int pCol = pop.column;

				if (!map.containsKey(pCol))
				{
					map.put(pCol, pop.data);
				}

				if (pop.left != null)
				{
					pop.left.column = pCol - 1;
					q.add(pop.left);
				}
				if (pop.right != null)
				{
					pop.right.column = pCol + 1;
					q.add(pop.right);
				}
			}

			map.forEach((k, v) -> System.out.print(v + " "));

		}

		private void bottomView()
		{
			if (this.root == null)
			{
				return;
			}

			Queue<Node> q = new LinkedList<Node>();
			// Using TreeMap so that keys i.e colums are sorted i natual order
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			q.add(this.root);
			while (!q.isEmpty())
			{
				Node pop = q.poll();
				int pCol = pop.column;

				map.put(pCol, pop.data);

				if (pop.left != null)
				{
					pop.left.column = pCol - 1;
					q.add(pop.left);
				}
				if (pop.right != null)
				{
					pop.right.column = pCol + 1;
					q.add(pop.right);
				}
			}

			map.forEach((k, v) -> System.out.print(v + " "));

		}

		private void displayZigZag()
		{
			Node temp = this.root;
			Deque<Node> stack1 = new LinkedList<>();
			Deque<Node> stack2 = new LinkedList<>();
			stack1.addFirst(temp);
			while (!stack1.isEmpty() || !stack2.isEmpty())
			{
				while (!stack1.isEmpty())
				{
					Node pop = stack1.removeFirst();
					System.out.print(pop.data + " ");
					if (pop.left != null)
					{
						stack2.addFirst(pop.left);
					}
					if (pop.right != null)
					{
						stack2.addFirst(pop.right);
					}
				}
				while (!stack2.isEmpty())
				{
					Node pop = stack2.removeFirst();
					System.out.print(pop.data + " ");
					if (pop.right != null)
					{
						stack1.addFirst(pop.right);
					}
					if (pop.left != null)
					{
						stack1.addFirst(pop.left);
					}

				}
			}
			System.out.println();

		}

	}

	public static void main(String[] args)
	{
		BinaryTree bt1 = new BinaryTree();

		bt1.bottomView();
		// 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/
/*
Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even levels should be printed from right to left. Each level should be printed at a new line.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
None

Output Format
Display the values in zigzag level order in which each value is separated by a space

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
10 30 20 40 50 60 73 
 */
package trees.challeneging_Program_On_Trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Level_Order_ZigZag_BinaryTree
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
			this.root = this.takeInput(sc, null, false);
		}

		private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight)
		{
			if (parent == null)
			{
				// System.out.println("Enter the data of root node ");
			} else
			{
				if (isLeftOrRight)
				{
					// System.out.println("Enter the data of left child of " + parent.data);
				} else
				{
					// System.out.println("Enter the data of right child of " + parent.data);
				}
			}
			int nodeData = sc.nextInt();
			Node node = new Node(nodeData, parent);
			this.size++;
			boolean choice = false;
			// System.out.println("Do you have left child of " + nodeData);
			choice = sc.nextBoolean();
			if (choice)
			{
				node.left = this.takeInput(sc, node, true);
			}
			choice = false;
			// System.out.println("Do you have right child of " + nodeData);
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

		private void displayZigZag()
		{
			Node temp = this.root;
			Deque<Node> stack1 = new LinkedList<>();
			Deque<Node> stack2 = new LinkedList<>();
			stack1.addFirst(temp);
			while (!stack1.isEmpty() || !stack2.isEmpty())
			{
				while(!stack1.isEmpty())
				{
					Node pop = stack1.removeFirst();
					System.out.print(pop.data+" ");
					if(pop.left!=null)
					{
						stack2.addFirst(pop.left);
					}
					if(pop.right != null)
					{
						stack2.addFirst(pop.right);
					}
				}
				while(!stack2.isEmpty())
				{
					Node pop = stack2.removeFirst();
					System.out.print(pop.data+" ");
					if(pop.right != null)
					{
						stack1.addFirst(pop.right);
					}
					if(pop.left!=null)
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
		bt1.displayZigZag(); /*
								 * 10 true 20 true 40 false false true 50 false false true 30 true 60 false
								 * false true 73 false false
								 * Level : 1
								 * 20=>10<=30
								 * Level : 2
								 * 40=>20<=50
								 * Level : 3
								 * END=>40<=END
								 * Level : 3
								 * END=>50<=END
								 * Level : 2
								 * 60=>30<=73
								 * Level : 3
								 * END=>60<=END
								 * Level : 3
								 * END=>73<=END
								 * 
								 */

	}

}

/* https://github.com/shahiddhariwala */
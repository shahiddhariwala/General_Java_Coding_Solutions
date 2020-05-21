/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/
/*
 *Given two trees check if they are structurally identically. Structurally identical trees are trees that have same structure. They may or may not have the same data though.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
1 <= N <= 10^4

Output Format
Display the Boolean result

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
true
Explanation
The given two trees have the exact same structure and hence we print true.
 */
package trees.challeneging_Program_On_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Is_Structural_Identical_Binary_Tree
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

			Node(int data)
			{
				this.data = data;
				this.left = null;
				this.right = null;
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
			Node node = new Node(nodeData);
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


		private boolean isBalanced()
		{
			
			return  this.isBalanced(this.root);
		
		}

		private boolean isBalanced(Node node)
		{
			if (node == null)
				return true;
			
			int left = this.height(node.left);
			int right = this.height(node.right);
			if(Math.abs(left-right) <= 1)
			{
				return this.isBalanced(node.left) && this.isBalanced(node.right);
			}
			return false;
		}
		public boolean structurallyIdentical(BinaryTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) {
			
			if(tnode==null && onode==null)
			{
				return true;
			}
			else if(tnode==null && onode==null)
			{
				return false;
			}
			
			if(this.height(tnode)!=this.height(onode))
			{
				return false;
			}
			return structurallyIdentical(tnode.left,onode.left) && structurallyIdentical(tnode.right,onode.right);
		}
	}

	public static void main(String[] args)
	{
		BinaryTree bt1 = new BinaryTree();
		//bt1.display();
		BinaryTree bt2 = new BinaryTree();
		System.out.println(bt1.structurallyIdentical(bt2));
		//bt2.display();
	
		
	}

}

/* https://github.com/shahiddhariwala */
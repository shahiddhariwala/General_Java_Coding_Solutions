package trees.challeneging_Program_On_Trees;


import java.util.ArrayList;
import java.util.Scanner;
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/

/*Given two trees, return true if they are structurally identical they are made of nodes with the same values arranged in the same way.

Input Format
Enter the value of the node and then its number of children , further add value of the 1st children and then its number of children and so on in a space separated manner

Constraints
None

Output Format
Display the Boolean result

Sample Input
10 3 20 2 50 0 60 0 30 1 70 0 40 3 80 0 90 0 100 0
80 3 40 2 110 0 120 0 60 0 70 1 140 0
Sample Output
false
 */

public class Is_Structural_Identical_Generic_Tree
{
	public static Scanner sc = new Scanner(System.in);

	private static class GenericTree
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
			this.root = takeInput(null, 0);
		}

		private Node takeInput( Node parent, int ithChild)
		{
			if (parent == null)
			{
				//System.out.println("Enter the data of root Node");
			} else
			{
				//System.out.printf("Enter the data of child:%d of %d\n", ithChild + 1, parent.data);
			}
			int nodeData = sc.nextInt();
			Node node = new Node(nodeData);
			this.size++;
			//System.out.println("Enter the Number of Children of " + nodeData);
			int numChild = sc.nextInt();
			for (int i = 0; i < numChild; i++)
			{
				Node child = this.takeInput(node, i);
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
		public boolean structurallyIdentical(GenericTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) {
			if(tnode==null && onode==null)
			{
				return true;
			}
			if(tnode ==null || onode==null)
			{
				return false;
			}
			
			if(tnode.childrens.size()!=onode.childrens.size())
			{
				return false;
			}
			
			for(int i=0;i<tnode.childrens.size();i++)
			{
				if(!structurallyIdentical(tnode.childrens.get(i), onode.childrens.get(i)))
				{
					return false;
				}
			}
			return true;
		}
	
	
	}

	public static void main(String[] args)
	{
		GenericTree gt = new GenericTree();
		GenericTree gt2 = new GenericTree();
		System.out.println(gt.structurallyIdentical(gt2));
	}

}



/*https://github.com/shahiddhariwala*/
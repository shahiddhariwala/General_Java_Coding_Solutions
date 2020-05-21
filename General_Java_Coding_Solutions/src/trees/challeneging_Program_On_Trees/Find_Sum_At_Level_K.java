package trees.challeneging_Program_On_Trees;


import java.util.ArrayList;
import java.util.Scanner;
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/

/*
 * Take input of a generic tree using buildtree() function and also take input K the level at which we need to find the sum.

Input Format
Take a generic tree input where you are first given the data of the node and then its no of children. The input is of preorder form and it is assured that the no of children will not exceed 2. The input of the tree is followed by a single integer K.

Constraints
1 <= Nodes in tree <=1000
1<K<10

Output Format
A single line containing the sum at level K.

Sample Input
1 2
2 2
3 0
4 0
5 2
6 0
7 0
2
Sample Output
20
Explanation
Here the tree looks like

                     1                                 Level 0
                /          \
              2              5                         Level 1
           /      \       /     \
          3       4      6        7                    Level 2
Sum at Level 2 = 3 + 4 + 6 + 7 = 20
 */

public class Find_Sum_At_Level_K
{
	

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
			Scanner sc = new Scanner(System.in);
			this.root = takeInput(sc, null, 0);
			System.out.println(this.sumAtLevelK(sc.nextInt()));
			
		}

		private Node takeInput(Scanner sc, Node parent, int ithChild)
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
		
		private static int globalKSum;
		private int sumAtLevelK(int k)
		{
			if(k==0)
			{
				return this.root.data;
			}
			globalKSum=0;
			this.sumAtLevelK(this.root, 0, k);
			return globalKSum;
		}
		private void sumAtLevelK(Node node,int currLevel,int k)
		{
			if(currLevel==k)
			{
				globalKSum+=node.data;
			 return;
			}
			for (Node children : node.childrens)
			{
				sumAtLevelK(children,currLevel+1,k);
			}
		}
	}

	public static void main(String[] args)
	{
		GenericTree gt = new GenericTree();
		
	}

}



/*https://github.com/shahiddhariwala*/
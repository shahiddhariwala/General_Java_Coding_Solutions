/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 23-May-2020
*/
/*
 * Given a Binary Tree, write a program that returns the size of the largest subtree which is also a Binary Search Tree (BST)

Input Format
The first line of input will contain an integer n. The next line will contain n integers denoting the the preorder traversal of the BT. The next line will contain n more integers denoting the inorder traversal of the BT.

Constraints
2 ≤ N ≤ 10^3

Output Format
A single integer denoting the size ( no of nodes in tree ) of largest BST in the given tree.

Sample Input
4
60 65 50 70
50 65 60 70
Sample Output
2
Explanation
The tree looks like

             60
          /      \
       65           70
     /           
   50       
The largest BST subtree is

       65           
     /           
   50       
which has the size 2 i.e. it has 2 nodes in it.
 */

package trees.challeneging_Program_On_Trees;

import java.util.Scanner;

public class Largest_BST_In_A_Binary_Tree
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
				this.data=data;
				left = right = null; 
			}
		}
		
		Tree(int preOrder[],int arrInOrdr[])
		{
			this.root = this.buildTree(0,arrInOrdr.length-1,preOrder,arrInOrdr,0);
		}

		private Node buildTree(int start, int end, int[] preOrder, int[] arrInOrdr,int preIndex)
		{
			if(end<start || start >= arrInOrdr.length || preIndex >= arrInOrdr.length)
			{
				return null;
			}
			int data = preOrder[preIndex];
			Node newNode = new Node(data);
			 /* If this node has no children then return */
	        if (end == start) 
	            return newNode; 
			
			int index;
			for(index = start;index <= end;index++)
			{
				if(arrInOrdr[index]==preOrder[preIndex])
				{
					break;
				}
			}
			
			// postIndex for left side  
			newNode.left = buildTree(start, index-1, preOrder, arrInOrdr,preIndex+1);
			newNode.right = buildTree(index+1, end, preOrder, arrInOrdr,preIndex+(index-start)+1 );
			
			
			return newNode;
			
		}
		
		public void display()
		{
			this.display(this.root);
		}

		private void display(Node node)
		{
			if(node==null)
			{
				return;
			}
			String left = node.left == null ? "END" : Integer.toString(node.left.data);
			String right = node.right == null ? "END" : Integer.toString(node.right.data);
			System.out.println(left+" => "+node.data+" <= "+right);
			this.display(node.left);
			this.display(node.right);
		}
		
		public int findLargestBST()
		{
			return findLargestBST(this.root).ans;
		}
		class Info 
		{
			int size;
			int max;
			int min;
			int ans;
			boolean isBST;
			
		Info(int size,int min,int max,int ans,boolean isBST)
		{
			this.size=size;
			this.min=min;
			this.max=max;
			this.ans=ans;
			this.isBST = isBST;
		}
		Info(){}
		}
		
		private Info findLargestBST(Node node)
		{
			if(node==null)
			{
				return new Info(0,Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
			}
			if(node.left==null && node.right == null)
			{
				return new Info(1,node.data,node.data,1,true);
			}
			
			Info left= this.findLargestBST(node.left);
			
			Info right= this.findLargestBST(node.right);
			
			Info currNode = new Info();
			currNode.size = 1 + left.size + right.size;
			
			if(left.isBST && right.isBST && node.data > left.max && node.data < right.min)
			{
				currNode.ans = 1 + left.ans+right.ans;
				currNode.min = Math.min(node.data, Math.min(left.min,right.min));
				currNode.max = Math.max(node.data, Math.max(left.max,right.max));
				currNode.isBST=true;
			}
			else
			{
				currNode.ans = Math.max(left.ans, right.ans);
				currNode.isBST=false;
			}
			return currNode;
			         
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
		Tree tree = new Tree(preOrder,arrInOrdr);
		System.out.println(tree.findLargestBST());
		
		sc.close();

	}

}


/*https://github.com/shahiddhariwala*/
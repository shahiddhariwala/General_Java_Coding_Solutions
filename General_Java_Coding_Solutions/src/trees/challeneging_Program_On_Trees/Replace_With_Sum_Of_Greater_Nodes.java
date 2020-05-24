/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 24-May-2020
*/

/*
 * Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it. Include the current node's data also.

Input Format
The first line contains a number n showing the length of the inorder array of BST. The next line contains n integers denoting the elements of the array.

Constraints
2 ≤ N ≤ 10^3

Output Format
Print the preorder traversal of the new tree.

Sample Input
7
20 30 40 50 60 70 80
Sample Output
260 330 350 300 150 210 80
Explanation
The original tree looks like

            50             
        /        \                
      30          70
    /    \       /   \ 
  20    40      60    80
We are supposed to replace the elements by the sum of elements larger than it.
80 being the largest element remains unaffected .
70 being the second largest element gets updated to 150 (70+80)
60 becomes 210 (60 + 70 + 80)
50 becomes 260 (50 + 60 + 70 + 80)
40 becomes 300 (40 + 50 + 60 + 70 + 80)
30 becomes 330 (30 + 40 + 50 + 60 + 70 + 80)
20 becomes 350 (20 + 30 + 40 + 50 + 60 + 70 + 80)

The new tree looks like

           260             
        /        \                
     330         150
    /    \       /   \ 
  350    300   210    80
The Pre-Order traversal (Root->Left->Right) looks like :
260 330 350 300 150 210 80.
 */
package trees.challeneging_Program_On_Trees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Replace_With_Sum_Of_Greater_Nodes
{
	private static class BinarySearchTree
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

		public BinarySearchTree(int arr[])
		{
			this.root = this.construct(arr, 0, arr.length - 1);
		}

		public BinarySearchTree()
		{
			this.root = null;
			this.size = 0;
		}

		private Node construct(int[] arr, int low, int high)
		{
			if (low <= high)
			{
				int mid = low + high;
				mid = mid >> 1;
				Node node = new Node(arr[mid]);
				node.left = this.construct(arr, low, mid - 1);
				node.right = this.construct(arr, mid + 1, high);
				this.size++;
				return node;
			}

			return null;

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

		public void replaceTheSum()
		{
			this.replaceTheSum(this.root, new int[1]);
		}

		private void replaceTheSum(Node node, int sum[])
		{
			if (node == null)
			{
				return;
			}
			this.replaceTheSum(node.right, sum);
			sum[0] = sum[0]+node.data;
			node.data=sum[0];
			this.replaceTheSum(node.left, sum);
			

		}

		public void preorderTraversal()
		{
			// root,left,right
			// System.out.print("PreOrder Traversal :\t");
			this.preorderTraversal(this.root);
			System.out.println();
		}

		private void preorderTraversal(Node node)
		{
			if (node == null)
				return;

			System.out.print(node.data + " ");
			this.preorderTraversal(node.left);
			this.preorderTraversal(node.right);

		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		BinarySearchTree bt = new BinarySearchTree(arr);
		// bt.display();
		bt.replaceTheSum();
		// bt.display();
		bt.preorderTraversal();
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
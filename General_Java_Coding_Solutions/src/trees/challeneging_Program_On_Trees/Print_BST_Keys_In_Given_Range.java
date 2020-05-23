/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 23-May-2020
*/

/*
 * You are given an array of integers. First of all , You have to form a binary search tree from given integers. Now you have provided two integers k1 and k2. You have to print all nodes of BST within the range k1 and k2 (including k1 and k2).

Input Format
First line contains integer t as number of test cases. Each test case contains three lines. First line contains an integer n which is length of the array and second line contains n space separated integer. Third line contains the value of k1 and k2.

Constraints
1 < t < 20
1 < n < 50

Output Format
For each test case you have to print preorder traversal of the tree first and then print all nodes within the range k1 and k2 (inclusive). Refer to the sample testcase for exact output format.

Sample Input
1
5
4 3 2 5 6
3 5
Sample Output
# Preorder : 4 3 2 5 6 
# Nodes within range are : 3 4 5 
Explanation
The tree looks like

             4
          /      \
       3           5
    /                \
   2                  6
The nodes between the range 3 to 5 are 3,4,5.
 */
package trees.challeneging_Program_On_Trees;

import java.util.*;

class BinarySearchTree2
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

	public BinarySearchTree2(int arr[])
	{
		this.root = this.construct(arr, 0, arr.length - 1);
	}

	public BinarySearchTree2()
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

	public void add(int val)
	{
		this.root = this.add(this.root, val);
	}

	private Node add(Node node, int val)
	{

		if (node == null)
		{
			this.size++;
			return new Node(val);
		}

		if (val <= node.data)
			node.left = this.add(node.left, val);
		else if (val > node.data)
			node.right = this.add(node.right, val);

		return node;

	}

	public void remove(int val)
	{
		this.root = this.remove(this.root, val);

	}

	private Node remove(Node node, int val)
	{
		if (node == null)
		{
			// System.out.println("Value not found ");
			return null;
		}

		if (val < node.data)
		{
			node.left = remove(node.left, val);
		} else if (val > node.data)
		{
			node.right = remove(node.right, val);
		} else
		{
			// value found
			if (node.left == null && node.right == null)
			{
				// if its leaf node , then just delete it
				node = null;

			} else if (node.left == null || node.right == null)
			{
				// if one child is present
				if (node.left == null)
				{
					node = node.right;
				} else if (node.right == null)
				{
					node = node.left;
				}

			} else
			{

				Node minFromRight = this.min(node.right);
				node.data = minFromRight.data;
				node.right = this.remove(node.right, node.data);

			}
		}
		return node;
	}

	private Node min(Node node)
	{
		if (node.left == null)
		{
			return node;
		}
		return min(node.left);
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

	public void preorderTraversal()
	{
		// root,left,right
		System.out.print("# Preorder : ");
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

	public void inorderTraversal()
	{
		// left,root,right
		System.out.print("InOrder Traversal :\t");
		this.inorderTraversal(this.root);
		System.out.println();
	}

	private void inorderTraversal(Node node)
	{
		if (node == null)
			return;
		this.inorderTraversal(node.left);
		System.out.print(node.data + " ");
		this.inorderTraversal(node.right);

	}

	public void postorderTraversal()
	{
		// left,right,root
		System.out.print("PostOrder Traversal :\t");
		this.postorderTraversal(this.root);
		System.out.println();
	}

	private void postorderTraversal(Node node)
	{
		if (node == null)
			return;

		this.postorderTraversal(node.left);
		this.postorderTraversal(node.right);
		System.out.print(node.data + " ");

	}

	public void levelorderTraversal()
	{
		if (this.root == null)
			return;
		System.out.print("LevelOrder Traversal :\t");

		Queue<Node> q = new LinkedList<Node>();
		q.add(this.root);
		while (!q.isEmpty())
		{
			Node node = q.poll();
			System.out.print(node.data + " ");
			if (node.left != null)
			{
				q.add(node.left);
			}
			if (node.right != null)
			{
				q.add(node.right);
			}
		}
		System.out.println();
	}

	public boolean contains(int val)
	{

		return contains(this.root, val);
	}

	private boolean contains(Node node, int val)
	{
		if (node == null)
		{
			return false;
		}

		if (node.data == val)
		{
			return true;
		}

		if (val < node.data)
		{
			return contains(node.left, val);
		} else
		{
			return contains(node.right, val);
		}
	}

	public int max()
	{
		return max(this.root).data;
	}

	private Node max(Node node)
	{
		if (node.right == null)
		{
			return node;
		}

		// We know in BST Larger value is always at right

		return max(node.right);
	}

	public void printRange(int start, int end)
	{
		System.out.print("# Nodes within range are : ");
		this.printRange(this.root, start, end);
		System.out.println();
	}

	private void printRange(Node node, int start, int end)
	{
		if(node==null)
		{
			return;
		}
		if(node.data < start)
		{
			this.printRange(node.right, start, end);
		}
		else if(node.data > end)
		{
			this.printRange(node.left, start, end);
		}
		else 
		{
			this.printRange(node.left, start, end);
			System.out.print(node.data+" ");
			this.printRange(node.right, start, end);
		}
		
	}

}

public class Print_BST_Keys_In_Given_Range
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();

		while (numCases > 0)
		{
			numCases--;
			int num = sc.nextInt();
			BinarySearchTree2 b1 = new BinarySearchTree2();
			for (int i = 0; i < num; i++)
			{
				b1.add(sc.nextInt());
			}

			b1.preorderTraversal();
			b1.printRange(sc.nextInt(), sc.nextInt());
		}
		sc.close();
	}
}

/* https://github.com/shahiddhariwala */
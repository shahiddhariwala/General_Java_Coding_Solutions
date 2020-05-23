/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 23-May-2020
*/


package trees.challeneging_Program_On_Trees;

import java.util.*;

class BinarySearchTree
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
			//System.out.println("Value not found ");
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
				node.right=this.remove(node.right, node.data);

			}
		}
		return node;
	}
	private Node min(Node node)
	{
		if(node.left == null )
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
	//	System.out.print("PreOrder Traversal :\t");
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

}
public class Delete_Node_From_BST
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();

		while (numCases > 0)
		{
			numCases--;
			int num = sc.nextInt();
			BinarySearchTree b1 = new BinarySearchTree();
			for (int i = 0; i < num; i++)
			{
				b1.add(sc.nextInt());
			}
			//b1.display();
			int delNum = sc.nextInt();
			for (int i = 0; i < delNum; i++)
			{
				b1.remove(sc.nextInt());
			}
			
			b1.preorderTraversal();
		}
		sc.close();
	}
}


/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 04-May-2020
*/

package trees;

import java.util.LinkedList;
import java.util.Queue;




public class AVLTree
{
	private Node root;
	private int size;
	static final int count = 10;

	private class Node
	{
		int data;
		int height;
		Node left;
		Node right;

		Node(int data)
		{
			this.data = data;
			// since this will, be leaf node its height is 1
			this.height = 1;
			this.left = null;
			this.right = null;
		}
		//I am considering here height of null node to be 0;
		// it simplifies the code
	}

	public int size()
	{
		return this.size;
	}

	public void display()
	{
		this.display(this.root);
	}

	public void insert(int data)
	{
		this.root = this.insert(this.root, data);
	}

	private Node insert(Node node, int data)
	{
		if (node == null)
		{
			Node newNode = new Node(data);
			return newNode;
		}
		if (data > node.data)
		{
			// go in right subtree
			node.right = this.insert(node.right, data);
		} else if (data < node.data)
		{
			// go in left subtree
			node.left = this.insert(node.left, data);
		}
		node.height=1 + Math.max(getHeightOfNode(node.left), getHeightOfNode(node.right));
		
		int balanceFactor = checkBalanceFactor(node);
		
		if (balanceFactor > 1 && data < node.left.data)
		{
			// LL Condition therefore right rotate
			return rightRotate(node);
		} 
		if (balanceFactor < -1 && data > node.right.data)
		{
			// RR condition therefore left rotate
			return leftRotate(node);
		}
		
		if (balanceFactor > 1 && data > node.left.data)
		{
			// LR Condition therefore first left rotate and then right rotate
//			  c(node)                     	    c                                          a
//			/  \                              /   \                                      /  \
//		   b    T4 						     a    T4                                    b    c
//		 /   \      ===leftRotate(b)===>   /  \             ===rightRotate(c)===>     / \   /  \
//		T1   a                            b    T3                                    T1 T2 T3  T4             
//		    / \                           /  \
//		   T2 T3                         T1   T2
//		
			node.left = leftRotate(node.left);
			return rightRotate(node);
		} 
		if (balanceFactor < -1 && data < node.right.data)
		{
			// RL Condition therefore first right rotate and then left rotate
//			  c(node)                     	    c                                          a
//			/  \                              /   \                                      /    \
//		   T4    b 						     T4    a                                    c      b
//		       /   \  ===rightRotate(b)===>      /  \       ===leftRotate(c)===>      /  \    /  \
//		       a    T3                          T1   b                               T4  T1  T2   T3             
//		      / \                                  /  \                                    
//		      T1 T2                               T2   T3                              
//		
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	// right rotate
	private Node rightRotate(Node node)
	{
//     My Assume Structure T's are subtree		
//		c(node)
//		/     \
//		b     T4
//      / \
//      c  T3
//    /  \
//    T1 T2
// -------------------------------
//		after right rotate
//		    b
//		  /   \
//		 a      c
//		/  \   / \ 
//	   T1  T2 T3  T4
		// lets assign the nodes
		Node b = node.left;
		Node T3 = b.right;
		// lets right rotate
		b.right = node;
		node.left = T3;
		// lets update height & order is important
		node.height = Math.max(getHeightOfNode(node.left), getHeightOfNode(node.right)) + 1;
		b.height = Math.max(getHeightOfNode(b.left), getHeightOfNode(b.right)) + 1;
		return b;
	}
	
	// left rotate
	private Node leftRotate(Node node)
	{
//	     My Assume Structure T's are subtree		
//			c(node)
//			/     \
//			T4     b
//	            /    \
//	            T3    a
//	                /   \
//	                T1  T2
//		----------------------------
//		after left rotate
//		        b
//		       /  \
//		       c    a
//		      / \   / \
//		     T4 T3 T1 T2
//		      
		// lets assign the nodes
		Node b = node.right;
		Node T3 = b.left;
		// lets rotate
		b.left = node;
		node.right = T3;
		// lets update the height height is dependent on its sub tree since T1 n T2
		// are not chsanging there fore a height wont be affected
		node.height = Math.max(getHeightOfNode(node.left), getHeightOfNode(node.right)) + 1;
		b.height = Math.max(getHeightOfNode(b.left), getHeightOfNode(b.right)) + 1;
		return b;
	}
	private int checkBalanceFactor(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return getHeightOfNode(node.left)-getHeightOfNode(node.right);
	}
	private int getHeightOfNode(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.height;
	}
	private Node remove(Node node, int val)
	{
		if (node == null)
		{
			System.out.println("Value not found ");
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
				// if two child , we have two option to find samllest from right subtree of it
				// or find maximum from left subtree and replace it with node to be removed
				Node maxFromLeft = this.max(node.left);
				node.data = maxFromLeft.data;
				this.remove(node.left, maxFromLeft.data);
				// remove that max node from left substree
			}
		}
		return node;
	}

	public void printAVLTree()
	{
		this.printAVLTree(this.root, 0);
	}

	private void printAVLTree(Node node, int space)
	{
		if (root == null)
		{
			System.out.println("AVL Tree is empty");
			return;
		}
		if (node == null)
		{

			return;
		}
		// we do inOrder traversal here
		// increase distance between levels
		space += count;
		// process from right
		printAVLTree(node.right, space);
		// print current node after space
		for (int i = count; i < space; i++)
		{
			System.out.print(" ");
		}
		System.out.println(node.data);
		// process from left
		printAVLTree(node.left, space);
		return;
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
		System.out.print("PreOrder Traversal :\t");
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

/* https://github.com/shahiddhariwala */
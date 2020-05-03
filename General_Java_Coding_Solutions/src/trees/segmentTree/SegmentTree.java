/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees.segmentTree;

public class SegmentTree
{
	private class Node
	{
		int data;
		int startInterval;
		int endInterval;
		Node left;
		Node right;
	}

	Node root;

	public SegmentTree(int arr[])
	{
		this.root = constructTree(arr, 0, arr.length - 1);
	}

	private Node constructTree(int[] arr, int si, int ei)
	{
		if (si == ei)
		{
			Node leafNode = new Node();
			leafNode.data = arr[si];
			leafNode.startInterval = si;
			leafNode.endInterval = ei;
			return leafNode;
		}
		Node node = new Node();
		node.startInterval = si;
		node.endInterval = ei;

		int mid = si + ((ei - si) / 2);
		node.left = this.constructTree(arr, si, mid);
		node.right = this.constructTree(arr, mid + 1, ei);

		// + we can change the operator depending upon the use
		node.data = node.left.data + node.right.data;
		return node;
	}

	public void display()
	{
		this.display(this.root);
	}

	private void display(Node node)
	{
		if (node.left == null && node.right == null)
		{
			System.out.printf("NULL => \t\t\tInterval [%d,%d], data = %d\t <= NULL \n", node.startInterval, node.endInterval,
					node.data);
			return;
		}
		System.out.printf("Interval [%d,%d], data = %d => \tInterval [%d,%d], data = %d\t <= Interval [%d,%d], data = %d\n", node.left.startInterval, node.left.endInterval, node.left.data,
				node.startInterval, node.endInterval, node.data, node.right.startInterval, node.right.endInterval,
				node.right.data);
		this.display(node.left);
		this.display(node.right);
	}

}

/* https://github.com/shahiddhariwala */
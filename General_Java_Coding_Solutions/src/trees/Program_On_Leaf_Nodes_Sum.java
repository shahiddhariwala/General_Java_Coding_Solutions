/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

public class Program_On_Leaf_Nodes_Sum
{
	/*
	 * 
	 * 
	 * public int sumOfLeafNodes()
	 * {
	 * return this.sumOfLeadNodes(this.root);
	 * }
	 * 
	 * private int sumOfLeadNodes(Node node)
	 * {
	 * if (node == null)
	 * return 0;
	 * if (node.left == null && node.right == null)
	 * {
	 * // if tis leaf node then add it to sum
	 * return node.data;
	 * }
	 * 
	 * int leftLeafs = this.sumOfLeadNodes(node.left);
	 * int rightLeafs = this.sumOfLeadNodes(node.right);
	 * return leftLeafs + rightLeafs;
	 * 
	 * }
	 */
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		// Input 50 true 25 true 38 false false true 48 true 18 false false false true
		// 45 true 85 false false true 60 false false
		bt.display();
		bt.preorderTraversal();
		bt.postorderTraversal();
		bt.inorderTraversal();
		bt.levelorderTraversal();
		bt.iterativeInorderTraversal();
		System.out.println("\nSum of Leaf Nodes is " + bt.sumOfLeafNodes());// TODO Auto-generated method stub
		/*
		 * Enter the data of root node
		 * 50 true 25 true 38 false false true 48 true 18 false false false true 45 true
		 * 85 false false false
		 * Do you have left child of 50
		 * Enter the data of left child of 50
		 * Do you have left child of 25
		 * Enter the data of left child of 25
		 * Do you have left child of 38
		 * Do you have right child of 38
		 * Do you have right child of 25
		 * Enter the data of right child of 25
		 * Do you have left child of 48
		 * Enter the data of left child of 48
		 * Do you have left child of 18
		 * Do you have right child of 18
		 * Do you have right child of 48
		 * Do you have right child of 50
		 * Enter the data of right child of 50
		 * Do you have left child of 45
		 * Enter the data of left child of 45
		 * Do you have left child of 85
		 * Do you have right child of 85
		 * Do you have right child of 45
		 * 25=>50<=45
		 * 38=>25<=48
		 * END=>38<=END
		 * 18=>48<=END
		 * END=>18<=END
		 * 85=>45<=END
		 * END=>85<=END
		 * PreOrder Traversal : 50 25 38 48 18 45 85
		 * PostOrder Traversal : 38 18 48 25 85 45 50
		 * InOrder Traversal : 38 25 18 48 50 85 45
		 * LevelOrder Traversal : 50 25 45 38 48 85 18
		 * Iterative Inorder Traversal : [38, 25, 18, 48, 50, 85, 45]
		 * Sum of Leaf Nodes is 141
		 */
	}

}

/* https://github.com/shahiddhariwala */
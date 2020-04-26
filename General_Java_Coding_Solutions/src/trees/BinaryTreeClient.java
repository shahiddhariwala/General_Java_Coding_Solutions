/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

public class BinaryTreeClient
{

	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		// Input : 50 true 25 true 38 false false true 48 true 18 false false false true
		// 45 true 85 false false true 60 false false
		bt.display();
		System.out.println("Number of Nodes in Tree is " + bt.size());
		System.out.println("Height of Tree is " + bt.height());
		bt.preorderTraversal();
		bt.inorderTraversal();
		bt.postorderTraversal();
		bt.levelorderTraversal();
		/*
		 * Enter the data of root node
		 * 50
		 * Do you have left child of 50
		 * true
		 * Enter the data of left child of 50
		 * 25
		 * Do you have left child of 25
		 * true
		 * Enter the data of left child of 25
		 * 38
		 * Do you have left child of 38
		 * false
		 * Do you have right child of 38
		 * false
		 * Do you have right child of 25
		 * true
		 * Enter the data of right child of 25
		 * 48
		 * Do you have left child of 48
		 * true
		 * Enter the data of left child of 48
		 * 18
		 * Do you have left child of 18
		 * false
		 * Do you have right child of 18
		 * false
		 * Do you have right child of 48
		 * false
		 * Do you have right child of 50
		 * true
		 * Enter the data of right child of 50
		 * 45
		 * Do you have left child of 45
		 * true
		 * Enter the data of left child of 45
		 * 85
		 * Do you have left child of 85
		 * false
		 * Do you have right child of 85
		 * false
		 * Do you have right child of 45
		 * true
		 * Enter the data of right child of 45
		 * 60
		 * Do you have left child of 60
		 * false
		 * Do you have right child of 60
		 * false
		 * 25=>50<=45
		 * 38=>25<=48
		 * END=>38<=END
		 * 18=>48<=END
		 * END=>18<=END
		 * 85=>45<=60
		 * END=>85<=END
		 * END=>60<=END
		 * Number of Nodes in Tree is 8
		 * Height of Tree is 3
		 * PreOrder Traversal : 50 25 38 48 18 45 85 60
		 * InOrder Traversal : 38 25 18 48 50 85 45 60
		 * PostOrder Traversal : 38 18 48 25 85 60 45 50
		 * LevelOrder Traversal :	50 25 45 38 48 85 60 18 
		 */

	}

}

/* https://github.com/shahiddhariwala */
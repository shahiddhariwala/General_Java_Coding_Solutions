/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

public class Program_To_Check_BT_IsBST
{

	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		// input 50 true 25 true 12 false false true 37 false false true 75 true 62
		// false false true 87 false false
		bt.display();
		bt.preorderTraversal();
		bt.postorderTraversal();
		bt.inorderTraversal();
		bt.levelorderTraversal();
		System.out.println("Check is given tree a BST ? " + bt.isBST());
		System.out.println("Check is given tree a BST ? " + bt.isBST2());
		/*
		 * Enter the data of root node
		 * 50 true 25 true 12 false false true 37 false false true 75 true 62 false
		 * false true 87 false false
		 * Do you have left child of 50
		 * Enter the data of left child of 50
		 * Do you have left child of 25
		 * Enter the data of left child of 25
		 * Do you have left child of 12
		 * Do you have right child of 12
		 * Do you have right child of 25
		 * Enter the data of right child of 25
		 * Do you have left child of 37
		 * Do you have right child of 37
		 * Do you have right child of 50
		 * Enter the data of right child of 50
		 * Do you have left child of 75
		 * Enter the data of left child of 75
		 * Do you have left child of 62
		 * Do you have right child of 62
		 * Do you have right child of 75
		 * Enter the data of right child of 75
		 * Do you have left child of 87
		 * Do you have right child of 87
		 * 25=>50<=75
		 * 12=>25<=37
		 * END=>12<=END
		 * END=>37<=END
		 * 62=>75<=87
		 * END=>62<=END
		 * END=>87<=END
		 * PreOrder Traversal : 50 25 12 37 75 62 87
		 * PostOrder Traversal : 12 37 25 62 87 75 50
		 * InOrder Traversal : 12 25 37 50 62 75 87
		 * LevelOrder Traversal : 50 25 75 12 37 62 87
		 * Check is given tree a BST ? true
		 * Check is given tree a BST ? true
		 */
		
		
		
		// input 50 true 25 true 12 false false true 37 false false true 35 true 62
		// false false true 87 false false
		// System.out.println("Check is given tree a BST ? "+bt.isBST());
		// System.out.println("Check is given tree a BST ? " + bt.isBST2());
		
		
		/*
		 * Enter the data of root node
		 * 50 true 25 true 12 false false true 37 false false true 35 true 62 false
		 * false true 87 false false
		 * Do you have left child of 50
		 * Enter the data of left child of 50
		 * Do you have left child of 25
		 * Enter the data of left child of 25
		 * Do you have left child of 12
		 * Do you have right child of 12
		 * Do you have right child of 25
		 * Enter the data of right child of 25
		 * Do you have left child of 37
		 * Do you have right child of 37
		 * Do you have right child of 50
		 * Enter the data of right child of 50
		 * Do you have left child of 35
		 * Enter the data of left child of 35
		 * Do you have left child of 62
		 * Do you have right child of 62
		 * Do you have right child of 35
		 * Enter the data of right child of 35
		 * Do you have left child of 87
		 * Do you have right child of 87
		 * 25=>50<=35
		 * 12=>25<=37
		 * END=>12<=END
		 * END=>37<=END
		 * 62=>35<=87
		 * END=>62<=END
		 * END=>87<=END
		 * PreOrder Traversal : 50 25 12 37 35 62 87
		 * PostOrder Traversal : 12 37 25 62 87 35 50
		 * InOrder Traversal : 12 25 37 50 62 35 87
		 * LevelOrder Traversal : 50 25 35 12 37 62 87
		 * Check is given tree a BST ? false
		 * Check is given tree a BST ? false
		 */

	}

}

/* https://github.com/shahiddhariwala */
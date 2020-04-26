/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

public class BinarySearchTree_Client
{

	public static void main(String[] args)
	{
		
		System.out.println("--------------Creating BST Instance by Adding Number 1 by 1-----------------");
		BinarySearchTree bst = new BinarySearchTree();
		int inputLevelOrderArr[] =
		{ 60, 40, 80, 30, 50, 70, 90, 45, 55, 85, 100 };

		for (int in : inputLevelOrderArr)
		{
			bst.add(in);
		}

		bst.display();
		System.out.println("Number of Nodes in Tree is " + bst.size());
		System.out.println("Height of Tree is " + bst.height());
		bst.preorderTraversal();
		bst.inorderTraversal();
		// Inorder travel in bst will always be in ascending order i.e sorted in non
		// decreasing order
		bst.postorderTraversal();
		bst.levelorderTraversal();
		System.out.println("Find 90 ? " + bst.contains(90));
		System.out.println("Find 91 ? " + bst.contains(91));
		System.out.println("Find 91 ? " + bst.contains(91));
		System.out.println("Max in BST ? " + bst.max());
		/*
		 *
		 * 60 40 80 30 50 70 90 45 55 85 100 -1
		 * 40=>60<=80
		 * 30=>40<=50
		 * END=>30<=END
		 * 45=>50<=55
		 * END=>45<=END
		 * END=>55<=END
		 * 70=>80<=90
		 * END=>70<=END
		 * 85=>90<=100
		 * END=>85<=END
		 * END=>100<=END
		 * Number of Nodes in Tree is 11
		 * Height of Tree is 3
		 * PreOrder Traversal : 60 40 30 50 45 55 80 70 90 85 100
		 * InOrder Traversal : 30 40 45 50 55 60 70 80 85 90 100
		 * PostOrder Traversal : 30 45 55 50 40 70 85 100 90 80 60
		 * LevelOrder Traversal : 60 40 80 30 50 70 90 45 55 85 100
		 * Find 90 ? true
		 * Find 91 ? false
		 * Find 91 ? false
		 * Max in BST ? 100
		 * 
		 */

		System.out.println("\n\n--------------Creating BST Instance by Passing Inorder Array-----------------");
		int inputInOrderArr[] =
		{ 30, 40, 45, 50, 55, 60, 70, 80, 85, 90, 100 };
		BinarySearchTree bst2 = new BinarySearchTree(inputInOrderArr);
		bst2.display();
		System.out.println("Number of Nodes in Tree is " + bst2.size());
		System.out.println("Height of Tree is " + bst2.height());
		bst2.preorderTraversal();
		bst2.inorderTraversal();
		bst2.postorderTraversal();
		bst2.levelorderTraversal();
		System.out.println("Max in BST ? " + bst2.max());
	}

}

/* https://github.com/shahiddhariwala */
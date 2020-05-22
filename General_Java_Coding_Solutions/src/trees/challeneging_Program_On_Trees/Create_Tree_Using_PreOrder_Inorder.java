/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/

/*
 * Given preorder and inorder create the tree

Input Format
Enter the size of the preorder array N then add N more elements and store in the array denoting the preorder traversal of the tree. Then enter the size of the inorder array M and add M more elements and store the inorder traversal of the array.

Constraints
1 <= N, M <= 10^4

Output Format
Display the tree using a modified preorder function. For each node , first print its left child's data , then the data of the root itself , then the data of its right child. Do this for each node in a new line in preorder manner. If one of the children does not exist print END in its place. Refer to the sample testcase.

Sample Input
3
1 2 3
3
3 2 1
Sample Output
2 => 1 <= END
3 => 2 <= END
END => 3 <= END
Explanation
The above tree looks like

         1
       /
     2
   /
 3
 */
package trees.challeneging_Program_On_Trees;


import java.util.Scanner;

public class Create_Tree_Using_PreOrder_Inorder
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
		num = sc.nextInt();
		int arrInOrdr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arrInOrdr[i] = sc.nextInt();
		}
		Tree tree = new Tree(preOrder,arrInOrdr);
		tree.display();
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
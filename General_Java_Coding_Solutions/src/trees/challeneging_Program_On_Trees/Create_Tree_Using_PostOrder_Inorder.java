/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 21-May-2020
*/

/*
 * Given postorder and inorder traversal of a tree. Create the original tree on given information.

Input Format
Enter the size of the postorder array N then add N more elements and store in the array, then enter the size of the inorder array M and add M more elements and store in the array. here M and N are same.

Constraints
None

Output Format
Display the tree using the display function

Sample Input
3
1
3
2
3
1
2
3
Sample Output
1 => 2 <= 3
END => 1 <= END
END => 3 <= END
 */
package trees.challeneging_Program_On_Trees;


import java.util.Scanner;

public class Create_Tree_Using_PostOrder_Inorder
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
		
		Tree(int arrPostOrdr[],int arrInOrdr[])
		{
			this.root = this.buildTree(0,arrInOrdr.length-1,arrPostOrdr,arrInOrdr,arrInOrdr.length-1);
		}

		private Node buildTree(int start, int end, int[] arrPostOrdr, int[] arrInOrdr,int postIndex)
		{
			if(end<start || start < 0 || postIndex < 0)
			{
				return null;
			}
			int data = arrPostOrdr[postIndex];
			Node newNode = new Node(data);
			 /* If this node has no children then return */
	        if (end == start) 
	            return newNode; 
			
			int index;
			for(index = start;index <= end;index++)
			{
				if(arrInOrdr[index]==arrPostOrdr[postIndex])
				{
					break;
				}
			}
			
			// postIndex for left side  
			newNode.left = buildTree(start, index-1, arrPostOrdr, arrInOrdr,postIndex-(index-start)-1 );
			newNode.right = buildTree(index+1, end, arrPostOrdr, arrInOrdr,postIndex-1);
			
			
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
		int arrPostOrdr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arrPostOrdr[i] = sc.nextInt();
		}
		num = sc.nextInt();
		int arrInOrdr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arrInOrdr[i] = sc.nextInt();
		}
		Tree tree = new Tree(arrPostOrdr,arrInOrdr);
		tree.display();
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
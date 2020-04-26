/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package trees;

public class GenereicTree_Client
{

	public static void main(String[] args)
	{
		GenericTree gt = new GenericTree();
		/*
		 * Input
		 * 60 3 41 2 17 0 16 0 15 1 21 0 24 2 33 0 84 0
		 * 
		 */
		gt.display();
		/*
		 * Enter the data of root Node
		 * 60
		 * Enter the Number of Children of 60
		 * 3
		 * Enter the data of child:1 of 60
		 * 41
		 * Enter the Number of Children of 41
		 * 2
		 * Enter the data of child:1 of 41
		 * 17
		 * Enter the Number of Children of 17
		 * 0
		 * Enter the data of child:2 of 41
		 * 16
		 * Enter the Number of Children of 16
		 * 0
		 * Enter the data of child:2 of 60
		 * 15
		 * Enter the Number of Children of 15
		 * 1
		 * Enter the data of child:1 of 15
		 * 21
		 * Enter the Number of Children of 21
		 * 0
		 * Enter the data of child:3 of 60
		 * 24
		 * Enter the Number of Children of 24
		 * 2
		 * Enter the data of child:1 of 24
		 * 33
		 * Enter the Number of Children of 33
		 * 0
		 * Enter the data of child:2 of 24
		 * 84
		 * Enter the Number of Children of 84
		 * 0
		 * 60 => 41, 15, 24, END
		 * 41 => 17, 16, END
		 * 17 => END
		 * 16 => END
		 * 15 => 21, END
		 * 21 => END
		 * 24 => 33, 84, END
		 * 33 => END
		 * 84 => END
		 * 
		 */
	}

}

/* https://github.com/shahiddhariwala */
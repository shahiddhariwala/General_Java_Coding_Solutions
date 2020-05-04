/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 05-May-2020
*/


package trees;

public class AVLTree_Client
{

	public static void main(String[] args)
	{
		AVLTree avl = new AVLTree();
		for (int i = 1; i <= 5 ; i++)
		{
			avl.insert(i*10);
		}
		avl.display();
		avl.printAVLTree();
		
		//Normal BST for 10,20,30,40,50 insertion
//				END=>10<=20
//				END=>20<=30
//				END=>30<=40
//				END=>40<=50
//				END=>50<=END
//				                                        50
//				                              40
//				                    30
//				          20
//				10

		
		//Balanced BST i.e AVL
//				10=>20<=40
//				END=>10<=END
//				30=>40<=50
//				END=>30<=END
//				END=>50<=END
//				                    50
//				          40
//				                    30
//				20
//				          10

		
	}

}



/*https://github.com/shahiddhariwala*/
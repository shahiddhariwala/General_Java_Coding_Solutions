/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class Stack_Using_LinkedList_Client
{

	public static void main(String[] args) throws Exception
	{
		Stack_Using_LinkedList stack = new Stack_Using_LinkedList();
		System.out.println("Is Empty ? " + stack.isEmpty());
		for (int i = 1; i <= 10; i++)
		{
			stack.push(i * 10);
		}
		System.out.print("Stack=>\t");
		stack.display();
		System.out.println("Is Empty ? " + stack.isEmpty());
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Stack=>\t");
			stack.display();
			System.out.println("\tSize " + stack.size());
			System.out.println("\tAt top : " + stack.peek());
			System.out.println("\tPopped " + stack.pop());
			System.out.println("\tSize " + stack.size());
		}
		/*
		 * Is Empty ? true
		 * Stack=> 100 90 80 70 60 50 40 30 20 10
		 * Is Empty ? false
		 * Stack=> 100 90 80 70 60 50 40 30 20 10
		 * Size 10
		 * At top : 100
		 * Popped 100
		 * Size 9
		 * Stack=> 90 80 70 60 50 40 30 20 10
		 * Size 9
		 * At top : 90
		 * Popped 90
		 * Size 8
		 * Stack=> 80 70 60 50 40 30 20 10
		 * Size 8
		 * At top : 80
		 * Popped 80
		 * Size 7
		 * Stack=> 70 60 50 40 30 20 10
		 * Size 7
		 * At top : 70
		 * Popped 70
		 * Size 6
		 * Stack=> 60 50 40 30 20 10
		 * Size 6
		 * At top : 60
		 * Popped 60
		 * Size 5
		 * Stack=> 50 40 30 20 10
		 * Size 5
		 * At top : 50
		 * Popped 50
		 * Size 4
		 * Stack=> 40 30 20 10
		 * Size 4
		 * At top : 40
		 * Popped 40
		 * Size 3
		 * Stack=> 30 20 10
		 * Size 3
		 * At top : 30
		 * Popped 30
		 * Size 2
		 * Stack=> 20 10
		 * Size 2
		 * At top : 20
		 * Popped 20
		 * Size 1
		 * Stack=> 10
		 * Size 1
		 * At top : 10
		 * Popped 10
		 * Size 0
		 */
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Stack_Using_Queue_Client
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * We have Two Version
		 * Version 1 - > Effiecint Push ; push = O(1), pop = O(N) , peek= O(N) and
		 * Display = O(N);
		 * Version 2 - > Effiecint Pop ; push = O(N), pop = O(1) , peek= O(1) and
		 * Display = O(N);
		 */

		System.out.println("\t Version 1");
		System.out.println("\tEfficient Push");
		Stack_Using_Queue_Push_Efficient s1 = new Stack_Using_Queue_Push_Efficient();
		for (int i = 1; i <= 5; i++)
		{
			s1.push(i * 11);

		}
		s1.display();

		for (int i = 1; i <= 5; i++)
		{
			s1.display();
			System.out.println("Top " + s1.peek());
			System.out.println("Size " + s1.size());
			System.out.println("is Empty ? " + s1.isEmpty());
			System.out.println("Popped " + s1.pop());
		}
		System.out.println("is Empty ? " + s1.isEmpty());

		System.out.println("\t Version 2");
		System.out.println("\tEfficient Pop");
		Stack_Using_Queue_Pop_Efficient s2 = new Stack_Using_Queue_Pop_Efficient();
		for (int i = 1; i <= 5; i++)
		{
			s2.push(i * 11);

		}
		s2.display();

		for (int i = 1; i <= 5; i++)
		{
			s2.display();
			System.out.println("Top " + s2.peek());
			System.out.println("Size " + s2.size());
			System.out.println("is Empty ? " + s2.isEmpty());
			System.out.println("Popped " + s2.pop());
		}
		System.out.println("is Empty ? " + s2.isEmpty());
	}
	/*
	 * Efficient Push
	 * [ 55, 44, 33, 22, 11, END ]
	 * [ 55, 44, 33, 22, 11, END ]
	 * Top 55
	 * Size 5
	 * is Empty ? false
	 * Popped 55
	 * [ 44, 33, 22, 11, END ]
	 * Top 44
	 * Size 4
	 * is Empty ? false
	 * Popped 44
	 * [ 33, 22, 11, END ]
	 * Top 33
	 * Size 3
	 * is Empty ? false
	 * Popped 33
	 * [ 22, 11, END ]
	 * Top 22
	 * Size 2
	 * is Empty ? false
	 * Popped 22
	 * [ 11, END ]
	 * Top 11
	 * Size 1
	 * is Empty ? false
	 * Popped 11
	 * is Empty ? true
	 * Version 2
	 * Efficient Pop
	 * [ 55, 44, 33, 22, 11, END ]
	 * [ 55, 44, 33, 22, 11, END ]
	 * Top 55
	 * Size 5
	 * is Empty ? false
	 * Popped 55
	 * [ 44, 33, 22, 11, END ]
	 * Top 44
	 * Size 4
	 * is Empty ? false
	 * Popped 44
	 * [ 33, 22, 11, END ]
	 * Top 33
	 * Size 3
	 * is Empty ? false
	 * Popped 33
	 * [ 22, 11, END ]
	 * Top 22
	 * Size 2
	 * is Empty ? false
	 * Popped 22
	 * [ 11, END ]
	 * Top 11
	 * Size 1
	 * is Empty ? false
	 * Popped 11
	 * is Empty ? true
	 * 
	 */

}

/* https://github.com/shahiddhariwala */
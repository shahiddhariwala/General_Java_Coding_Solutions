/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Program_To_Reverse_A_Queue
{

	public static void main(String[] args) throws Exception
	{
		Dynamic_Queue q1 = new Dynamic_Queue();
		for (int i = 1; i <= 5; i++)
		{
			q1.enqueue(i * 11);
		}
		q1.display();//Original Queue
		// [ 11, 22, 33, 44, 55, END ]
		reverseQueue(q1);
		q1.display();// Reverse Queue
		//  [ 55, 44, 33, 22, 11, END ]
		

	}

	private static void reverseQueue(Dynamic_Queue q1) throws Exception
	{
		if (q1.isEmpty())
		{
			return;
		}
		int item = q1.dequeue();
		reverseQueue(q1);
		q1.enqueue(item);

	}

}

/* https://github.com/shahiddhariwala */
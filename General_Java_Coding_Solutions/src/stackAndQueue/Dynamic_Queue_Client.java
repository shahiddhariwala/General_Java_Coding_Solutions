/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Dynamic_Queue_Client
{

	public static void main(String[] args) throws Exception
	{
		QueueA q1 = new Dynamic_Queue(5);
		for (int i = 1; i <= 5; i++)
		{
			q1.enqueue(i * 11);
		}
		q1.display();
		q1.enqueue(66);
		q1.display();
		q1.enqueue(77);
		for (int i = 1; i <= 5; i++)
		{
			q1.enqueue(i * 111);
		}
		q1.display();
		while (!q1.isEmpty())
		{
			System.out.println("Size = " + q1.size());
			System.out.println("Front -> " + q1.front());
			q1.display();
			System.out.println("Removed " + q1.dequeue());
		}
		System.out.println("-----------END---------------");
		q1.enqueue(786);
		q1.display();
		/*
		 * [ 11, 22, 33, 44, 55, END ]
		 * [ 11, 22, 33, 44, 55, 66, END ]
		 * [ 11, 22, 33, 44, 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Size = 12
		 * Front -> 11
		 * [ 11, 22, 33, 44, 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 11
		 * Size = 11
		 * Front -> 22
		 * [ 22, 33, 44, 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 22
		 * Size = 10
		 * Front -> 33
		 * [ 33, 44, 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 33
		 * Size = 9
		 * Front -> 44
		 * [ 44, 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 44
		 * Size = 8
		 * Front -> 55
		 * [ 55, 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 55
		 * Size = 7
		 * Front -> 66
		 * [ 66, 77, 111, 222, 333, 444, 555, END ]
		 * Removed 66
		 * Size = 6
		 * Front -> 77
		 * [ 77, 111, 222, 333, 444, 555, END ]
		 * Removed 77
		 * Size = 5
		 * Front -> 111
		 * [ 111, 222, 333, 444, 555, END ]
		 * Removed 111
		 * Size = 4
		 * Front -> 222
		 * [ 222, 333, 444, 555, END ]
		 * Removed 222
		 * Size = 3
		 * Front -> 333
		 * [ 333, 444, 555, END ]
		 * Removed 333
		 * Size = 2
		 * Front -> 444
		 * [ 444, 555, END ]
		 * Removed 444
		 * Size = 1
		 * Front -> 555
		 * [ 555, END ]
		 * Removed 555
		 * -----------END---------------
		 * [ 786, END ]
		 */
	}

}

/* https://github.com/shahiddhariwala */
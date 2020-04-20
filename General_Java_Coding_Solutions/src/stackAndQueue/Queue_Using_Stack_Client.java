/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Queue_Using_Stack_Client
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * We are given Primary and Secondary Stack
		 * We can only use the functions of stack to implement the queue
		 * Version 1 -> Enqueue (O(1)), Dequeue(O(n)), Front(O(n)),Display(O(n)) =>
		 * Enqueue Efficient Approach
		 * Version 2 -> Enqueue (O(n)), Dequeue(O(1)), Front(O(1)),Display(O(n)) =>
		 * Dequeue Efficient Approach
		 */

		long startTime = System.nanoTime();
		System.out.println("\t---------VERSION 1---------\n--------Enqueue Efficient Approach------------");
		Queue_Using_Stack_Enqueue_Efficeint qobj = new Queue_Using_Stack_Enqueue_Efficeint();
		for (int i = 1; i <= 7; i++)
		{
			qobj.enqueue(10 * i);
		}
		qobj.display();
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Front " + qobj.front());
			System.out.println("Size " + qobj.size());
			System.out.println("Removed " + qobj.dequeue());
			qobj.display();
			System.out.println("is Empty ?  " + qobj.isEmpty());
		}
		long endTime = System.nanoTime();
		System.out.println("Total Nanosecond taken to execute => " + (endTime - startTime));
		startTime = System.nanoTime();
		System.out.println("\t---------VERSION 2---------\n--------Dequeue Efficient Approach------------");
		Queue_Using_Stack_Enqueue_Efficeint qdobj = new Queue_Using_Stack_Enqueue_Efficeint();
		for (int i = 1; i <= 7; i++)
		{
			qdobj.enqueue(10 * i);
		}
		qdobj.display();
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Front " + qdobj.front());
			System.out.println("Size " + qdobj.size());
			System.out.println("Removed " + qdobj.dequeue());
			qdobj.display();
			System.out.println("is Empty ?  " + qdobj.isEmpty());
		}
		endTime = System.nanoTime();
		System.out.println("Total Nanosecond taken to execute => " + (endTime - startTime));
		/*
		 * ---------VERSION 1---------
		 * --------Enqueue Efficient Approach------------
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * Front 10
		 * Size 7
		 * Removed 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 20
		 * Size 6
		 * Removed 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 30
		 * Size 5
		 * Removed 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 40
		 * Size 4
		 * Removed 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 50
		 * Size 3
		 * Removed 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Total Nanosecond taken to execute => 26598473
		 * ---------VERSION 2---------
		 * --------Dequeue Efficient Approach------------
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * Front 10
		 * Size 7
		 * Removed 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 20
		 * Size 6
		 * Removed 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 30
		 * Size 5
		 * Removed 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 40
		 * Size 4
		 * Removed 40
		 * 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Front 50
		 * Size 3
		 * Removed 50
		 * 60
		 * 70
		 * is Empty ? false
		 * Total Nanosecond taken to execute => 21010487
		 */
	}

}

/* https://github.com/shahiddhariwala */
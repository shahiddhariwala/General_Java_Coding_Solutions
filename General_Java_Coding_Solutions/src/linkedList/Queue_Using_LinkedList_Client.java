/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class Queue_Using_LinkedList_Client
{

	public static void main(String[] args) throws Exception
	{
		Queue_Using_LinkedList queue = new Queue_Using_LinkedList();
		System.out.println("------------Queue Using LL--------------------");
		System.out.println("Is Empty ? " + queue.isEmpty());
		for (int i = 1; i <= 10; i++)
		{
			queue.enqueue(i * 10);
		}
		System.out.print("Queue=>\t");
		queue.display();
		System.out.print("Reverse Queue=>\t");
		queue.reverse();
		queue.display();
		queue.reverse();
		System.out.println("Is Empty ? " + queue.isEmpty());
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Queue=>\t");
			queue.display();
			System.out.println("\tSize " + queue.size());
			System.out.println("\tAt Front : " + queue.peek());
			System.out.println("\tDequeued " + queue.dequeue());
			System.out.println("\tSize " + queue.size());
		}

		queue.enqueue(11);
		queue.enqueue(21);
		queue.enqueue(31);
		System.out.print("Queue=>\t");
		queue.display();
		System.out.println("\tSize " + queue.size());
		System.out.println("\tAt Front : " + queue.peek());
		/*
		 * ------------Queue Using LL--------------------
		 * Is Empty ? true
		 * Queue=> 10 20 30 40 50 60 70 80 90 100
		 * Reverse Queue=> 100 90 80 70 60 50 40 30 20 10
		 * Is Empty ? false
		 * Queue=> 10 20 30 40 50 60 70 80 90 100
		 * Size 10
		 * At Front : 10
		 * Dequeued 10
		 * Size 9
		 * Queue=> 20 30 40 50 60 70 80 90 100
		 * Size 9
		 * At Front : 20
		 * Dequeued 20
		 * Size 8
		 * Queue=> 30 40 50 60 70 80 90 100
		 * Size 8
		 * At Front : 30
		 * Dequeued 30
		 * Size 7
		 * Queue=> 40 50 60 70 80 90 100
		 * Size 7
		 * At Front : 40
		 * Dequeued 40
		 * Size 6
		 * Queue=> 50 60 70 80 90 100
		 * Size 6
		 * At Front : 50
		 * Dequeued 50
		 * Size 5
		 * Queue=> 60 70 80 90 100
		 * Size 5
		 * At Front : 60
		 * Dequeued 60
		 * Size 4
		 * Queue=> 70 80 90 100
		 * Size 4
		 * At Front : 70
		 * Dequeued 70
		 * Size 3
		 * Queue=> 80 90 100
		 * Size 3
		 * At Front : 80
		 * Dequeued 80
		 * Size 2
		 * Queue=> 90 100
		 * Size 2
		 * At Front : 90
		 * Dequeued 90
		 * Size 1
		 * Queue=> 100
		 * Size 1
		 * At Front : 100
		 * Dequeued 100
		 * Size 0
		 * Queue=> 11 21 31
		 * Size 3
		 * At Front : 11
		 */
	}

}

/* https://github.com/shahiddhariwala */
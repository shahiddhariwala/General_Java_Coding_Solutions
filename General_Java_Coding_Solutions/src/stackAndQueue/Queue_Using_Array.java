/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

class QueueA
{
	protected int size;
	public static final int DEFAULT_CAPACITY = 10;
	protected int front;

	int dataArray[];

	public QueueA()
	{
		this(DEFAULT_CAPACITY);
	}

	public QueueA(int capacity)
	{
		front = 0;
		size = 0;
		this.dataArray = new int[capacity];
	}

	int front() throws Exception
	{
		if (this.size == 0)
			throw new Exception("Queue is Empty");

		return this.dataArray[front];
	}

	int size()
	{
		return this.size;
	}

	void enqueue(int val) throws Exception
	{
		if (this.size() == this.dataArray.length)
		{
			throw new Exception("Queue is Full");
		}
		int availableIndex = (this.front + this.size) % dataArray.length;
		this.dataArray[availableIndex] = val;
		this.size++;

	}

	int dequeue() throws Exception
	{
		if (this.size == 0)
			throw new Exception("Queue is Empty");

		int val = dataArray[this.front];
		this.dataArray[this.front] = 0;
		this.front = (this.front + 1) % dataArray.length;
		size--;
		return val;
	}

	void display() throws Exception
	{
		if (this.size == 0)
			throw new Exception("Queue is Empty");

		System.out.print("[ ");
		for (int i = 0; i < this.size; i++)
		{
			int ai = (this.front + i) % dataArray.length;
			System.out.print(dataArray[ai] + ", ");
		}

		System.out.println("END ]");
	}

	public boolean isEmpty()
	{

		return this.size() == 0;
	}
}

public class Queue_Using_Array
{

	public static void main(String[] args) throws Exception
	{
		QueueA q1 = new QueueA(11);
		q1.enqueue(1);
		q1.enqueue(12);
		q1.enqueue(123);
		q1.enqueue(2341);
		q1.enqueue(12345);
		q1.enqueue(134567);
		q1.enqueue(1222);
		q1.enqueue(12121);
		q1.enqueue(99912121);
		q1.enqueue(313);
		q1.display();
		// [ 1, 12, 123, 2341, 12345, 134567, 1222, 12121, 99912121, 313, END ]

		// q1.enqueue(111);
		// q1.display();
		// Exception in thread "main" java.lang.Exception: Queue is Full
		// at stackAndQueue.QueueA.enqueue(Queue_Using_Array.java:46)
		// at stackAndQueue.Queue_Using_Array.main(Queue_Using_Array.java:92)

		System.out.println("Size = " + q1.size());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		q1.display();
		q1.enqueue(786);
		q1.display();
		System.out.println("Size = " + q1.size());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Size = " + q1.size());
		q1.display();
		System.out.println("isEmpty ? " + q1.isEmpty());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("Removed " + q1.dequeue());
		System.out.println("isEmpty ? " + q1.isEmpty());
		System.out.println("Size = " + q1.size());
		/*
		 * Size = 10
		 * Removed 1
		 * Removed 12
		 * [ 123, 2341, 12345, 134567, 1222, 12121, 99912121, 313, END ]
		 * [ 123, 2341, 12345, 134567, 1222, 12121, 99912121, 313, 786, END ]
		 * Size = 9
		 * Removed 123
		 * Removed 2341
		 * Removed 12345
		 * Removed 134567
		 * Removed 1222
		 * Removed 12121
		 * Removed 99912121
		 * Size = 2
		 * [ 313, 786, END ]
		 * isEmpty ? false
		 * Removed 313
		 * Removed 786
		 * isEmpty ? true
		 * Size = 0
		 */
		
		System.out.println("#################################################################");
		//default capacity
		QueueA q2 = new QueueA();
		
		for (int i = 1; i <= QueueA.DEFAULT_CAPACITY; i++)
		{
			q2.enqueue(i*10);
		}
		q2.display();
		
		while(!q2.isEmpty())
		{
			System.out.println("Front -> "+q2.front());
			q2.display();
			System.out.println("Removed " + q2.dequeue());
			
		}
//		#################################################################
//		[ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, END ]
//		Front -> 10
//		[ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, END ]
//		Removed 10
//		Front -> 20
//		[ 20, 30, 40, 50, 60, 70, 80, 90, 100, END ]
//		Removed 20
//		Front -> 30
//		[ 30, 40, 50, 60, 70, 80, 90, 100, END ]
//		Removed 30
//		Front -> 40
//		[ 40, 50, 60, 70, 80, 90, 100, END ]
//		Removed 40
//		Front -> 50
//		[ 50, 60, 70, 80, 90, 100, END ]
//		Removed 50
//		Front -> 60
//		[ 60, 70, 80, 90, 100, END ]
//		Removed 60
//		Front -> 70
//		[ 70, 80, 90, 100, END ]
//		Removed 70
//		Front -> 80
//		[ 80, 90, 100, END ]
//		Removed 80
//		Front -> 90
//		[ 90, 100, END ]
//		Removed 90
//		Front -> 100
//		[ 100, END ]
//		Removed 100
		

	}

}

/* https://github.com/shahiddhariwala */
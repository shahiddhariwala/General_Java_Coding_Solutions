/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Stack_Using_Queue_Push_Efficient
{
	private Dynamic_Queue primary;
	private Dynamic_Queue secondary;

	public Stack_Using_Queue_Push_Efficient() throws Exception
	{
		primary = new Dynamic_Queue();
		secondary = new Dynamic_Queue();
	}

	void push(int val) throws Exception
	{
		this.primary.enqueue(val);
	}

	int size()
	{
		return this.primary.size();
	}

	int peek() throws Exception
	{
		while(this.primary.size()!=1)
		{
			this.secondary.enqueue(this.primary.dequeue());
		}
		int val = this.primary.dequeue();
		this.secondary.enqueue(val);
		while(!this.secondary.isEmpty())
		{
			this.primary.enqueue(this.secondary.dequeue());
		}
		return val;
	}

	int pop() throws Exception
	{
		while(this.primary.size()!=1)
		{
			this.secondary.enqueue(this.primary.dequeue());
		}
		int val = this.primary.dequeue();
		while(!this.secondary.isEmpty())
		{
			this.primary.enqueue(this.secondary.dequeue());
		}
		return val;
	}

	boolean isEmpty()
	{
		return this.primary.isEmpty();
	}

	void display() throws Exception
	{
		reverseQueue(this.primary);
		this.primary.display();
		reverseQueue(this.primary);
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
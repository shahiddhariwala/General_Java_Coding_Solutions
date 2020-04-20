/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Stack_Using_Queue_Pop_Efficient
{
	private Dynamic_Queue primary;
	private Dynamic_Queue secondary;

	public Stack_Using_Queue_Pop_Efficient() throws Exception
	{
		primary = new Dynamic_Queue();
		secondary = new Dynamic_Queue();
	}

	void push(int val) throws Exception
	{
		
		while(!this.primary.isEmpty())
		{
			this.secondary.enqueue(this.primary.dequeue());
		}
		this.primary.enqueue(val);
		while(!this.secondary.isEmpty())
		{
			this.primary.enqueue(this.secondary.dequeue());
		}
	}

	int size()
	{
		return this.primary.size();
	}

	int peek() throws Exception
	{
		return this.primary.front();
	}

	int pop() throws Exception
	{
		return this.primary.dequeue();
	}

	boolean isEmpty()
	{
		return this.primary.isEmpty();
	}

	void display() throws Exception
	{
		this.primary.display();
	}
}

/* https://github.com/shahiddhariwala */
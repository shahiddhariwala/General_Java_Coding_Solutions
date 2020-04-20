/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Queue_Using_Stack_Dequeue_Efficeint
{

	private Dynamic_Stack primary;
	private Dynamic_Stack secondary;

	public Queue_Using_Stack_Dequeue_Efficeint() throws Exception
	{

		primary = new Dynamic_Stack();
		secondary = new Dynamic_Stack();

	}

	int size()
	{
		return this.primary.size();
	}

	boolean isEmpty()
	{

		return this.primary.isEmpty();
	}

	void enqueue(int val) throws Exception
	{
		while (!this.primary.isEmpty())
		{
			this.secondary.push(this.primary.pop());
		}
		this.secondary.push(val);
		while (!this.secondary.isEmpty())
		{
			this.primary.push(this.secondary.pop());
		}
	}

	int dequeue() throws Exception
	{
		return this.primary.pop();
	}

	int front() throws Exception
	{
		return this.primary.peek();
	}

	void display() throws Exception
	{
		this.primary.display();
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Queue_Using_Stack_Enqueue_Efficeint
{

	private Dynamic_Stack primary;
	private Dynamic_Stack secondary;

	public Queue_Using_Stack_Enqueue_Efficeint() throws Exception
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

	void enqueue(int val)
	{
		this.primary.push(val);
	}

	int dequeue() throws Exception
	{
		while (this.primary.size() != 1 && !this.primary.isEmpty())
		{
			int val = this.primary.pop();
			this.secondary.push(val);
		}
		int temp = this.primary.pop();
		while (!this.secondary.isEmpty())
		{
			int val = this.secondary.pop();
			this.primary.push(val);
		}
		return temp;
	}

	int front() throws Exception
	{
		while (this.primary.size() != 1 && !this.primary.isEmpty())
		{
			int val = this.primary.pop();
			this.secondary.push(val);
		}
		int temp = this.primary.peek();
		while (!this.secondary.isEmpty())
		{
			int val = this.secondary.pop();
			this.primary.push(val);
		}
		return temp;
	}

	void display() throws Exception
	{
		while (!this.primary.isEmpty())
		{
			int val = this.primary.pop();
			this.secondary.push(val);
		}
		this.secondary.display();
		while (!this.secondary.isEmpty())
		{
			int val = this.secondary.pop();
			this.primary.push(val);
		}
	}

}

/* https://github.com/shahiddhariwala */
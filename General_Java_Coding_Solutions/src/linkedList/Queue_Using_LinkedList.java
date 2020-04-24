/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class Queue_Using_LinkedList
{

	private LinkedList dataList;

	public Queue_Using_LinkedList()
	{
		this.dataList = new LinkedList();
	}

	// O(1)
	public void enqueue(int val)
	{
		this.dataList.addLast(val);
	}

	// O(1)
	public int dequeue() throws Exception
	{
		return this.dataList.removeFirst();
	}

	// O(n)
	public void display() throws Exception
	{

		this.dataList.display();

	}

	// O(1)
	public int size()
	{
		return this.dataList.size();
	}

	// O(n)
	public void reverse() throws Exception
	{
		this.dataList.reverseData();
	}

	//O(1)
	public int peek() throws Exception
	{
		return this.dataList.getFirst();
	}
	//O(1)
	public boolean isEmpty()
	{
		return this.dataList.size() == 0;
	}

}

/* https://github.com/shahiddhariwala */
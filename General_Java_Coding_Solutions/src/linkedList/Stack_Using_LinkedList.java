/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class Stack_Using_LinkedList
{
	private LinkedList dataList;

	public Stack_Using_LinkedList()
	{
		this.dataList = new LinkedList();
	}

	// O(1)
	public void push(int val)
	{
		this.dataList.addFirst(val);
	}

	// O(1)
	public int pop() throws Exception
	{
		return this.dataList.removeFirst();
	}

	// O(n)
	public void display()
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

	public int peek() throws Exception
	{
		return this.dataList.getFirst();
	}

	public boolean isEmpty()
	{
		return this.dataList.size()==0;
	}
}

/* https://github.com/shahiddhariwala */
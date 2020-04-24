/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class LinkedList
{
	private Node head;
	private Node tail;
	private int size;

	private class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public void display()
	{
		Node temp = this.head;

		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	public void addLast(int val)
	{
		Node newNode = new Node(val);

		if (this.size == 0)
		{
			this.head = newNode;
			this.tail = newNode;
			this.size += 1;
			return;
		}
		this.size += 1;
		this.tail.next = newNode;
		this.tail = newNode;

	}

	public void addFirst(int val)
	{
		Node newNode = new Node(val);

		if (this.size == 0)
		{
			this.head = newNode;
			this.tail = newNode;
			this.size += 1;
			return;
		}
		this.size += 1;
		newNode.next = head;
		this.head = newNode;

	}

	public int size()
	{
		return this.size;
	}

	public int getFirst() throws Exception
	{
		if (size == 0)
		{
			throw new Exception("LinkedList is Empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception
	{
		if (size == 0)
		{
			throw new Exception("LinkedList is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int i) throws Exception
	{
		if (size == 0)
		{
			throw new Exception("LinkedList is Empty");
		} else if (i > size - 1 || i < 0)
		{
			throw new Exception(i + " Index Out of Bound Exception  " + this.size);
		}
		Node temp = head;
		int count = 0;
		while (count != i)
		{
			temp = temp.next;
			count++;
		}
		return temp.data;
	}

	private Node getNodeAt(int index) throws Exception
	{
		if (size == 0)
		{
			throw new Exception("LinkedList is Empty");
		} else if (index > size - 1 || index < 0)
		{
			throw new Exception(index + " Index Out of Bound Exception  " + this.size);
		}
		Node temp = head;
		for (int i = 0; i < index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	public void addAt(int index)
	{
		
	}
}

/* https://github.com/shahiddhariwala */
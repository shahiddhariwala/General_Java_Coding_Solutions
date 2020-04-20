/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
package challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;

class StackA
{
	public final static int DEFAULT_CAPACITY = 10;
	private int top;
	private int stackArray[];
	private int size;

	public StackA(int size) throws Exception
	{
		if (size < 1)
			throw new Exception("Invalid Capacity");
		this.size = size;
		stackArray = new int[size];
		top = -1;
	}

	public StackA() throws Exception
	{
		this(DEFAULT_CAPACITY);
	}

	void push(int val)
	{
		if (top >= size - 1)
		{
			System.out.println("Stack is Full, Cant Add " + val);
			return;
		}

		top++;
		stackArray[top] = val;
		return;
	}

	int pop() throws Exception
	{
		if (top == -1)
		{
			throw new Exception("Stack is Empty");
		}

		int val = stackArray[top];
		stackArray[top] = 0;
		top--;
		return val;

	}

	int peek() throws Exception
	{
		if (top == -1)
		{
			throw new Exception("Stack is Empty");
		}
		return stackArray[top];
	}

	boolean isEmpty()
	{
		if (top == -1)
			return true;
		return false;

	}

	int size()
	{
		return top + 1;
	}

	void display()
	{
		if (top == -1)
		{
			System.out.println("Stack is Empty");
			return;
		}

		// System.out.println("Stack contains ");
		for (int i = top; i >= 0; i--)
		{
			System.out.println(stackArray[i]);
		}

	}
}

public class Program_to_Reverse_Stack_Using_Recursion_And_Without_Extra_Stack
{

	public static void main(String[] args) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int numItems = sc.nextInt();
		StackA s1 = new StackA(numItems);
		for (int i = 0; i < numItems; i++)
		{
			s1.push(sc.nextInt());
		}
		s1.display();
		reverseStack(s1, 0, 0);
		s1.display();
		sc.close();

	}

	private static int reverseStack(StackA s1, int index, int item) throws Exception
	{
		if (s1.isEmpty())
		{
			return item;
		}
		int itemo = s1.pop();
		int rr=reverseStack(s1, index+1, itemo);
		s1.push(rr);
		return itemo;

	}

}

/* https://github.com/shahiddhariwala */
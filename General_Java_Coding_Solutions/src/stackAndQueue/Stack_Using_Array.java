/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

import java.util.Random;

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

		System.out.println("Stack contains ");
		for (int i = top; i >= 0; i--)
		{
			System.out.println(stackArray[i]);
		}

	}
}

public class Stack_Using_Array
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		StackA stak = new StackA(10);
		System.out.println("Check if stack is Empty : " + stak.isEmpty());
		stak.push(1);
		stak.push(11);
		stak.push(111);
		stak.push(1111);
		stak.push(11111);
		stak.display();
		System.out.println("Size of Stack is " + stak.size());
		int deletedValue = stak.pop();
		System.out.println("Popped value is " + deletedValue);
		stak.display();
		System.out.println("Value at top is " + stak.peek());
		System.out.println("Check if stack is Empty : " + stak.isEmpty());
		System.out.println("Size of Stack is " + stak.size());

		/*
		 * Check if stack is Empty : true
		 * Stack contains
		 * 11111
		 * 1111
		 * 111
		 * 11
		 * 1
		 * Size of Stack is 5
		 * Popped value is 11111
		 * Stack contains
		 * 1111
		 * 111
		 * 11
		 * 1
		 * Value at top is 1111
		 * Check if stack is Empty : false
		 * Size of Stack is 4
		 */
		System.out.println("||||||||||||||||| Stack 2 ||||||||||||||||||");
		// New Stack
		StackA stak2 = new StackA(6);
		stak2.push(2);
		stak2.push(22);
		stak2.push(222);
		stak2.push(2222);
		stak2.push(22222);
		stak2.push(222222);
		System.out.println("Size of Stack is " + stak2.size());
		int deletedValue2 = stak2.pop();
		System.out.println("Popped value is " + deletedValue2);
		stak2.display();
		System.out.println("Value at top is " + stak2.peek());
		System.out.println("Check if stack is Empty : " + stak2.isEmpty());
		System.out.println("Size of Stack is " + stak2.size());
		stak2.push(222222);

		stak2.push(2222222);
		stak2.display();
		/*
		 * ||||||||||||||||| Stack 2 ||||||||||||||||||
		 * Size of Stack is 6
		 * Popped value is 222222
		 * Stack contains
		 * 22222
		 * 2222
		 * 222
		 * 22
		 * 2
		 * Value at top is 22222
		 * Check if stack is Empty : false
		 * Size of Stack is 5
		 * Stack is Full, Cant Add 2222222
		 * Stack contains
		 * 222222
		 * 22222
		 * 2222
		 * 222
		 * 22
		 * 2
		 */

		// Capaity 0 or -ve
		// StackA stak3 = new StackA(0);
		// Exception in thread "main" java.lang.Exception: Invalid Capacity
		// at stackAndQueue.StackA.<init>(Stack_Using_Array.java:19)
		// at stackAndQueue.Stack_Using_Array.main(Stack_Using_Array.java:180)

		System.out.println("||||||||||||||||| Stack 3 ||||||||||||||||||");
		// Stack with default capacity
		StackA stak3 = new StackA();
		Random ran = new Random();
		for (int i = 0; i < StackA.DEFAULT_CAPACITY; i++)
		{
			stak3.push(ran.nextInt(1000));
		}
		stak3.display();
		/*
		 * ||||||||||||||||| Stack 3 ||||||||||||||||||
		 * Stack contains
		 * 757
		 * 160
		 * 734
		 * 749
		 * 381
		 * 790
		 * 619
		 * 325
		 * 498
		 * 338
		 */

	}

}

/* https://github.com/shahiddhariwala */
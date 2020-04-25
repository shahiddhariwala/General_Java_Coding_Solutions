/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
Given a linked list of length N and an integer K , append the last K elements of a linked list to the front. Note that K can be greater than N.

Input Format
First line contains a single integer N denoting the size of the linked list.
Second line contains N space separated integers denoting the elements of the linked list.
Third line contains a single integer K denoting the number of elements that are to be appended.

Constraints
1 <= N <= 10^4
1 <= K <= 10^4

Output Format
Display all the elements in the modified linked list.

Sample Input
7
1 2 2 1 8 5 6
3
Sample Output
8 5 6 1 2 2 1
Explanation
Initially the linked list is
1→ 2→ 3 → 4 → 5 → 6→ null
and k = 2. After appending the last two elements to the front , the new linked list looks like
5→ 6→ 1→ 2→ 3 → 4 → null
*/
package linkedList.challenging_Program_On_LinkedList;

import java.util.Scanner;

public class Program_On_LL_K_Append
{
	static class LinkedList
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

		// O(n)
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

		// O(1)
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

		// O(1)
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

		// O(1)
		public int size()
		{
			return this.size;
		}

		// O(1)
		public int getFirst() throws Exception
		{
			if (size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}
			return this.head.data;
		}

		// O(1)
		public int getLast() throws Exception
		{
			if (size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}
			return this.tail.data;
		}

		// O(n)
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

		// O(n)
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

		// O(n)
		public void addAt(int index, int data) throws Exception
		{

			if (index > size || index < 0)
			{
				throw new Exception(index + " Index Out of Bound Exception  " + this.size);
			}

			// Lets put our Node
			if (index == 0)
			{
				this.addFirst(data);
			} else if (index == this.size)
			{
				this.addLast(data);
			} else
			{
				// Create New Node
				Node newNode = new Node(data);
				// Gets Nodes before Index and Node on that index
				Node prevNode = this.getNodeAt(index - 1);
				Node indexNode = prevNode.next;

				// Insert Node between them
				prevNode.next = newNode;
				newNode.next = indexNode;
				this.size++;
			}

		}

		// O(1)
		public int removeFirst() throws Exception
		{
			if (this.size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}
			Node temp = head;
			if (this.size == 1)
			{
				this.head = null;
				this.tail = null;
			} else
			{
				this.head = temp.next;
			}
			this.size--;
			return temp.data;
		}

		// O(n)
		public int removeLast() throws Exception
		{
			if (this.size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}
			Node temp = tail;
			if (this.size == 1)
			{
				this.head = null;
				this.tail = null;
			} else
			{
				this.tail = this.getNodeAt(this.size - 2);
				this.tail.next = null;
			}
			this.size--;
			return temp.data;
		}

		// O(n)
		public int removeAt(int index) throws Exception
		{
			if (index > size || index < 0)
			{
				throw new Exception(index + " Index Out of Bound Exception  " + this.size);
			}

			if (index == 0)
			{
				return this.removeFirst();
			} else if (index == this.size - 1)
			{
				return this.removeLast();
			} else
			{
				Node prevIndexNode = this.getNodeAt(index - 1);
				Node currentNode = prevIndexNode.next;
				prevIndexNode.next = currentNode.next;
				this.size--;
				return currentNode.data;
			}
		}

		public void reverseData() throws Exception
		{
			if (this.size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}

			if (this.size == 1)
			{
				return;
			} else
			{
				int left = 0;
				int right = this.size - 1;
				while (left < right)
				{
					Node leftNode = getNodeAt(left);
					Node rightNode = getNodeAt(right);

					int temp = leftNode.data;
					leftNode.data = rightNode.data;
					rightNode.data = temp;
					left++;
					right--;
				}
			}
		}

		public void reversePointer() throws Exception
		{
			if (this.size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}

			if (this.size == 1)
			{
				return;
			} else
			{
				Node prev = this.head;
				Node curr = prev.next;

				while (curr != null)
				{
					Node ahead = curr.next;
					curr.next = prev;
					prev = curr;
					curr = ahead;
				}

				// Swap head and tails
				Node temp = this.head;
				this.head = this.tail;
				this.tail = temp;
				tail.next = null;
			}
		}

		public int getMid() throws Exception
		{
			if (this.size == 0)
			{
				throw new Exception("LinkedList is Empty");
			}

			Node slow = this.head;
			Node fast = this.head;

			while (fast.next != null && fast.next.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}

		public void kReverse(int k) throws Exception
		{
			if (this.size() <= 1 || k <= 1)
			{
				return;
			}
			int i = 0;
			while (i < this.size())
			{

				int left = i;
				int right = i + k - 1;
				while (left < right)
				{
					Node leftNode = getNodeAt(left);
					Node rightNode = getNodeAt(right);

					int temp = leftNode.data;
					leftNode.data = rightNode.data;
					rightNode.data = temp;
					left++;
					right--;
				}
				i = i + k;
			}

		}

		public void merge_sorted_list(LinkedList other) throws Exception
		{
			Node temp1 = this.head;
			Node temp2 = other.head;
			LinkedList newList = new LinkedList();
			while (temp1 != null && temp2 != null)
			{
				if (temp1.data > temp2.data)
				{
					newList.addLast(temp2.data);
					temp2 = temp2.next;
				} else
				{
					newList.addLast(temp1.data);
					temp1 = temp1.next;
				}
			}
			while (temp1 != null)
			{
				newList.addLast(temp1.data);
				temp1 = temp1.next;
			}
			while (temp2 != null)
			{
				newList.addLast(temp2.data);
				temp2 = temp2.next;
			}
			this.head = newList.head;
		}

		public void appendLastN(int n) throws Exception
		{
			if (n == this.size || n == 0)
				return;

			n = n % this.size;
			/*
			 * if k>n i.e. number of elements to be appended exceeds n, use k = k%n. Because
			 * after n appending operations all the elements will be back to their original
			 * position.
			 * So in this case:
			 * 7
			 * 1 2 2 1 8 5 6
			 * 11
			 * After 7 times, the linked list will be back to its original position. And
			 * then we have to do the appending for 4 times again.
			 */
			int index = this.size - n - 1 >= 0 ? this.size - n - 1 : 0;
			this.tail.next = this.head;
			Node newTail = this.getNodeAt(index);
			this.head = newTail.next;
			newTail.next = null;
			this.tail = newTail;
		}

	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{

		int N = sc.nextInt();
		// int M = scn.nextInt();

		LinkedList list = new LinkedList();

		for (int i = 0; i < N; i++)
		{
			list.addLast(sc.nextInt());
		}
		int n = sc.nextInt();
		list.appendLastN(n);
		list.display();

	}

}

/* https://github.com/shahiddhariwala */
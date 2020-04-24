/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * Given a head to Linked List L, write a function to reverse the list taking k elements at a time.
 *  Assume k is a factor of the size of List.

You need not have to create a new list. Just reverse the old one using head.

Input Format
The first line contains 2 space separated integers N and K

The next line contains N space separated integral elements of the list.

Constraints
0 <= N <= 10^6 0 <= K <= 10^6

Output Format
Display the linkedlist after reversing every k elements

Sample Input
9 3
9 4 1 7 8 3 2 6 5
Sample Output
1 4 9 3 8 7 5 6 2
Explanation
N = 9 & K = 3

Original LL is : 9 -> 4 -> 1 -> 7 -> 8 -> 3 -> 2 -> 6 -> 5

After k Reverse : 1 -> 4 -> 9 -> 3 -> 8 -> 7 -> 5 -> 6 -> 2
 */

package linkedList.challenging_Program_On_LinkedList;

import java.util.Scanner;

public class Program_To_K_Reverse_LL
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
			int i=0;
			while(i < this.size())
			{
				
				int left = i;
				int right = i+k - 1;
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
				i=i+k;
			}

		}

	}

	public static void main(String[] args) throws Exception
	{
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		for (int i = 0; i < num; i++)
		{
			ll.addLast(sc.nextInt());
		}
		ll.kReverse(k);
		ll.display();
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
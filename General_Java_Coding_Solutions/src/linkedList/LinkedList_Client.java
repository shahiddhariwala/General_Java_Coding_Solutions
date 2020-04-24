/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

public class LinkedList_Client
{

	public static void main(String[] args) throws Exception
	{
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tFirst Item : " + list.getFirst());
		System.out.println("\tLast Item : " + list.getLast());
		/*
		 * 10 20 30
		 * Size : 3
		 * First Item : 10
		 * Last Item : 30
		 */
		list.addFirst(85);
		list.addFirst(133);
		list.addLast(101);
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tFirst Item : " + list.getFirst());
		System.out.println("\tLast Item : " + list.getLast());
		System.out.println("\tItem at 2nd Position is " + list.getAt(2));
		/*
		 * 133 85 10 20 30 101
		 * Size : 6
		 * First Item : 133
		 * Last Item : 101
		 * Item at 2nd Position is 10
		 */
		list.addAt(2, 1020);
		list.addAt(0, 1);
		list.addAt(list.size(), Integer.MAX_VALUE);
		list.display();
		System.out.println("\tSize : " + list.size());
		list.display();
		System.out.println("\tRemoved " + list.removeFirst());
		System.out.println("\tRemoved " + list.removeFirst());
		System.out.println("\tSize : " + list.size());
		/*
		 * 1 133 85 1020 10 20 30 101 2147483647
		 * Size : 9
		 * 1 133 85 1020 10 20 30 101 2147483647
		 * Removed 1
		 * Removed 133
		 * Size : 7
		 */
		list.display();
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tRemoved " + list.removeLast());
		System.out.println("\tSize : " + list.size());
		list.display();
		/*
		 * 85 1020 10 20 30 101 2147483647
		 * Removed 2147483647
		 * Removed 101
		 * Removed 30
		 * Removed 20
		 * Removed 10
		 * Removed 1020
		 * Removed 85
		 * Size : 0
		 * 
		 */
		list.addLast(10);
		list.addLast(20);
		list.addLast(40);
		list.addAt(2, 30);
		list.addLast(50);
		list.addLast(70);
		list.addLast(60);
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tRemoved " + list.removeAt(5));
		System.out.println("\tRemoved " + list.removeAt(0));
		System.out.println("\tRemoved " + list.removeAt(0));
		System.out.println("\tRemoved " + list.removeAt(list.size() - 1));
		System.out.println("\tRemoved " + list.removeAt(list.size() - 1));
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tRemoved " + list.removeAt(0));
		System.out.println("\tRemoved " + list.removeAt(list.size() - 1));
		/*
		 * 
		 * 10 20 30 40 50 70 60
		 * Size : 7
		 * Removed 70
		 * Removed 10
		 * Removed 20
		 * Removed 60
		 * Removed 50
		 * 30 40
		 * Size : 2
		 * Removed 30
		 * Removed 40
		 */
		for (int i = 1; i <= 10; i++)
		{
			list.addLast(i * 10);
		}
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tFirst Item : " + list.getFirst());
		System.out.println("\tLast Item : " + list.getLast());
		list.reverseData();
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tFirst Item : " + list.getFirst());
		System.out.println("\tLast Item : " + list.getLast());
		list.reversePointer();
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tFirst Item : " + list.getFirst());
		System.out.println("\tLast Item : " + list.getLast());
		System.out.println("\tMiddle Item : " + list.getMid());
		System.out.println("\tRemoved " + list.removeLast());
		list.display();
		System.out.println("\tSize : " + list.size());
		System.out.println("\tMiddle Item : " + list.getMid());
		/*
		 * 10 20 30 40 50 60 70 80 90 100
		 * Size : 10
		 * First Item : 10
		 * Last Item : 100
		 * 100 90 80 70 60 50 40 30 20 10
		 * Size : 10
		 * First Item : 100
		 * Last Item : 10
		 * 10 20 30 40 50 60 70 80 90 100
		 * Size : 10
		 * First Item : 10
		 * Last Item : 100
		 * Middle Item : 50
		 * Removed 100
		 * 10 20 30 40 50 60 70 80 90
		 * Size : 9
		 * Middle Item : 50
		 */

	}

}

/* https://github.com/shahiddhariwala */
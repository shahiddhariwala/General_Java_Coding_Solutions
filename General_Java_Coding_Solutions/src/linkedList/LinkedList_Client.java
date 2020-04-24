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
		System.out.println("\tSize : "+list.size());
		System.out.println("\tFirst Item : "+list.getFirst());
		System.out.println("\tLast Item : "+list.getLast());
		
		list.addFirst(85);
		list.addFirst(133);
		list.addLast(101);
		list.display();
		System.out.println("\tSize : "+list.size());
		System.out.println("\tFirst Item : "+list.getFirst());
		System.out.println("\tLast Item : "+list.getLast());
		System.out.println("\tItem at 2nd Position is "+list.getAt(2));
		
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package heap;

public class HeapClient
{

	public static void main(String[] args)
	{
		Heap<Integer> h = new Heap<Integer>();
		int arr[] =
		{ 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };
		for(Integer i : arr)
		{
			h.add(i);
		}
		System.out.println(h.remove());
		h.display();
		System.out.println(h.remove());
		h.display();
	}

}

/* https://github.com/shahiddhariwala */
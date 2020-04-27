/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops.generics;

public class Generic_Class_Demo_Pair
{
	private static class Pair<T>
	{

		T one;
		T two;

		public String toString()
		{
			return "{ " + this.one + ", " + this.two + " }";
		}

	}

	private static class Pair2<K, V>
	{

		K one;
		V two;

		public String toString()
		{
			return "{ " + this.one + ", " + this.two + " }";
		}

	}

	public static void main(String[] args)
	{
		Pair<String> pair = new Pair<>();
		pair.one = "Shahid";
		pair.two = "Dhariwala";
		System.out.println(pair);

		Pair<Integer> pair2 = new Pair<Integer>();
		pair2.one = 1;
		pair2.two = 2;
		System.out.println(pair2);

		Pair2<Integer, Integer> pair3 = new Pair2<Integer, Integer>();
		pair3.one = 1;
		pair3.two = 2;
		System.out.println(pair3);

		Pair2<Integer, String> pair4 = new Pair2<Integer, String>();
		pair4.one = 1;
		pair4.two = "Dhariwala";
		System.out.println(pair4);

		Pair2<String, String> pair5 = new Pair2<String, String>();
		pair5.one = "Shahid";
		pair5.two = "Dhariwala";
		System.out.println(pair5);

		Pair2<String, Integer> pair6 = new Pair2<String, Integer>();
		pair6.one = "Shahid";
		pair6.two = 1;
		System.out.println(pair6);
		/*
		 * { Shahid, Dhariwala }
		 * { 1, 2 }
		 * { 1, 2 }
		 * { 1, Dhariwala }
		 * { Shahid, Dhariwala }
		 * { Shahid, 1 }
		 * 
		 */

	}

}

/* https://github.com/shahiddhariwala */
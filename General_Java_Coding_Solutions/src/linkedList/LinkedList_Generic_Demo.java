/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package linkedList;

import oops.generics.LinkedListGeneric;

public class LinkedList_Generic_Demo
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

	private static class Car
	{
		int speed;
		int price;
		String color;

		public Car(int speed, int price, String color)
		{
			this.speed = speed;
			this.price = price;
			this.color = color;
		}

		@Override
		public String toString()
		{
			return "{ S:" + this.speed + " \t P:" + this.price + "\t C:" + this.color + " }";
		}
	}

	public static void main(String[] args) throws Exception
	{
		Car cars[] = new Car[5];
		cars[0] = new Car(101, 5, "blue");
		cars[1] = new Car(122, 1, "yeloow");
		cars[2] = new Car(1033, 30, "red");
		cars[3] = new Car(104, 13, "abrot");
		cars[4] = new Car(105, 3, "zokomon");

		LinkedListGeneric<Car> llcar = new LinkedListGeneric<LinkedList_Generic_Demo.Car>();
		for (Car i : cars)
		{
			llcar.addLast(i);
		}
		llcar.display();
		/*
		 * { S:101 P:5 C:blue }
		 * { S:122 P:1 C:yeloow }
		 * { S:1033 P:30 C:red }
		 * { S:104 P:13 C:abrot }
		 * { S:105 P:3 C:zokomon }
		 * 
		 */
		LinkedListGeneric<String> llstr = new LinkedListGeneric<String>();
		llstr.addFirst("Dhariwala");
		llstr.addFirst("Shahid ");
		llstr.display();

		LinkedListGeneric<Integer> llint = new LinkedListGeneric<Integer>();
		llint.addFirst(313);
		llint.addFirst(17);
		llint.addFirst(197);
		llint.addAt(0, 78);
		llint.display();
		/*
		 * Shahid
		 * Dhariwala
		 * 
		 * 78
		 * 197
		 * 17
		 * 313
		 */
	}

}

/* https://github.com/shahiddhariwala */
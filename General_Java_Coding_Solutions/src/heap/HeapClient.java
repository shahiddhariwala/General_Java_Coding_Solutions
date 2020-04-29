/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package heap;

import oops.generics.Car;

public class HeapClient
{
	private static class Car implements Comparable<Car>
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
			return "{ S:" + this.speed + ", P:" + this.price + ", C:" + this.color + "}";
		}

		@Override
		public int compareTo(Car other)
		{

			return this.price - other.price;
		}
	}

	public static void main(String[] args)
	{
		Heap<Integer> h = new Heap<Integer>();
		int arr[] =
		{ 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };
		for (Integer i : arr)
		{
			h.add(i);
		}
		System.out.println(h.remove());
		h.display();
		System.out.println(h.remove());
		h.display();

		Car cars[] = new Car[5];
		cars[0] = new Car(101, 5, "BLUE");
		cars[1] = new Car(122, 1, "Yellow");
		cars[2] = new Car(1033, 30, "Red");
		cars[3] = new Car(104, 13, "White");
		cars[4] = new Car(105, 3, "Purple");

		Heap<Car> carHeap = new Heap<>();
		for (Car i : cars)
		{
			carHeap.add(i);
		}
		carHeap.display();
		/*
		 * 10
		 * 14 26 19 33 31 42 27 44 35
		 * 14
		 * 19 26 27 33 31 42 35 44
		 * { S:122, P:1, C:Yellow} { S:105, P:3, C:Purple} { S:1033, P:30, C:Red} {
		 * S:104, P:13, C:White} { S:101, P:5, C:BLUE}
		 * 
		 */
	}

}

/* https://github.com/shahiddhariwala */
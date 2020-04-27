/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops.generics;

public class GenericDisplay
{
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
			return "{ S:" + this.speed + ", P:" + this.price + ", C:" + this.color + "}";

		}
	}

	public static void main(String[] args)
	{
		/*
		 * int arrInt[] = {1,2,3,4,5,6,7,8,9};
		 * primitive int won't work with generics we have to use wrapper class of it
		 */

		Integer arrInt[] =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String arrString[] =
		{ "Shahid", "is", "best", "coder", "in", "the", "world" };
		display(arrInt);
		display(arrString);
		/*
		 * 1 2 3 4 5 6 7 8 9
		 * Shahid is best coder in the world
		 * { S:101, P:12313, C:BLUE} { S:102, P:123123, C:Yellow} { S:103, P:1232133,
		 * C:Red} { S:104, P:121113, C:White} { S:105, P:1223, C:Purple}
		 * 
		 * 
		 */

		Car cars[] = new Car[5];
		cars[0] = new Car(101, 12313, "BLUE");
		cars[1] = new Car(102, 123123, "Yellow");
		cars[2] = new Car(103, 1232133, "Red");
		cars[3] = new Car(104, 121113, "White");
		cars[4] = new Car(105, 1223, "Purple");
		display(cars);
	}

	// <T> before return type shows that method is generic and can Take any type T
	// input
	private static <T> void display(T[] arr)
	{
		for (T i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

}

/* https://github.com/shahiddhariwala */
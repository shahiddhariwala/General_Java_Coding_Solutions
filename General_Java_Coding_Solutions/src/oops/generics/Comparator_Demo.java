/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops.generics;

import java.util.Comparator;

public class Comparator_Demo
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
			return "{ S:" + this.speed + " \t P:" + this.price + "\t C:" + this.color + " }";
		}
	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (comparator.compare(arr[j], arr[j + 1]) < 0)
				{
					T tempo = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempo;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Car cars[] = new Car[5];
		cars[0] = new Car(101, 5, "blue");
		cars[1] = new Car(122, 1, "yeloow");
		cars[2] = new Car(1033, 30, "red");
		cars[3] = new Car(104, 13, "abrot");
		cars[4] = new Car(105, 3, "zokomon");

		Comparator<Car> speedCompare = new Comparator<Car>()
		{

			@Override
			public int compare(Car thisCar, Car otherCar)
			{

				return otherCar.speed - thisCar.speed;
			}

		};

		// we can write lambda too, since the interface only has 1 method to implement
		Comparator<Car> priceCompare = (Car o1, Car o2) -> o2.price - o1.price;
		Comparator<Car> colorCompare = (Car t, Car o) -> o.color.compareTo(t.color);

		bubbleSort(cars, speedCompare);
		display(cars);
		bubbleSort(cars, priceCompare);
		display(cars);
		bubbleSort(cars, colorCompare);
		display(cars);
		/*
		 * speedCompare
		 * { S:101 P:5 C:blue }
		 * { S:104 P:13 C:abrot }
		 * { S:105 P:3 C:zokomon }
		 * { S:122 P:1 C:yeloow }
		 * { S:1033 P:30 C:red }
		 * 
		 * priceCompare
		 * { S:122 P:1 C:yeloow }
		 * { S:105 P:3 C:zokomon }
		 * { S:101 P:5 C:blue }
		 * { S:104 P:13 C:abrot }
		 * { S:1033 P:30 C:red }
		 * 
		 * colorCompare
		 * { S:104 P:13 C:abrot }
		 * { S:101 P:5 C:blue }
		 * { S:1033 P:30 C:red }
		 * { S:122 P:1 C:yeloow }
		 * { S:105 P:3 C:zokomon }
		 */
	}

	// <T> before return type shows that method is generic and can Take any type T
	// input
	private static <T> void display(T[] arr)
	{
		for (T i : arr)
		{
			System.out.print(i + "\n");
		}
		System.out.println();
	}
}

/* https://github.com/shahiddhariwala */
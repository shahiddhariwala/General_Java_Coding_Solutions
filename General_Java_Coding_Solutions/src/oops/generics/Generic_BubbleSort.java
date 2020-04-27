/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops.generics;

public class Generic_BubbleSort
{

	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j].compareTo(arr[j + 1]) < 0)
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
		cars[0] = new Car(101, 5, "BLUE");
		cars[1] = new Car(122, 1, "Yellow");
		cars[2] = new Car(1033, 30, "Red");
		cars[3] = new Car(104, 13, "White");
		cars[4] = new Car(105, 3, "Purple");
		bubbleSort(cars);
		display(cars);
		/*
		 * { S:122, P:1, C:Yellow}
		 * { S:105, P:3, C:Purple}
		 * { S:101, P:5, C:BLUE}
		 * { S:104, P:13, C:White}
		 * { S:1033, P:30, C:Red}
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
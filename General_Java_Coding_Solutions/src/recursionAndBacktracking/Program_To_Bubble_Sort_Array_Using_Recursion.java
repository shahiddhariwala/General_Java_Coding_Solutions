/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

import java.util.Arrays;

public class Program_To_Bubble_Sort_Array_Using_Recursion
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 50, 40, 30, 2, 1, 100 };
		int arr2[] =
		{ 19, 8, 7, 6, 5, 4, 3, 2, 1 };
		int arr3[] =
		{ 1, 0 };

		doBubbleSortusingRecursion(arr, 0, arr.length - 1);
		doBubbleSortusingRecursion(arr2, 0, arr2.length - 1);
		doBubbleSortusingRecursion(arr2, 0, arr2.length - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		/*
		 * [1, 2, 30, 40, 50, 100]
		 * [1, 2, 3, 4, 5, 6, 7, 8, 19]
		 * [1, 0]
		 */
	}

	private static void doBubbleSortusingRecursion(int[] arr, int startIndex, int lastIndex)
	{
		if (lastIndex <= 0)
		{
			return;
		}

		if (startIndex == lastIndex)
		{
			doBubbleSortusingRecursion(arr, 0, lastIndex - 1);
		} else
		{
			if (arr[startIndex] > arr[startIndex + 1])
			{
				int temp = arr[startIndex];
				arr[startIndex] = arr[startIndex + 1];
				arr[startIndex + 1] = temp;
			}
			doBubbleSortusingRecursion(arr, startIndex + 1, lastIndex);
		}

	}

}

/* https://github.com/shahiddhariwala */
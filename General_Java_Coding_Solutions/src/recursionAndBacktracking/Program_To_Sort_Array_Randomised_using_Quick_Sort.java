/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

import java.util.Arrays;
import java.util.Random;

public class Program_To_Sort_Array_Randomised_using_Quick_Sort
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 1,2,3,4,5,6,7,8,99,10,11,12,14,15 };
		randmomisedArray(arr);
		//we use randomised quick sort because for sorted array it will give us N^2 complexity 
		System.out.println(Arrays.toString(arr));
		doQuickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		// Quick SOrt is inplace algorithm as it does not require extra space
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25]
		

	}

	private static void randmomisedArray(int arr[])
	{
		Random rand = new Random();
		for(int i=arr.length-1;i>=0;i--)
		{
			//pick random number between 0 to i
			int randomNumber = rand.nextInt(i+1);
			int temp = arr[i];
			arr[i] = arr[randomNumber];
			arr[randomNumber]=temp;
		}
	}

	private static void doQuickSort(int[] arr, int start, int end)
	{
		if (start <= end)
		{
			// 1. Partitioning
			int pivotIndex = doPartition(arr, start, end);
			// pivotIndex is our item which has all elements at it left smaller
			// and all the element to right of it is greater than it

			// 2. Work on Smaller Problem
			doQuickSort(arr, start, pivotIndex - 1);
			doQuickSort(arr, pivotIndex + 1, end);
		}

	}

	private static int doPartition(int[] arr, int start, int end)
	{
		int pi = end;
		int i = start - 1;
		for (int j = start; j <= end; j++)
		{
			if (arr[j] <= arr[pi])
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		return i;
	}

}

/* https://github.com/shahiddhariwala */
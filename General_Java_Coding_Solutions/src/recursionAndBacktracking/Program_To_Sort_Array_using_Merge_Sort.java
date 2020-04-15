/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

import java.util.Arrays;

public class Program_To_Sort_Array_using_Merge_Sort
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 9, 8, 7, 6, 25, 20, 5, 4, 3, 10, 15, 2, 1 };
		// not an inplace sorting algorithm
		int sortedArray[] = getMergeSortArray(arr, 0, arr.length - 1);
		// int left[] = {10,20,30,40,50};
		// int right[] = {5,15,25,35,45,55};
		// int sortedArray[] = mergeSortedLeftRight(left,right);
		System.out.println(Arrays.toString(sortedArray));

	}

	private static int[] getMergeSortArray(int[] arr, int low, int high)
	{
		if (low == high)
		{
			int baseArray[] = new int[1];
			baseArray[0] = arr[low];
			return baseArray;
		}

		int mid = (high + low) / 2;

		int leftArray[] = getMergeSortArray(arr, low, mid);
		int rightArray[] = getMergeSortArray(arr, mid + 1, high);
		int resultArray[] = mergeSortedLeftRight(leftArray, rightArray);
		return resultArray;
	}

	private static int[] mergeSortedLeftRight(int[] leftArray, int[] rightArray)
	{
		int mergedResult[] = new int[leftArray.length + rightArray.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftArray.length && j < rightArray.length)
		{
			if (leftArray[i] <= rightArray[j])
			{
				mergedResult[k] = leftArray[i];
				k++;
				i++;
			} else
			{
				mergedResult[k] = rightArray[j];
				k++;
				j++;
			}
		}
		if (i == leftArray.length)
		{
			// we have traverse all leftArray
			while (j < rightArray.length)
			{
				mergedResult[k] = rightArray[j];
				k++;
				j++;
			}
		}
		if (j == rightArray.length)
		{
			while (i < leftArray.length)
			{
				mergedResult[k] = leftArray[i];
				k++;
				i++;
			}
		}

		return mergedResult;
	}

}

/* https://github.com/shahiddhariwala */
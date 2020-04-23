/*
Code by  : Shahid Dhariwala 
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Given an array A, of N elements. Sort the array using quicksort algorithm.(Note : Use randomized quicksort, otherwise worst case will not pass).

Input Format
A single integer, N, denoting the number of elements in array. Next line contains N integers, denoting the elements of array.

Constraints
1<=N<=2*10^5 |Ai|<=10^9

Output Format
Print in a single line, N spaced integers, denoting the elements of array A in sorted order.

Sample Input
5
3 6 4 1 2
Sample Output
1 2 3 4 6 
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program_Sort_An_Array_Using_Quick_Sort
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		// QuickSort give us sorting in NlogN complexity if the array is random, else if
		// it is sorted then it will take N^2 time
		// Inorder to avoid that , we shuffle array
		shuffleArray(arr);
		//System.out.println(Arrays.toString(arr));
		doQuickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

	private static void shuffleArray(int[] arr)
	{
		Random rand  = new Random();
		for (int i = arr.length-1;i>=0 ;i--)
		{
			int tempIndex = rand.nextInt(i+1);
			int temp = arr[tempIndex];
			arr[tempIndex]=arr[i];
			arr[i]=temp;
		}
		
	}

	private static void doQuickSort(int[] arr, int start, int end)
	{
		if (start <= end)
		{
			// 1. partitioning
			int pivotIndex = doPivoting(arr, start, end);
			// 2. After getting pivotIndex we know all the smaller elements are to the left
			// opf it and same for right all the larger are on right side
			// 3. repeat for left anbd right subarrays
			doQuickSort(arr, start, pivotIndex - 1);
			doQuickSort(arr, pivotIndex + 1, end);
		}

	}

	private static int doPivoting(int[] arr, int start, int end)
	{
		int pivot = arr[end];
		// considering last element as Pivot
		int pIndex = start - 1;
		for (int k = start; k <= end; k++)
		{
			if (arr[k] <= pivot)
			{
				pIndex++;
				int temp = arr[k];
				arr[k] = arr[pIndex];
				arr[pIndex] = temp;

			}
		}
		return pIndex;
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Given an array A, of N elements. Sort the array using mergesort algorithm.

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
package challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_Sort_An_Array_Using_Merge_Sort
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
		int sortedArray[] = doMergeSort(arr,0,arr.length-1);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}

	}

	private static int[] doMergeSort(int[] arr, int i, int j)
	{
		if(i==j)
		{
			int baseArray[] = new int[1];
			baseArray[0]=arr[i];
			return baseArray;
		}
		int mid = (i+j)/2;
		int leftArray[] = doMergeSort(arr, i, mid);
		int rightArray[] = doMergeSort(arr, mid+1,j);
		int mergedArray[] = merge2Array(leftArray,rightArray);
		return mergedArray;
	}

	private static int[] merge2Array(int[] leftArray, int[] rightArray)
	{
		int mergedArray[] = new int[leftArray.length+rightArray.length];
		
		int i=0,j=0,k=0;
		while(i != leftArray.length && j != rightArray.length)
		{
			if(leftArray[i]<=rightArray[j])
			{
				mergedArray[k]=leftArray[i];
				i++;
				k++;
			}
			else
			{
				mergedArray[k]=rightArray[j];
				j++;
				k++;
			}
		}
		
		if(i == leftArray.length)
		{
			while(j<rightArray.length)
			{
				mergedArray[k]=rightArray[j];
				j++;
				k++;
			}
		}
		

		if(j == rightArray.length)
		{
			while(i<leftArray.length)
			{
				mergedArray[k]=leftArray[i];
				i++;
				k++;
			}
		}
		
		
		return mergedArray;
	}

}

/* https://github.com/shahiddhariwala */
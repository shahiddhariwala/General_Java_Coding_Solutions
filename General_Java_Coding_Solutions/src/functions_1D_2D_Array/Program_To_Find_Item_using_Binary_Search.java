/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Find_Item_using_Binary_Search {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,12,13};
		
		int itemToFind = 11;
		int index= binarySearch(arr,itemToFind);
		System.out.println("Item is at index "+index);

	}

	private static int binarySearch(int[] arr, int itemToFind) {
		
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			if(itemToFind<arr[mid])
			{
				hi =mid-1;
			}
			else if(itemToFind>arr[mid])
			{
				lo = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}

/* https://github.com/shahiddhariwala */
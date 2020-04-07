/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Find_Item_In_Array {
	public static Scanner sc = new Scanner(System.in);

	public static int[] takeInputArray() {
		System.out.println("Enter Size of An Array");
		int arraySize = sc.nextInt();
		System.out.println("Enter Items");
		int arr[] = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void displayArray(int arr[]) {
		System.out.println("Array is as follow");
		for (Integer item : arr) {
			System.out.println(item);
		}
	}

	public static int linearSearch(int val,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(val == arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {12,3,4,5,6,7,8,9,11,22,33,34,54,56,88};
		displayArray(arr);
		
		System.out.println("Enter item to be searched");
		int ser = sc.nextInt();
		int getIndex = linearSearch(ser,arr);
		if(getIndex !=-1)
		{
			System.out.println("Element is at : "+getIndex);
		}
		else
		{
			System.out.println("Element not found ");
		}
	}

}

/* https://github.com/shahiddhariwala */
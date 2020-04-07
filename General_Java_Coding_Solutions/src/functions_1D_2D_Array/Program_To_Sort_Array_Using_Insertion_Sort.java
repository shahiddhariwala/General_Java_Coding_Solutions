/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
OUTPUT
Initial Array 	[1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]

for index 1=> 	[1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 2=> 	[1, 87, 99, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 3=> 	[1, 54, 87, 99, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 4=> 	[1, 54, 87, 99, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 5=> 	[1, 11, 54, 87, 99, 334, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 6=> 	[1, 11, 23, 54, 87, 99, 334, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 7=> 	[1, 11, 23, 54, 87, 99, 334, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 8=> 	[1, 11, 14, 23, 54, 87, 99, 334, 453, 22, 12, 67, 143, 9, 7, 2]
for index 9=> 	[1, 11, 14, 22, 23, 54, 87, 99, 334, 453, 12, 67, 143, 9, 7, 2]
for index 10=> 	[1, 11, 12, 14, 22, 23, 54, 87, 99, 334, 453, 67, 143, 9, 7, 2]
for index 11=> 	[1, 11, 12, 14, 22, 23, 54, 67, 87, 99, 334, 453, 143, 9, 7, 2]
for index 12=> 	[1, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453, 9, 7, 2]
for index 13=> 	[1, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453, 7, 2]
for index 14=> 	[1, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453, 2]
for index 15=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
Time to do sort is 1 ms

*/
package functions_1D_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Sort_Array_Using_Insertion_Sort {

	public static void main(String[] args) {
		int arr[] = { 1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2 };
		long startTime = System.currentTimeMillis();
		doInsertionSort(arr);
		long endTime = System.currentTimeMillis();

		System.out.println(Arrays.toString(arr));
		System.out.println("Time to do sort is " + (endTime - startTime) + " ms");
	} 

	private static void doInsertionSort(int[] arr) {
		System.out.println("Initial Array \t" + Arrays.toString(arr) + "\n");
		for (int i = 1; i < arr.length; i++) {
			
			int val = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>val)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=val;	
			System.out.println("for index " + i + "=> \t" + Arrays.toString(arr));
		}
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * 
Initial Array 	[1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]

for index 0=> 	[1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]
for index 1=> 	[1, 2, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 99]
for index 2=> 	[1, 2, 7, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 87, 99]
for index 3=> 	[1, 2, 7, 9, 334, 11, 23, 453, 14, 22, 12, 67, 143, 54, 87, 99]
for index 4=> 	[1, 2, 7, 9, 11, 334, 23, 453, 14, 22, 12, 67, 143, 54, 87, 99]
for index 5=> 	[1, 2, 7, 9, 11, 12, 23, 453, 14, 22, 334, 67, 143, 54, 87, 99]
for index 6=> 	[1, 2, 7, 9, 11, 12, 14, 453, 23, 22, 334, 67, 143, 54, 87, 99]
for index 7=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 453, 334, 67, 143, 54, 87, 99]
for index 8=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 453, 334, 67, 143, 54, 87, 99]
for index 9=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 334, 67, 143, 453, 87, 99]
for index 10=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 334, 143, 453, 87, 99]
for index 11=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 143, 453, 334, 99]
for index 12=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 453, 334, 143]
for index 13=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 14=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
Time to do sort is 1 ms

*/
package functions_1D_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Sort_Array_Using_Selection_Sort {

	public static void main(String[] args) {
		int arr[] = { 1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2 };
		long startTime = System.currentTimeMillis();
		doSelectionSort(arr);
		long endTime = System.currentTimeMillis();

		System.out.println(Arrays.toString(arr));
		System.out.println("Time to do sort is " + (endTime - startTime) + " ms");
	}

	private static void doSelectionSort(int[] arr) {
		System.out.println("Initial Array \t" + Arrays.toString(arr) + "\n");
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println("for index " + i + "=> \t" + Arrays.toString(arr));
		}
	}

}

/* https://github.com/shahiddhariwala */
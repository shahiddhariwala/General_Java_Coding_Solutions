/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Initial Array 	[1, 99, 87, 54, 334, 11, 23, 453, 14, 22, 12, 67, 143, 9, 7, 2]

for index 0=> 	[1, 87, 54, 99, 11, 23, 334, 14, 22, 12, 67, 143, 9, 7, 2, 453]
for index 1=> 	[1, 54, 87, 11, 23, 99, 14, 22, 12, 67, 143, 9, 7, 2, 334, 453]
for index 2=> 	[1, 54, 11, 23, 87, 14, 22, 12, 67, 99, 9, 7, 2, 143, 334, 453]
for index 3=> 	[1, 11, 23, 54, 14, 22, 12, 67, 87, 9, 7, 2, 99, 143, 334, 453]
for index 4=> 	[1, 11, 23, 14, 22, 12, 54, 67, 9, 7, 2, 87, 99, 143, 334, 453]
for index 5=> 	[1, 11, 14, 22, 12, 23, 54, 9, 7, 2, 67, 87, 99, 143, 334, 453]
for index 6=> 	[1, 11, 14, 12, 22, 23, 9, 7, 2, 54, 67, 87, 99, 143, 334, 453]
for index 7=> 	[1, 11, 12, 14, 22, 9, 7, 2, 23, 54, 67, 87, 99, 143, 334, 453]
for index 8=> 	[1, 11, 12, 14, 9, 7, 2, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 9=> 	[1, 11, 12, 9, 7, 2, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 10=> 	[1, 11, 9, 7, 2, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 11=> 	[1, 9, 7, 2, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 12=> 	[1, 7, 2, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 13=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
for index 14=> 	[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
[1, 2, 7, 9, 11, 12, 14, 22, 23, 54, 67, 87, 99, 143, 334, 453]
Time to do sort is 2 ms
*/
package functions_1D_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Sort_Array_using_Bubble_Sort {

	public static void main(String[] args) {
		int arr[] = { 1,99,87,54,334,11,23,453,14,22,12,67,143,9,7,2 };
		long startTime = System.currentTimeMillis();
		doBubbleSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		System.out.println("Time to do sort is "+(endTime - startTime)+" ms");

	}

	private static void doBubbleSort(int[] arr) {

		System.out.println("Initial Array \t"+Arrays.toString(arr)+"\n");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.println("for index "+i+"=> \t"+Arrays.toString(arr));
			
		}
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Find_Max_In_Array {
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

	public static int getMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (Integer curr : arr) {
			if (max < curr) {
				max = curr;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = takeInputArray();
		displayArray(arr);
		int max = getMax(arr);
		System.out.println("Max from Array is: " + max);
		
	}

}

/* https://github.com/shahiddhariwala */
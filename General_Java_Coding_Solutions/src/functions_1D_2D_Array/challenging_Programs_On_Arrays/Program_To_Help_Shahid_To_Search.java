/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
Shahid had a sorted array of numbers from which he had to find a given number quickly. 
His friend by mistake rotated the array. 
Now Shahid doesn't have time to sort the elements again. 
Help him to quickly find the given number from the rotated array.

Hint - Think Binary Search!



Input Format
The first line contains N - the size of the array.
 the next N lines contain the numbers of the array.
 The next line contains the item to be searched.

Constraints
Output Format
Output the index of number in the array to be searched. 
Output -1 if the number is not found.

Sample Input
5
4
5
1
2
3
2
Sample Output
3
Explanation
The given rotated array is [4, 5, 1, 2, 3]. The element to be searched is 2 whose index is 3.
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Help_Shahid_To_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int maxIndex = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		int val = sc.nextInt();
		int index = 0;
		if (val <= arr[maxIndex] && val >= arr[0]) {
			index=binarySearch(arr, val, 0, maxIndex);
		}
		else
		{
			index=binarySearch(arr, val, maxIndex,arr.length-1);
		}
		System.out.println(index);
		sc.close();

	}

	private static int binarySearch(int[] arr, int itemToFind, int start, int end) {

		int lo = start;
		int hi = end;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (itemToFind < arr[mid]) {
				hi = mid - 1;
			} else if (itemToFind > arr[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}

/* https://github.com/shahiddhariwala */
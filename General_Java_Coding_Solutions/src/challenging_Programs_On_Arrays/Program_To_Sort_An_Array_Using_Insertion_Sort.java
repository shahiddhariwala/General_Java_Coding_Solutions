/*
Code by  : Shahid Dhariwala


LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
Given an array A of size N , write a function that implements insertion sort on the array. Print the elements of sorted array.

Input Format
First line contains a single integer N denoting the size of the array. Next line contains N space seperated integers where ith integer is the ith element of the array.

Constraints
1 <= N <= 1000
|Ai| <= 1000000

Output Format
Output N space seperated integers of the sorted array in a single line.

Sample Input
4
3 4 2 1
Sample Output
1 2 3 4
Explanation
For each test case, write insertion sort to sort the array.
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Sort_An_Array_Using_Insertion_Sort {

	private static void doInsertionSort(int[] arr) {
		//System.out.println("Initial Array \t" + Arrays.toString(arr) + "\n");
		for (int i = 1; i < arr.length; i++) {
			
			int val = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>val)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=val;	
			//System.out.println("for index " + i + "=> \t" + Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 1; i <= numCases; i++) {
			arr[i-1]=sc.nextInt();
		}
		doInsertionSort(arr);
		for(Integer i : arr)
		{
			System.out.print(i+ " ");
		}
		sc.close();
	}
}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Find position of the last and first occurrence of a given number in a sorted array. If number does not exist then print lower and upper bound as -1.

Input Format
First line contains an integer n denoting the size of the array.
Second line contains n space separated integers denoting array elements.
Third line contains single integer Q denoting the no of queries.
Q lines follow , each containing a single integer x that is to be searched in the array.

Constraints
1 <= N <= 10^5
1 <= Q <= 100

Output Format
For each query , print the lowerbound and the upperbound for the number x in a new line each.

Sample Input
5
1 2 3 3 4
3
2
3
10
Sample Output
1 1
2 3
-1 -1
Explanation
The first and the last occurrence of 2 in the given array are both 1.
The first occurrence of 3 is at index=2 and last at index=3.
10 is not present in the array so we print -1 for it.
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Find_Upper_Lower_bound {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numItems = sc.nextInt();
	int arr[] = new int[numItems];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int numCases = sc.nextInt();
	for (int i = 1; i <= numCases; i++) {
		int num = sc.nextInt();
		System.out.println(findLowerBound(arr, num)+" "+findUpperBound(arr, num));
	}
	sc.close();

	}
	private static int findUpperBound(int[] arr, int itemToFind) {
		int ans=-1;
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			if(itemToFind==arr[mid])
			{
				ans= mid;
				lo=mid+1;
			}
			else if(itemToFind<arr[mid])
			{
				hi =mid-1;
			}
			else if(itemToFind>arr[mid]) 
			{
				lo = mid+1;
			}
			
		}
		return ans;
	}
	

	private static int findLowerBound(int[] arr, int itemToFind) {
		int ans=-1;
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi)
		{
			int mid = (lo+hi+1)/2;
			if(itemToFind==arr[mid])
			{
				ans= mid;
				hi=mid-1;
			}
			else if(itemToFind<arr[mid])
			{
				hi =mid-1;
			}
			else if(itemToFind>arr[mid])
			{
				lo = mid+1;
			}
			
		}
		return ans;
	}

}



/*https://github.com/shahiddhariwala*/
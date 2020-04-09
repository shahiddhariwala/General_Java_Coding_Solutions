/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.

1.It reads a number N.
2.Take Another N numbers as input in Ascending Order and store them in an Array.
3.Take Another number M as input and find that number in Array.
4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.

Input Format
Constraints
N cannot be Negative. Range of Numbers N and M can be between -1000000000 to 1000000000

Output Format
Sample Input
5
3
5
6
9
78
6
Sample Output
2
Explanation
Array = {3, 5, 6, 9, 78}, target number = 6 . Index of number 6 in the given array = 2. Write Binary search to find the number in given array as discuss in the class.
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Find_Number_Using_Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 1; i <= numCases; i++) {
			arr[i-1]=sc.nextInt();
		}
		int serVal = sc.nextInt();
		System.out.println(doBinarySearch(arr,serVal));
		
		sc.close();

	}

	private static int doBinarySearch(int[] arr, int serVal) {
		
		int start = 0 ; 
		int end = arr.length-1;
		while(start<end)
		{
			int mid  = (start+end)/2;
			if(arr[mid] > serVal)
			{
				end = mid-1;
			}
			else if(arr[mid] < serVal)
			{
				start =mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
You are given an array, A. Sort this array using counting sort algorithm.

Input Format
First line contains a single integer, n, denoting the size of the array. Next line contains n integers, denoting the elements of the array.

Constraints
1<=N<=10^6 0<=Ai<=10^6

Output Format
Print the array in sorted order.

Sample Input
5
1 3 2 6 5
Sample Output
1 2 3 5 6
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Sort_An_Array_Using_Counting_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		int tempMax = Integer.MIN_VALUE;
		for (int i = 0; i < numCases; i++) {
			arr[i] = sc.nextInt();
			if (tempMax < arr[i]) {
				tempMax = arr[i];
			}
		}
		int newArr[] = new int[tempMax + 1];
		for (int i = 0; i < numCases; i++) {
			newArr[arr[i]]++;
		}
		for (int i = 0; i < newArr.length; i++) {
			if(newArr[i]!=0)
			{
				for (int j = 1; j <= newArr[i]; j++) {
					System.out.print(i+" ");
				}
				
			}
		}
		sc.close();
	}
}

/* https://github.com/shahiddhariwala */
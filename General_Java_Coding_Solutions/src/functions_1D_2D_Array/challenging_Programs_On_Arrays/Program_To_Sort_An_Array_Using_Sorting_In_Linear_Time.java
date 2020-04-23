/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
You will be given an array containing only 0s, 1s and 2s. you have sort the array in linear time that is O(N) where N is the size of the array.

Input Format
The first line contains N, which is the size of the array. The following N lines contain either 0, or 1, or 2.

Constraints
1 <= N <= 10^6
Each input element x, such that x ∈ { 0, 1, 2 }.

Output Format
Output the sorted array with each element separated by a newline.

Sample Input
5
0
1
2
1
2
Sample Output
0
1
1
2
2
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Sort_An_Array_Using_Sorting_In_Linear_Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 0; i < numCases; i++) {
			arr[i] = sc.nextInt();
			
		}
		int newArr[] = new int[3];
		for (int i = 0; i < numCases; i++) {
			newArr[arr[i]]++;
		}
		for (int i = 0; i < newArr.length; i++) {
			if(newArr[i]!=0)
			{
				for (int j = 1; j <= newArr[i]; j++) {
					System.out.println(i);
				}
				
			}
		}
		sc.close();
	}
}

/* https://github.com/shahiddhariwala */
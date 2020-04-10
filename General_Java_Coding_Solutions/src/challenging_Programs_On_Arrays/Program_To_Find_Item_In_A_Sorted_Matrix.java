/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . Find if element x is present in the matrix or not.

Input Format
First line consists of two space separated integers N and M, denoting the number of element in a row and column respectively. Second line of each test case consists of N*M space separated integers denoting the elements in the matrix in row major order. Third line of each test case contains a single integer x, the element to be searched.

Constraints
1 <= N,M <= 30 0 <= A[i] <= 100

Output Format
Print 1 if the element is present in the matrix, else 0.

Sample Input
3 3
3 30 38
44 52 54
57 60 69
62
Sample Output
0
Explanation
Search the element in the sorted matrix. If the element is present print 1 otherwise print 0. In the sample input,in first case 62 is not present in the matrix so 0 is printed. Similarly, for second case 55 is present in the matrix so 1 is printed.
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Find_Item_In_A_Sorted_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int itemToFind = sc.nextInt();
		int index =0;
		for (int i = 0; i < arr.length; i++) {
			index = binarySearch(arr[i], itemToFind);
			if(index != -1)
			{
				break;
			}
		}
		if(index!=-1)
		{
			index=1;
		}
		else
		{
			index=0;
		}
		System.out.println(index);
		sc.close();

	}

	private static int binarySearch(int[] arr, int itemToFind) {

		int lo = 0;
		int hi = arr.length - 1;
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
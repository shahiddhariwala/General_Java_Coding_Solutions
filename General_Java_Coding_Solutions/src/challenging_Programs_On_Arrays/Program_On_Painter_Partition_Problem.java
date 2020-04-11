/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.

Note that:

Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.
Input Format
First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.

Constraints
1 <= K <= 10
1 <= N <= 10
1<= Length of each Board <= 10^8

Output Format
Output the minimum time required to paint the board.

Sample Input
2
2
1 10
Sample Output
10
*/
/*We know that the invariant of binary search has two main parts:

the target value would always be in the searching range.
the searching range will decrease in each loop so that the termination can be reached.
We also know that the values in this range must be in sorted order. Here our target value is the maximum sum of a contiguous section in the optimal allocation of boards. Now how can we apply binary search for this? We can fix the possible low to high range for the target value and narrow down our search to get the optimal allocation.

We can see that the highest possible value in this range is the sum of all the elementsin the array and this happens when we allot 1 painter all the sections of the board. The lowest possible value of this range is the maximum value of the array max, as in this allocation we can allot max to one painter and divide the other sections such that the cost of them is less than or equal to max and as close as possible to max. Now if we consider we use x painters in the above scenarios, it is obvious that as the value in the range increases, the value of x decreases and vice-versa. From this we can find the target value when x=k and use a helper function to find x, the minimum number of painters required when the maximum length of section a painter can paint is given.
*/
package challenging_Programs_On_Arrays;

import java.util.*;
import java.util.Scanner;

public class Program_On_Painter_Partition_Problem {
	static int getMax(int arr[], int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	static int getSum(int arr[], int n) {
		int total = 0;
		for (int i = 0; i < n; i++)
			total += arr[i];
		return total;
	}

	static int numberOfPainters(int arr[], int n, int maxLen) {
		int total = 0, numPainters = 1;
		for (int i = 0; i < n; i++) {
			total += arr[i];
			if (total > maxLen) {
				// for next count
				total = arr[i];
				numPainters++;
			}
		}
		return numPainters;
	}

	static int partition(int arr[], int n, int k) {
		int lo = getMax(arr, n);
		int hi = getSum(arr, n);

		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			int requiredPainters = numberOfPainters(arr, n, mid);

			if (requiredPainters <= k)
				hi = mid;

			else
				lo = mid + 1;
		}
		return lo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPainter = sc.nextInt();
		int numBoards = sc.nextInt();
		int boards[] = new int[numBoards];

		for (int i = 0; i < numBoards; i++) {
			boards[i] = sc.nextInt();
		}
		System.out.println(partition(boards, numBoards, numPainter));
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are given a one dimensional array that may contain both positive and negative integers, find the sum of contiguous subarray of numbers which has the largest sum. For example, if the given array is {-2, -5, 6, -2, -3, 1, 5, -6}, then the maximum subarray sum is 7.

Input Format
The first line consists of number of test cases T. Each test case consists of two lines.
The first line of each testcase contains a single integer N denoting the number of elements for the array A.
The second line of each testcase contains N space separated integers denoting the elements of the array.

Constraints
1 <= N <= 100000

1 <= t <= 20

 -100000000 <= A[i] <= 100000000

Output Format
Output a single integer denoting the maximum subarray sum for each testcase in a new line.

Sample Input
2
4
1 2 3 4
3
-10 5 10
Sample Output
10
15
Explanation
For the first testcase, maximum subarray sum is generated by the entire array - 1+2+3+4 = 10
For the second testcase , maximum subarray sum is generated by the subarray {5,10} - 5+10 = 15*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_On_Maximum_Subarray
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int num = sc.nextInt();
			int arr[] = new int[num];
			for (int j = 0; j < arr.length; j++)
			{
				arr[j]=sc.nextInt();
			}
			System.out.println(maxSubArray(arr));
		}
		sc.close();
	}

	public static int maxSubArray(int[] nums) {
		
		int max_till_Now =0;
		int currentMax = 0;
		for(int i=0;i<nums.length;i++)
		{
			currentMax = Math.max(nums[i], currentMax+nums[i]);
			max_till_Now = Math.max(currentMax, max_till_Now);
		}
		return max_till_Now;
		
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 04-May-2020
*/
/*Given a set of "n" non-negative integers, and a value "sum", determine if there is a subset of the given set with sum equal to given sum.

Input Format
1st Line: n sum 2nd Line: a1 a2……an (Array Values)

Constraints
1<= n <= 5000 1<= sum <= 10^7 1<= Ai <=10^5

Output Format
Yes, if sum exist No, it sum does not exist

Sample Input
5 10
1 2 3 4 5
Sample Output
Yes
*/
package dynamicProgramming.challenging_Program_On_DP;

import java.util.*;

public class DP_The_Subset_Sum_To_Target
{
	public static boolean dp[][];

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int target = sc.nextInt();
		int arr[] = new int[val];

		for (int j = 0; j < arr.length; j++)
		{
			arr[j] = sc.nextInt();
		}
		dp = new boolean[val + 1][target + 1];
		boolean possibleSet = findTarget(arr, target);
		System.out.println(possibleSet == true ? "Yes" : "No");
		sc.close();
	}

	private static boolean findTarget(int[] arr, int target)
	{
		dp[0][0] = true; // If sum is zero and no element is taken ans is true
		for (int i = 1; i <= arr.length; i++)
		{ // If sum is zero ans is always true
			dp[i][0] = true;
		}
		for (int i = 1; i <= target; i++)
		{ // If no element is chosen and sum is not zero ans is false
			dp[0][i] = false;
		}
		for (int i = 1; i <= arr.length; i++)
		{
			for (int j = 1; j <= target; j++)
			{
				if (j < arr[i - 1])
				{
					dp[i][j] = dp[i - 1][j];
				}
				if (j >= arr[i - 1])
				{
					dp[i][j] = (dp[i - 1][j] || dp[i - 1][j - arr[i - 1]]);
				}
			}
		}
		return dp[arr.length][target];

	}
}

/* https://github.com/shahiddhariwala */
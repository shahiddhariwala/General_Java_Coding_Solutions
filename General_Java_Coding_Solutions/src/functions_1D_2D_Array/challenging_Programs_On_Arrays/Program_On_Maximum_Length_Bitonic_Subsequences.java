/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are provided n numbers of array. You need to find the maximum length of biotonic subsequence.
 *  A subsequence is biotonic if it is first increasing and then decreasing or entirely increasing 
 *  or decreasing. Please Note: the heights of the building in the elements should be strictly
 *   increasing and then strictly decreasing.

Input Format
First line contains integer t which is number of test case.
For each test case, in the first line you are given an integer n which is the size of array and 
the next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
| Ai | <= 10000

Output Format
Print the maximum length of biotonic subsequence for each testcase in a new line.

Sample Input
2
8
1 11 2 10 4 5 2 1
6
80 60 30 40 20 10
Sample Output
6
5
Explanation
For 1st test case : Maximum length = 1, 2, 4, 5, 2, 1
For 2nd test case : Maximum length = 80, 60, 40, 20 10 or 80, 60, 30, 20 10
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_On_Maximum_Length_Bitonic_Subsequences
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int numberOfItems = sc.nextInt();
			int arr[] = new int[numberOfItems];
			for (int j = 0; j < numberOfItems; j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(getMaximumBiotonicSubsequenceLength(arr));

		}
		sc.close();

	}

	private static int getMaximumBiotonicSubsequenceLength(int[] arr)
	{
		int increasingArray[] = new int[arr.length];
		int decreasingArray[] = new int[arr.length];
		int max = 0;
		// find increasing num Count till particular index
		for (int i = 0; i < decreasingArray.length; i++)
		{
			increasingArray[i]=1;
			decreasingArray[i]=1;
		}
		for (int i = 1; i < increasingArray.length; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (arr[j] < arr[i])
				{
					if (increasingArray[i] < increasingArray[j] + 1)
					{
						increasingArray[i] = increasingArray[j] + 1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(increasingArray));
		for (int i = decreasingArray.length - 2; i >= 0; i--)
		{
			for (int j = decreasingArray.length - 1; j >= i; j--)
			{
				if (arr[j] < arr[i])
				{
					if (decreasingArray[i] < decreasingArray[j] + 1)
					{
						decreasingArray[i] = decreasingArray[j] + 1;
					}
				}
			}
		}

		System.out.println(Arrays.toString(decreasingArray));
		for (int i = 0; i < arr.length; i++)
		{
			if ((increasingArray[i] + decreasingArray[i] - 1) > max)
			{
				max = (increasingArray[i] + decreasingArray[i] - 1);
			}
		}
		return max;
	}

}

/* https://github.com/shahiddhariwala */
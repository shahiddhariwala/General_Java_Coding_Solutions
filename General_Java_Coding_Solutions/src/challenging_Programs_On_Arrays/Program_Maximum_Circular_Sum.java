/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22
Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
*/
package challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_Maximum_Circular_Sum
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			
			int num = sc.nextInt();
			int arr[] = new int[num];
			for (int j = 0; j < num; j++)
			{
				arr[j] = sc.nextInt();
				// arr[j+num]=arr[j];

			}
			// System.out.println(Arrays.toString(arr)); 
			System.out.println(maxCircularSubArray(arr));
		}
		sc.close();
	}

	public static int maxCircularSubArray(int[] nums)
	{
		//bruteforce approach
		int maxIteration = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			int max_till_Now = 0;
			int currentMax = 0;
			//System.out.println(i);
			for (int j = i; j < nums.length + i; j++)
			{
				int index = j %(nums.length);
				currentMax = Math.max(nums[index], currentMax + nums[index]);
				max_till_Now = Math.max(currentMax, max_till_Now);
				//System.out.print(nums[index] + " ");
			}
			maxIteration = Math.max(max_till_Now, maxIteration);
			//System.out.println();
		}
		return maxIteration;

	}

}

/* https://github.com/shahiddhariwala */
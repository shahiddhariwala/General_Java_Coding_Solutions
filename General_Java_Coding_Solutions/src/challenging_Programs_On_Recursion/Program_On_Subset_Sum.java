/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Mike is a very passionate about sets. Lately, he is busy solving one of the problems on sets. He has to find whether if the sum of any of the non-empty subsets of the set A is zero.

Input Format
The first line contains an integer T, which is the total number of test cases.
T test cases follow.
Each test case consists of two lines.
The first line consists of a single integer N, which is the number of elements present in the set A.
The second line contains N space separated integers denoting the elements of the set A.

Constraints
1 ≤ T ≤10
1 ≤ N ≤ 4
-10^5 ≤ A[i] ≤ 10^5

Output Format
Print the answer for each testcase in a new line.
If the sum of any of the subset is zero, then print “Yes” (without quotes) else print “No”(without quotes).

Sample Input
1
4
1 3 2 -3
Sample Output
Yes
Explanation
The sum of the subset {3,-3} is zero.
*/
package challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_On_Subset_Sum
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int val=sc.nextInt();
			int arr[] = new int[val];
			for (int j = 0; j < arr.length; j++)
			{
				arr[j]=sc.nextInt();
			}
			int numberOfPossibleSet = helpMike(arr,0,0,0);
			if(numberOfPossibleSet>=1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			//System.out.println(numberOfPossibleSet); //number of possible sets
		}
		sc.close();

	}

	private static int helpMike(int[] arr,int sum,int index,int numCount)
	{
		if(index==arr.length)
		{
			if(sum==0 && numCount !=1) // 
				return 1;
			else
				return 0;
		}
		int ifCurrval = helpMike(arr, sum+arr[index], index+1,numCount+1);
		int ifNotCurrval = helpMike(arr, sum, index+1,numCount);
		return ifCurrval+ifNotCurrval;
		
	}

}



/*https://github.com/shahiddhariwala*/
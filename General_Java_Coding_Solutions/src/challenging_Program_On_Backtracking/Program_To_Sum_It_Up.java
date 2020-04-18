/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*You are given an array of numbers and a target number(T) 
 * , print all unique combinations in the array whose sum equals the target number T.
 *  Note that each number in the array may only be used once in the combination.
Note:

All numbers (including target) will be positive integers
Elements in the combination must be in non-descending order
There should be no duplicate combinations
Input Format
The first line will contain N indicating the number of elements in the array.
The second line will contain space separated N integers , A[i].
The third line will contain the target number T.

Constraints
N <= 15 1<= A[I] <= 100

Output Format
Print all unique combinations of the numbers satisfying the above constraints in a separate line in lexicographic manner.

Sample Input
7
10 1 2 7 6 1 5
8
Sample Output
1 1 6 
1 2 5 
1 7 
2 6 

15
78 7 62 28 73 68 94 88 65 61 59 21 92 4 97
90

ans 
4 21 65 
7 21 62 
28 62 
*/
package challenging_Program_On_Backtracking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program_To_Sum_It_Up
{

	public static TreeSet<String> tset;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);

		// Comparator to sort treeSet
		Comparator<String> comparto = new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{
				String arr1[] = o1.split(" ");
				String arr2[] = o2.split(" ");
				int lenoth = arr1.length > arr2.length ? arr2.length : arr1.length;
				for (int i = 0; i < lenoth; i++)
				{
					if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
						return 1;
					else if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]))
						return -1;

				}

				return 0;
			}
		};
		tset = new TreeSet<>(comparto);
		printAllCombinationThatMakesTarget(arr, target, "", 0, 0);

		for (String s : tset)
		{
			System.out.println(s);
		}
		sc.close();

	}

	private static void printAllCombinationThatMakesTarget(int arr[], int target, String output, int sum, int index)
	{
		if (sum > target || index == arr.length)
			return;
		if (sum == target)
		{
			// System.out.println(output);
			tset.add(output);
			return;
		}

		// we have 2 option to take the value or not to take the current value
		printAllCombinationThatMakesTarget(arr, target, output + arr[index] + " ", sum + arr[index], index + 1);
		printAllCombinationThatMakesTarget(arr, target, output, sum, index + 1);

	}

}

/* https://github.com/shahiddhariwala */
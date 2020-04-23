/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
 *  Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. Print all the values in the returned array.

Input Format
Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array

Constraints
1 <= Size of array <= 10^5

Output Format
Display all the indices at which number M is found in a space separated manner

Sample Input
5
3
2
1
2
3
2
Sample Output
1 3
Explanation
2 is found at indices 1 and 3.
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_To_Get_Array_Of_All_indices_Of_A_Number
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int valToSearch = sc.nextInt();
		int ans[] = getIndices(arr, valToSearch, 0, 0);
		for (int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i] + " ");
		}

		sc.close();

	}

	private static int[] getIndices(int[] arr, int valToSearch, int i, int count)
	{
		if (i == arr.length)
		{
			return new int[count];
		}

		if (arr[i] == valToSearch)
		{
			int recursionResult[] = getIndices(arr, valToSearch, i + 1, count + 1);
			recursionResult[count] = i;
			
			return recursionResult;
		} else
		{

			return getIndices(arr, valToSearch, i + 1, count);
		}
	}

}

/* https://github.com/shahiddhariwala */
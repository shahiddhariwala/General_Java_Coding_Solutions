/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 We are given an array containg n numbers. All the numbers are present twice except for one number 
 which is only present once. Find the unique number without taking any extra spaces and in linear time. ( Hint - Use Bitwise )

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
n < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 2 2 3 3 4 
Sample Output
4
Explanation
4 is present only once
*/
package bitMasking;

import java.util.Scanner;

public class Program_To_Find_A_Unique_Number_Without_Pair
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}

		int result = 0;
		for (int i = 0; i < arr.length; i++)
		{
			result = result ^ arr[i];
		}
		
		/*
		 * 7
		 * 1 1 2 2 3 3 4
		 * 4
		 */
		
		System.out.println(result);
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
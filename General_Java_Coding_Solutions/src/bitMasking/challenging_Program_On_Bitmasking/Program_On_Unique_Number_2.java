/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*We are given an array containg n numbers. All the numbers are present twice except for two numbers 
 * which are present only once. Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
n < 10^5

Output Format
Output a single line containing the unique numbers separated by space

Sample Input
4
3 1 2 1
Sample Output
2 3
Explanation
Smaller number comes before larger number
*/
package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Scanner;

public class Program_On_Unique_Number_2
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
		findUniqueNumber(arr);
		sc.close();

	}

	/*
	 * Once again, we need to use XOR to solve this problem. But this time, we need
	 * to do it in two passes:
	 * 
	 * In the first pass, we XOR all elements in the array, and get the XOR of the
	 * two numbers we need to find. Note that since the two numbers are distinct, so
	 * there must be a set bit (that is, the bit with value '1') in the XOR result.
	 * Find out an arbitrary set bit (for example, the rightmost set bit).
	 * 
	 * In the second pass, we divide all numbers into two groups, one with the
	 * aforementioned bit set, another with the aforementinoed bit unset. Two
	 * different numbers we need to find must fall into thte two distrinct groups.
	 * XOR numbers in each group, we can find a number in either group.
	 * ?
	 */
	private static void findUniqueNumber(int[] arr)
	{
		int z = 0;
		for (int i = 0; i < arr.length; i++)
		{
			z = z ^ arr[i];
		}
		// Z is combination of that two numbers , we know a^a =0 & a^~a =1
		// we have 2 groups one whose last bit will be set and others group will be
		// unset
		int group1 = 0;
		int group2 = 0;
		int setBit = (z & ~(z - 1));
		//since the two numbers are distinct, so
		//there must be a set bit (that is, the bit with value '1') in the XOR result.
		System.out.println(setBit);
		for (int i = 0; i < arr.length; i++)
		{
			if ((arr[i] & setBit) == setBit)
			{
				group1 = group1 ^ arr[i];
			} else
			{
				group2 = group2 ^ arr[i];
			}
		}
		System.out.println(Math.min(group1, group2) + " " + Math.max(group1, group2));

	}

}

/* https://github.com/shahiddhariwala */
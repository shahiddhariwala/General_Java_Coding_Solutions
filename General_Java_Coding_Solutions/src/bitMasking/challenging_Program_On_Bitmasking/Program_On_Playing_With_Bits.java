/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Shahid Bhaiya likes to play with bits. One day Shahid Bhaiya decides to assign a task to his student Neha.
 *  You have help Neha to complete this task. Task is as follows - Shahid Bhaiya gives Q queries each query 
 *  containing two integers a and b. Your task is to count the no of set-bits in for all numbers between a and b (both inclusive)

Input Format
Read Q - No of Queries, Followed by Q lines containing 2 integers a and b.

Constraints
Q,a,b are integers.

Output Format
Q lines, each containing an output for your query.

Sample Input
2
1 1
10 15
Sample Output
1
17
*/

package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Scanner;

public class Program_On_Playing_With_Bits
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int a =sc.nextInt();
			int b=sc.nextInt();
			int count = helpNeha(a,b);
			System.out.println(count);
		}
		sc.close();

	}

	private static int helpNeha(int a, int b)
	{
		int count=0;
		for (int i = a; i <= b; i++)
		{
			count+=Integer.bitCount(i);
		}
		return count;
	}

}

/* https://github.com/shahiddhariwala */
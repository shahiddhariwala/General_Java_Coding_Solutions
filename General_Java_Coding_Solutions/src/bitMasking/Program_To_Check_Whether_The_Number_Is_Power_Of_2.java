/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

import java.util.Scanner;

public class Program_To_Check_Whether_The_Number_Is_Power_Of_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean ans = checkPow2(num);
		System.out.println(ans);
		sc.close();
		/*
		 * 32
		 * true
		 * 31
		 * false
		 */

	}

	private static boolean checkPow2(int num)
	{
		int bitCount = 0;
		while (num != 0)
		{
			if ((num & 1) == 1)
			{
				bitCount++;
			}
			num = num >> 1;
		}
		return bitCount == 1;
	}

}

/* https://github.com/shahiddhariwala */
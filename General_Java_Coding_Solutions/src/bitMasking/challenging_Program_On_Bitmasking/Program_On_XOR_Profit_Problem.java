/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * We are given two coins of value x and y. We have to find the maximum of value of a XOR b where x <= a <= b <= y.

Input Format
We are given two integers x and y

Constraints
l <= r <= 1000

Output Format
Print the maximum value of a XOR b

Sample Input
5
6
Sample Output
3
Explanation
If a and b are taken to be 5. Then a xor b = 0
If a and b are taken to be 6. Then a xor b = 0
If a is 5 and b is 6. Then a xor b is 3.
 */
package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Scanner;

public class Program_On_XOR_Profit_Problem
{
	/*
	 * A simple solution is to generate all pairs, find their XOR values and finally
	 * return the maximum XOR value.
	 * 
	 * 
	 * 
	 * An efficient solution is to consider pattern of binary values from L to R. We
	 * can see that first bit from L to R either changes from 0 to 1 or it stays 1
	 * i.e. if we take the XOR of any two numbers for maximum value their first bit
	 * will be fixed which will be same as first bit of XOR of L and R itself.
	 * After observing the technique to get first bit, we can see that if we XOR L
	 * and R, the most significant bit of this XOR will tell us the maximum value we
	 * can achieve i.e. let XOR of L and R is 1xxx where x can be 0 or 1 then
	 * maximum XOR value we can get is 1111 because from L to R we have all possible
	 * combination of xxx and it is always possible to choose these bits in such a
	 * way from two numbers such that their XOR becomes all 1. It is explained below
	 * with some examples,
	 * 
	 * Examples 1:
	 * L = 8 R = 20
	 * L ^ R = (01000) ^ (10100) = (11100)
	 * Now as L ^ R is of form (1xxxx) we
	 * can get maximum XOR as (11111) by
	 * choosing A and B as 15 and 16 (01111
	 * and 10000)
	 * 
	 * Examples 2:
	 * L = 16 R = 20
	 * L ^ R = (10000) ^ (10100) = (00100)
	 * Now as L ^ R is of form (1xx) we can
	 * get maximum xor as (111) by choosing
	 * A and B as 19 and 20 (10011 and 10100)
	 * So the solution of this problem depends on the value of (L ^ R) only. We will
	 * calculate the L^R value first and then from most significant bit of this
	 * value, we will add all 1s to get the final result.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = maxProfit(x, y);
		System.out.println(ans);
		sc.close();
	}

	private static int maxProfit(int x, int y)
	{
		int LXR = x^y;
		
		int posOfMSB = 0 ;
		while(LXR>0)
		{
			posOfMSB++;
			LXR = LXR >>1;
		}
		
		int temp = 1;
		int maXOR=0;
		while(posOfMSB-->0)
		{
			maXOR+=temp;
			temp = temp <<1;
		}
		return maXOR;
	}

}

/* https://github.com/shahiddhariwala */
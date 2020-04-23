/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * The Planet Earth is under a threat from the aliens of the outer space and the Marvel Avengers team 
 * is busy fighting against them. Meanwhile, The Incredible Hulk has to defeat an enemy who is N steps 
 * above the level where he is standing (assume it as the 0th level). Hulk, because of his incredible
 *  jumping ability can take jumps in power of 2. In order to defeat the enemy as quickly as possible 
 *  he has to reach the Nth step in minimum moves possible. Help Hulk to find the same and contribute in 
 *  saving the Mother Earth.



Input Format
The first line contains the number of test cases T. T test cases follow: The first line of each test case 
contains a number N.

Constraints
1 <= T <= 10
1 <= N <= 10^5

Output Format
Output T lines, containing the minimum number of moves required by Hulk to reach the Nth step

Sample Input
3
3
4
5
Sample Output
2
1
2
Explanation
Let total steps is n, find the nearest integer which is of power 2 and less then n. let it would be k. 
now remaining steps to cover is n-k and result = 1 + min steps for (n-k) remaining steps.
 */
package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Scanner;

public class Program_To_Help_Incredible_Hulk
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int steps = sc.nextInt();
			System.out.println(helpHulk(steps));
		}
		sc.close();
	}

	private static int helpHulk(int steps)
	{
		int setCount = 0;
		// while (steps != 0)
		// {
		// if ((steps & 1) == 1)
		// {
		// setCount++;
		// }
		// steps = steps >> 1;
		// }

		// Brian Kernighans Method

		// Subtracting 1 from a decimal number flips all the bits after the rightmost
		// set bit(which is 1) including the rightmost set bit.
		// for example :
		// 10 in binary is 00001010
		// 9 in binary is 00001001
		// 8 in binary is 00001000
		// 7 in binary is 00000111
		// So if we subtract a number by 1 and do bitwise & with itself (n & (n-1)), we
		// unset the rightmost set bit. If we do n & (n-1) in a loop and count the no of
		// times loop executes we get the set bit count.
		// The beauty of this solution is the number of times it loops is equal to the
		// number of set bits in a given integer.
		while (steps != 0)
		{
			steps = steps & (steps - 1); // Clear the least significant bit
			setCount++;
		}
		return setCount;
	}

}

/* https://github.com/shahiddhariwala */
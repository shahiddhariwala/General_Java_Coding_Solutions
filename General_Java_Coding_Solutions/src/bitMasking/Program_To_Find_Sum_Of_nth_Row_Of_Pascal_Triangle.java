/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

import java.util.Scanner;

public class Program_To_Find_Sum_Of_nth_Row_Of_Pascal_Triangle
{

	// Pascal Traingle is like
	/*
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * 1 4 6 4 1
	 * 1 5 10 10 5 1
	 * 
	 * sum of each row
	 * 1 = 2^0 =1
	 * 1 1 = 2^1 = 2
	 * 1 2 1 = 2^2 = 4
	 * 1 3 3 1 = 2^3 = 8
	 * 1 4 6 4 1 = 2^4 = 16
	 * 1 5 10 10 5 1 = 2^5 = 32
	 * 
	 * Genral Formula Sum of Ith row = 2^(i-1);
	 * 
	 * 
	 * Sum of all ith row is : 2^i-1
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = getSumOfIthPascalRow(num);
		System.out.println(ans);
		System.out.println("Sum of all row till " + num + "th is " + ((1 << num) - 1));
		/*
		 * 5
		 * 16
		 * Sum of all row till 5th is 31
		 * 
		 */
		sc.close();
	}

	private static int getSumOfIthPascalRow(int num)
	{

		return 1 << (num - 1);
	}

}

/* https://github.com/shahiddhariwala */
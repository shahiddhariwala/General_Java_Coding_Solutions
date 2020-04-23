/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

import java.util.Scanner;

public class Program_To_Find_Magical_Numbers
{

	public static void main(String[] args)
	{
		/*
		 * Magical Numbers are numbers which is power of 5 or sum of powers of 5
		 * e.q 5^1 , 5^2, 5^5+5^1, etc
		 * We have to find Ith Magical Number
		 * 
		 * 5
		 * 25
		 * 30
		 * 125
		 * 130
		 * 150
		 * 155
		 * 625
		 * 630
		 * 650
		 * 655
		 * 750
		 * 755
		 * 775
		 * 780
		 * 3125
		 * 3130
		 * 3150
		 * 3155
		 * 3250
		 */

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = findIthMagicalNumber(num);
		System.out.println(ans);

//		for (int i = 1; i < 21; i++)
//		{
//			System.out.println(findIthMagicalNumber(i));
//		}
		sc.close();

	}

	private static int findIthMagicalNumber(int i)
	{
		int ans = 0;
		int pow = 1;
		while (i != 0)
		{
			pow = pow * 5;

			//We are using subsets
			if ((i & 1) == 1)
			{
				ans = ans + pow;
			}
			i = i >> 1;
		}
		return ans;
	}

}

/* https://github.com/shahiddhariwala */
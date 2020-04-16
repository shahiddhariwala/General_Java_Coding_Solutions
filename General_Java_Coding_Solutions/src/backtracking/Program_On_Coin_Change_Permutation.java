/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package backtracking;

public class Program_On_Coin_Change_Permutation
{
	public static int count;

	public static void main(String[] args)
	{
		int coins[] =
		{ 2, 3, 5, 6 };
		int n = 10;// amount to make
		printPermutation(coins, n, 0, "");
		System.out.println("Total Permutation Possible => " + count);
		/*
		 * 1. 22222
		 * 2. 2233
		 * 3. 226
		 * 4. 2323
		 * 5. 2332
		 * 6. 235
		 * 7. 253
		 * 8. 262
		 * 9. 3223
		 * 10. 3232
		 * 11. 325
		 * 12. 3322
		 * 13. 352
		 * 14. 523
		 * 15. 532
		 * 16. 55
		 * 17. 622
		 * Total Combination Possible => 17
		 */
	}

	private static void printPermutation(int[] coins, int n, int amountTillNow, String output)
	{
		if (amountTillNow == n)
		{
			count++;
			System.out.println(count + ". " + output);
			return;
		}
		for (int i = 0; i < coins.length; i++)
		{
			if ((amountTillNow + coins[i]) <= n)
			{
				printPermutation(coins, n, amountTillNow + coins[i], output + coins[i]);
			}
		}
	}

}

/* https://github.com/shahiddhariwala */
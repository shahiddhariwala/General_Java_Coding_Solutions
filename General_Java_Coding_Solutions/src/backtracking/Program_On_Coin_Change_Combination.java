/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package backtracking;

public class Program_On_Coin_Change_Combination
{
	public static int count;

	public static void main(String[] args)
	{
		int coins[] =
		{ 2, 3, 5, 6 };
		int n = 10;// amount to make
		printCombinations(coins, n, 0, 0, "");
		System.out.println("Total Combination Possible => " + count);
		/*
		 * 1. 22222
		 * 2. 2233
		 * 3. 226
		 * 4. 235
		 * 5. 55
		 * Total Combination Possible => 5
		 */
	}

	private static void printCombinations(int[] coins, int n, int amountTillNow, int lastCoinIndex, String output)
	{
		if (amountTillNow == n)
		{
			count++;
			System.out.println(count + ". " + output);
		}
		for (int i = lastCoinIndex; i < coins.length; i++)
		{
			if ((amountTillNow + coins[i]) <= n)
			{
				printCombinations(coins, n, amountTillNow + coins[i], i, output + coins[i]);
			}
		}
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn where 'n' is always even. They take alternate terms. In each turn, a player picks either the first coin or the last coin from the row and removes it from the row. The value of coin is received by that player. Determine the maximum value that Piyush can win with if he moves first. Both the players play optimally.

Input Format
First line contains the number of coins 'n'.
Second line contains n space separated integers where ith index denotes the value of ith coin.

Constraints
1 < N <= 30 , N is always even
0 <= Ai <= 1000000

Output Format
Print a single line with the maximum possible value that Piyush can win with.

Sample Input
4
1 2 3 4
Sample Output
6
Explanation
Piyush will pick the coin 4. Then Nimit can pick either 1 or 3. In both the cases piyush picks coin 2 and wins with a total of 6.
*/

package recursion.challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_On_Optimal_game_Strategy_1
{/*
	 * Approach Discussion
	 * At first look , this looks like a Greedy problem but it is clearly not so.
	 * This can clearly be observed in a simple testcase like
	 * 4
	 * 5 4 8 6
	 * Clearly , we would need an optimal solution for this. At each instance we
	 * would need to consider two possibilities that we can pick the first as well
	 * as the last element of the remaining array. Both these possibilities give
	 * rise to two more possibilities depending on the other player. Since the
	 * second player plays optimally and try to minimise our score. So overall we
	 * have two possibilities at each instance.
	 * For the first possibility , where we could pick the first element , the other
	 * player will pick the next element from the side that would minimise our total
	 * score.
	 * Similarly , for the second possibility , where we can pick the last element ,
	 * the other player would still pick the next element from the side that would
	 * minimise our total score.
	 * We entertain both these cases and take the maximum result of the two and
	 * return that result.
	 * We take two pointer variables , say ‘i’ and ‘j’ which each represent the
	 * starting and the ending point of the remaining array currently in
	 * consideration. We work till the two pointers cross each other.
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		long maxValue = optimalGame(arr, 0, arr.length - 1);
		System.out.println(maxValue);
		sc.close();
	}

	public static long optimalGame(int arr[], int i, int j)
	{
		if (i > j)
		{
			return 0;
		}
		// Consider both the possibilities. You can pick either the first or the last
		// coin.
		// Since the opponent plays optimally , we would get the minimum of the
		// remaining coins for each choice.
		long pickFirst = arr[i] + Math.min(optimalGame(arr, i + 2, j), optimalGame(arr, i + 1, j - 1));
		long pickLast = arr[j] + Math.min(optimalGame(arr, i, j - 2), optimalGame(arr, i + 1, j - 1));

		// Pick the max of two as your final result
		long ans = Math.max(pickFirst, pickLast);

		return ans;
	}
}

/* https://github.com/shahiddhariwala */
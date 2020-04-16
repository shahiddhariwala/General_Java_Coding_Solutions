/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package backtracking;

public class Program_On_1D_Queen_Combination
{
	public static int count = 0;

	public static void main(String[] args)
	{
		int numQueens = 2;
		int boardLength = 4;
		boolean board[] = new boolean[boardLength];
		// we need to find number of combination to place N Queens on above board
		combination1DQueen(board, numQueens, 0, -1, "");
		System.out.println("Total Combination Possible => " + count);
		/*
		 * 1. q0b0 q1b1
		 * 2. q0b0 q1b2
		 * 3. q0b0 q1b3
		 * 4. q0b1 q1b2
		 * 5. q0b1 q1b3
		 * 6. q0b2 q1b3
		 * Total Combination Possible => 6
		 */

	}

	private static void combination1DQueen(boolean[] board, int numQueens, int queenPlacedSoFar, int lastBoxUsed,
			String output)
	{
		if (numQueens == queenPlacedSoFar)
		{
			count++;
			System.out.println(count + ". " + output + " ");

			return;
		}
		for (int i = lastBoxUsed + 1; i < board.length; i++)
		{

			combination1DQueen(board, numQueens, queenPlacedSoFar + 1, i,
					output + ("q" + queenPlacedSoFar + "b" + i + " "));

		}
		return;
	}

}

/* https://github.com/shahiddhariwala */
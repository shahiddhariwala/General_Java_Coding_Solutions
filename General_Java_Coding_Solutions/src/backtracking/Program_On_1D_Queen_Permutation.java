/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package backtracking;

public class Program_On_1D_Queen_Permutation
{

	public static void main(String[] args)
	{
		int numQueens = 2;
		int boardLength = 4;
		boolean board[] = new boolean[boardLength];
		// we need to find number of arrangements to place 2 Queens on above board
		int permutation = permutation1DQueen(board, numQueens, 0, "");
		System.out.println(permutation);
		/*
		 * q0b0 q1b1
		 * q0b0 q1b2
		 * q0b0 q1b3
		 * q0b1 q1b0
		 * q0b1 q1b2
		 * q0b1 q1b3
		 * q0b2 q1b0
		 * q0b2 q1b1
		 * q0b2 q1b3
		 * q0b3 q1b0
		 * q0b3 q1b1
		 * q0b3 q1b2
		 * 12
		 */

	}

	private static int permutation1DQueen(boolean[] board, int numQueens, int queenPlacedSoFar, String output)
	{
		if (numQueens == queenPlacedSoFar)
		{
			System.out.println(output + " ");
			return 1;
		}
		int count = 0;
		for (int i = 0; i < board.length; i++)
		{

			if (board[i] == false)
			{
				// if there is no queen on the box , then only place the queen
				board[i] = true;
				count += permutation1DQueen(board, numQueens, queenPlacedSoFar + 1,
						output + " " + ("q" + queenPlacedSoFar + "b" + i));
				board[i] = false;
			}

		}
		return count;
	}

}

/* https://github.com/shahiddhariwala */
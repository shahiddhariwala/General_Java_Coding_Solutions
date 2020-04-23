/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are given an empty chess board of size N*N. Find the number of ways to place N queens on the board,
 *  such that no two queens can kill each other in one move. A queen can move vertically, horizontally and diagonally.

Input Format
A single integer N, denoting the size of chess board.

Constraints
1<=N<=11

Output Format
A single integer denoting the count of solutions.

Sample Input
4
Sample Output
2
*/
package backtracking.challenging_Program_On_Backtracking;

import java.util.Scanner;

public class Program_To_Find_Number_Of_Ways_To_Put_N_Queens
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numQueens = sc.nextInt();
		boolean board[][] = new boolean[numQueens][numQueens];
		int count = findNQueens(board, 0);
		System.out.println(count);

		sc.close();

	}

	private static int findNQueens(boolean[][] board, int row)
	{
		if (row == board.length)
		{
			return 1;
		}
		int count = 0;
		for (int i = 0; i < board[row].length; i++)
		{
			if (isItSafeToPlaceQueen(board, row, i))
			{
				board[row][i] = true;
				count += findNQueens(board, row + 1);
				board[row][i] = false;
			}
		}
		return count;
	}

	private static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col)
	{
		// no need to check row
		// check column
		for (int r = 0; r <= row; r++)
		{
			if (board[r][col] == true)
				return false;
		}
		// check left diagonal
		int i = row;
		int j = col;
		while (i >= 0 && j >= 0)
		{
			if (board[i][j] == true)
				return false;
			i--;
			j--;
		}
		// check right diagonal
		i = row;
		j = col;
		while (i >= 0 && j < board[row].length)
		{
			if (board[i][j] == true)
				return false;
			i--;
			j++;
		}
		return true;
	}

}

/* https://github.com/shahiddhariwala */
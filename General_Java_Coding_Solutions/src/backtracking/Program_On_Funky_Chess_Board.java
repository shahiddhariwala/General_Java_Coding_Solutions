/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*A knight is a piece used in the game of chess. The chessboard itself is square array of cells. Each time a knight moves, its resulting position is two rows and one column, or two columns and one row away from its starting position. Thus a knight starting on row r, column c – which we’ll denote as (r,c) – can move to any of the squares (r-2,c-1), (r-2,c+1), (r-1,c-2), (r-1,c+2), (r+1,c-2), (r+1,c+2), (r+2,c-1), or (r+2,c+1). Of course, the knight may not move to any square that is not on the board.

Suppose the chessboard is not square, but instead has rows with variable numbers of columns, and with each row offset zero or more columns to the right of the row above it. The figure to the left illustrates one possible configuration. How many of the squares in such a modified chessboard can a knight, starting in the upper left square (marked with an asterisk), not reach in any number of moves without resting in any square more than once? Minimize this number.

Imgur

If necessary, the knight is permitted to pass over regions that are outside the borders of the modified chessboard, but as usual, it can only move to squares that are within the borders of the board.

Input Format
First line contains an integer n, representing the side of square of chess board. The next n line contains n integers separated by single spaces in which jjth integer is 1 if that cell(i,j) is part of chessboard and 0 otherwise.

Constraints
The maximum dimensions of the board will be 10 rows and 10 columns. That is, any modified chessboard specified by the input will fit completely on a 10 row, 10 column board.

Output Format
Print the minimum number of squares that the knight can not reach.

Sample Input
3
1 1 1
1 1 1
1 1 1
Sample Output
1
*/

package backtracking;

import java.util.Scanner;

public class Program_On_Funky_Chess_Board
{

	/*
	 * This problem can be done using "recursion/dfs and similar" fashion. once you
	 * visit a cell,
	 * then visit all the cells that can be visited from this cell and also visit
	 * the cells that
	 * can be further visited from the next reachable cells.
	 */
	public static int maxHits; // stores the maximum of value of visited squares
	/*
	 * xMove[] and yMove[] define next move of Knight.
	 * xMove[] is for next value of x coordinate
	 * yMove[] is for next value of y coordinate
	 * (r-2,c-1), (r-2,c+1), (r-1,c-2), (r-1,c+2), (r+1,c-2), (r+1,c+2), (r+2,c-1),
	 * or (r+2,c+1).
	 */
	public static int xMove[] =
	{ 2, 1, -1, -2, -2, -1, 1, 2 };
	public static int yMove[] =
	{ 1, 2, 2, 1, -1, -2, -2, -1 };

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int boardDimension = sc.nextInt();
		int board[][] = new int[boardDimension][boardDimension];
		int numCells = 0;
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board.length; j++)
			{
				board[i][j] = sc.nextInt();
				if (board[i][j] == 1)
				{
					numCells++;
				}
			}
		}
		int ans = solveFunkyCHess(board, numCells);
		System.out.println(ans);
		sc.close();

	}

	private static int solveFunkyCHess(int[][] board, int numCells)
	{
		maxHits = 0;
		letKnightWalk(board, 0, 0, 0);
		return numCells - maxHits;
	}

	private static void letKnightWalk(int[][] board, int i, int j, int tempHitCount)
	{
		if (i >= board.length || j >= board.length || i < 0 || j < 0 || board[i][j] == 0)
		{
			return;
		}
		//lets mark current cell as visited
		board[i][j]=0;
		maxHits=Math.max(maxHits, tempHitCount+1);
		//now lets traverse to all 8 possible moves
		letKnightWalk(board, i - 1, j - 2, tempHitCount + 1);
		letKnightWalk(board, i - 2, j - 1, tempHitCount + 1);
		letKnightWalk(board, i + 1, j - 2, tempHitCount + 1);
		letKnightWalk(board, i + 2, j - 1, tempHitCount + 1);
		letKnightWalk(board, i - 1, j + 2, tempHitCount + 1);
		letKnightWalk(board, i - 2, j + 1, tempHitCount + 1);
		letKnightWalk(board, i + 1, j + 2, tempHitCount + 1);
		letKnightWalk(board, i + 2, j + 1, tempHitCount + 1);
		//backtrack
		board[i][j]=1;
	}

}

/* https://github.com/shahiddhariwala */
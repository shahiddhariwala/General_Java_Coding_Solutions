/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package backtracking;

public class Program_To_Count_N_Queen
{
	public static int countNQueens(boolean board[][], int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++)
		{
			if (isItSafeToPlaceQueen(board, row, col))
			{
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	private static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col)
	{
		//no need to check row 
		// check column
		for (int r = 0; r <= row; r++)
		{
			if (board[r][col] == true)
				return false;
		}
		//check left diagonal
		int i=row;
		int j=col;
		while(i >=0 && j >=0)
		{
			if (board[i][j] == true)
				return false;
			i--;
			j--;
		}
		//check right diagonal
		i=row;
		j=col;
		while(i >=0 && j <board[row].length)
		{
			if (board[i][j] == true)
				return false;
			i--;
			j++;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int N = 4;
		boolean board[][] = new boolean[4][4];
		System.out.println(countNQueens(board,0));
		//2
		

	}

}

/* https://github.com/shahiddhariwala */
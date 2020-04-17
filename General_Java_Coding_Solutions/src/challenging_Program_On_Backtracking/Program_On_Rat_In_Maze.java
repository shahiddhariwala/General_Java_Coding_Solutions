/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. 
 * The rat can move from position (i,j), down or right on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, 
rat can reach this position. A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).

Input Format
First line contains 2 integers, N and M, denoting the rows and columns in the grid. Next N line contains. M characters each. 
An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints
1<=N,M<=1000 GRID(i,j)='X' or 'O'

Output Format
If a solution exists: Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th
 cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If solution doesn't exist, just print "-1".

Sample Input
5 4
OXOO
OOOX
OOXO
XOOO
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 1 
0 0 0 1 
*/
package challenging_Program_On_Backtracking;

import java.util.Scanner;

public class Program_On_Rat_In_Maze
{
	public static int mazeAnswer[][];

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		String maze[][] = new String[N][M];
		takeInputMatrix(maze, sc);
		mazeAnswer = new int[N][M];
		boolean flag = helpJerryInMaze(maze, 0, 0, N, M);
		if (flag == false)
		{
			System.out.println("-1");

		} else
		{
			printMatrix(mazeAnswer);
		}
		sc.close();

	}

	/*
	 * If destination is reached print the solution matrix .
	 * Else .
	 * a) Mark current cell in solution matrix as 1.
	 * b) Move forward in the horizontal direction and recursively check if this
	 * move leads to a solution.
	 * c) If the move chosen in the above step doesn't lead to a solution then move
	 * down and check if this move leads to a solution.
	 * d) If none of the above solutions works then unmark this cell as 0
	 * (BACKTRACK) and return false
	 * 
	 */
	private static boolean helpJerryInMaze(String[][] maze, int row, int col, int N, int M)
	{
		if (row == N - 1 && col == M - 1)
		{
			mazeAnswer[N - 1][M - 1] = 1;
			return true;
		}

		if (row >= N || col >= M)
		{
			return false;
		}
		if (maze[row][col].equals("X"))
		{
			return false;
		}
		mazeAnswer[row][col] = 1;// ASSUMING THE PATH IS POSSIBLE
		boolean moveForward = helpJerryInMaze(maze, row, col + 1, N, M);
		boolean moveDOwn = false;
		if (moveForward == false)
		{
			// if we cant move forward then only ,try moving down
			moveDOwn = helpJerryInMaze(maze, row + 1, col, N, M);
		}

		if (moveForward || moveDOwn)
		{
			return true;
		}

		// Yahan aane se path nahin mila !
		mazeAnswer[row][col] = 0;// backtracking

		if (moveForward == false && moveDOwn == false)
		{
			// if going forward and downward doesnot give any path, then we should Mark it
			// dead
			// inorder to avoid regoing through same cell
			maze[row][col] = "X";
		}
		return false;
	}

	private static void takeInputMatrix(String[][] maze, Scanner sc)
	{
		for (int i = 0; i < maze.length; i++)
		{
			maze[i] = sc.nextLine().split("");
		}
	}

	private static void printMatrix(int[][] maze)
	{
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

	}
}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. 
 * The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. 
There exits a unique path in the grid . Find that path and help the rat reach its cheese.

Input Format
First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O'
 denotes that the cell is empty.

Constraints
1 <= N , M <= 10

Output Format
Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered 
in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"

Sample Input
5 4
OXOO
OOOX
XOXO
XOOX
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 
 */
package backtracking.challenging_Program_On_Backtracking;

import java.util.Scanner;

public class Program_On_Rat_Chases_Its_Cheese
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
			System.out.println("NO PATH FOUND");

		} else
		{
			printMatrix(mazeAnswer);
		}
		sc.close();
	}

	private static boolean helpJerryInMaze(String[][] maze, int row, int col, int N, int M)
	{
		if (row == N - 1 && col == M - 1)
		{
			mazeAnswer[N - 1][M - 1] = 1;
			return true;
		}

		//since we can always go in 4 direction , it is possible we could get on the same track 
		// in order to avoid that , check mazeAnswer[row][col]==1 ,if true we can return back since we have already travsersed to it
		
		if (row >= N || col >= M || row < 0 || col < 0 || mazeAnswer[row][col]==1)
		{
			return false;
		}

		if (maze[row][col].equals("X"))
		{
			return false;
		}

		// Assuming path is possible
		mazeAnswer[row][col] = 1;
		boolean goLeft;
		boolean goRight;
		boolean goUp;
		boolean goDown;
		
		 goLeft = helpJerryInMaze(maze, row, col - 1, N, M);
		 goRight = helpJerryInMaze(maze, row, col + 1, N, M);
		 goUp = helpJerryInMaze(maze, row - 1, col, N, M);
		 goDown = helpJerryInMaze(maze, row + 1, col, N, M);

		if (goDown || goLeft || goUp || goRight)
		{
			// if any path is possible then return true
			return true;
		}
		if (goLeft == false && goRight == false && goUp == false && goDown == false)
		{
			// if going forward and downward , left right doesnot give any path, then we
			// should Mark it
			// dead
			// inorder to avoid regoing through same cell
			maze[row][col] = "X";

		}
		// backtrack
		mazeAnswer[row][col] = 0;
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
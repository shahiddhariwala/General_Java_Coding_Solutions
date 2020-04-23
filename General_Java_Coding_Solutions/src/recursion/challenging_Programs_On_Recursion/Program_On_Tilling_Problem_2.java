/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m . A tile can either be placed horizontally or vertically.

Input Format
First line of input contains an integer T denoting the number of test cases. Then T test cases follow.
The first line of each test case contains two integers N and M.

Constraints
1 <= T<= 1000
1 <= N,M <= 100000

Output Format
Print answer for every test case in a new line modulo 10^9+7.

Sample Input
2
2 3
4 4
Sample Output
1
2
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Program_On_Tilling_Problem_2
{
	public static int topDownDP[];

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			// lets start with 0,0
			topDownDP = new int[N + 1];
			Arrays.fill(topDownDP, -1);
			int ans = findWaysToTileTheFloor(N, M);
			System.out.println(ans);
		}
		sc.close();

	}

	/*
	 * Read the problem as a matrix of size M x N, rather than N x M as it helps in
	 * easy visualization.
	 * In this manner,
	 * A tile can be either place vertically,meaning it will only occupy a cell of
	 * width 1 and a complete hieght of M. Or,
	 * You can place M tiles horizontally one over the other if there is enough
	 * width left.
	 */
	private static int findWaysToTileTheFloor(int n, int m)
	{
		if (n < 0)
		{
			return 0;
		}
		if (n >= 1 && n < m)
		{
			return 1;
		} else if (n == m)
		{
			return 2;
		}
		if (topDownDP[n] == -1)
		{
			topDownDP[n] = ((findWaysToTileTheFloor(n - 1, m) % 1000000007)
					+ (findWaysToTileTheFloor(n - m, m) % 1000000007)) % 1000000007;
		}
		return topDownDP[n];
	}

}

/* https://github.com/shahiddhariwala */
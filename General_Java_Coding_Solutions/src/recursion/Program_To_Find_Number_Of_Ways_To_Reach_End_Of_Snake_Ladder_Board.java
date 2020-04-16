/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

import java.util.ArrayList;

public class Program_To_Find_Number_Of_Ways_To_Reach_End_Of_Snake_Ladder_Board
{

	public static void main(String[] args)
	{
		// No SNake and ladders in board of last number N
		int N = 6;
		// Problem is similar to number of ways to form a word;
		int numberOfFacesOfDice = 6;
		System.out.println(findNumberOfPathToReachEnd(N, numberOfFacesOfDice));
		ArrayList<String> al = getAllPathsToReachEnd(N, numberOfFacesOfDice);
		System.out.println(al);
		System.out.println(al.size());
		/*
		 * 32
		 * [111111, 11112, 11121, 1113, 11211, 1122, 1131, 114, 12111, 1212, 1221, 123,
		 * 1311, 132, 141, 15, 21111, 2112, 2121, 213, 2211, 222, 231, 24, 3111, 312,
		 * 321, 33, 411, 42, 51, 6]
		 * 32
		 */
	}

	private static ArrayList<String> getAllPathsToReachEnd(int n, int m)
	{
		if(n <0)
		{
			ArrayList<String> baseList = new ArrayList<>();
			return baseList;
			//if we return empty array , it won;t work for sum exceeding n
		}
		if(n==0)
		{
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		ArrayList<String> myResult = new ArrayList<>();
		for(int i=1;i<=m;i++)
		{
			 ArrayList<String> recursionResult = getAllPathsToReachEnd(n-i,m);
			 for(String s : recursionResult)
			 {
				 myResult.add(i+s);
			 }
		}
		return myResult;
	}

	private static int findNumberOfPathToReachEnd(int n, int m)
	{
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return 1;// {},{1}
		if (n == 2)
			return 2; // {1,1}{2}
		else
		{
			int numWays = 0;
			for (int i = 1; i <= m; i++)
			{
				numWays = numWays + findNumberOfPathToReachEnd(n - i, m);
			}
			return numWays;
		}

	}

}

/* https://github.com/shahiddhariwala */
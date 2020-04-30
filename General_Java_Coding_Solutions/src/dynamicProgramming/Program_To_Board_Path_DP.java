/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package dynamicProgramming;

public class Program_To_Board_Path_DP
{

	private static long startTime;
	private static long endTime;

	public static void startAlgo()
	{
		startTime = System.currentTimeMillis();
	}

	private static void endAlgo()
	{
		endTime = System.currentTimeMillis();
		System.out.println("Excecution Time : " + (endTime - startTime) + "ms");
	}

	public static void main(String[] args)
	{
		int dice[] =
		{ 1, 2, 3, 4, 5, 6 };
		int endNum = 40; // (0->10 no snakes and ladder)
		System.out.println("for " + endNum);
		startAlgo();
		System.out.println(countBoardPathDNC(endNum, dice));
		endAlgo();
		startAlgo();
		System.out.println(countBoardPathTDDP(endNum, dice));
		endAlgo();
		startAlgo();
		System.out.println(countBoardPathBUDP(endNum, dice));
		endAlgo();
		/*
		 * 
		 * for 10
		 * 492
		 * Excecution Time : 0ms
		 * 492
		 * Excecution Time : 0ms
		 * 492
		 * Excecution Time : 0ms
		 * 
		 * 
		 * for 30
		 * 437513522
		 * Excecution Time : 3228ms
		 * 437513522
		 * Excecution Time : 0ms
		 * 437513522
		 * Excecution Time : 0ms
		 * 
		 */
	}

	private static long countBoardPathTDDP(int endNum, int[] dice)
	{
		long topDownDp[] = new long[endNum + 1];
		return countBoardPathTDDP(endNum, dice, topDownDp);
	}

	// O(n) we are only counting each value one time
	private static long countBoardPathTDDP(int num, int[] dice, long[] topDownDp)
	{

		if (num < 0)
		{
			return 0;
		}
		if (topDownDp[num] == 0)
		{
			if (num == 1 || num == 0)
			{
				topDownDp[num] = 1;
			} else
			{
				long numWays = 0;

				for (int i = 0; i < dice.length; i++)
				{
					numWays = numWays + countBoardPathTDDP(num - dice[i], dice, topDownDp);
				}
				topDownDp[num] = numWays;
			}
		}
		return topDownDp[num];
	}

	// O(n)
	private static long countBoardPathBUDP(int endNum, int[] dice)
	{
		long bottomUpDp[] = new long[endNum + 1];
		bottomUpDp[0] = 1;
		// We know to reach 0 we have 1 ways and to reach 1 we have 1 ways
		// so we know to reach N we have to num ways to reach N-1 and then just add 1 to
		// it to reach N
		for (int num = 1; num <= endNum; num++)
		{
			long count = 0;
			for (int i = 0; i < dice.length && num - dice[i] >= 0; i++)
			{
				count = count + bottomUpDp[num - dice[i]];
			}
			bottomUpDp[num] = count;
		}
		return bottomUpDp[endNum];
	}

	// O(6^n)
	private static long countBoardPathDNC(int num, int dice[])
	{
		if (num < 0)
		{
			return 0;
		}
		if (num == 1 || num == 0)
		{
			return 1;
		}
		long numWays = 0;
		for (int i = 0; i < dice.length; i++)
		{
			numWays = numWays + countBoardPathDNC(num - dice[i], dice);
		}
		return numWays;
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package dynamicProgramming;

public class Program_Edit_Distance_DP
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
		String str1 = "shahiddha";
		String str2 = "nahidureenshahid";
		// add, replace,remove
		// find minimum number of steps to make str2 to str1
		startAlgo();
		System.out.println(getMinStepsDNC(str1, str2, 0, 0));
		endAlgo();
		startAlgo();
		System.out.println(getMinStepsTDDP(str1, str2, 0, 0, new int[str1.length() + 1][str2.length() + 1]));
		endAlgo();
		startAlgo();
		System.out.println(getMinStepsBUDP(str1, str2));
		endAlgo();
		/*
		 * 11
		 * Excecution Time : 198ms
		 * 11
		 * Excecution Time : 1ms
		 * 11
		 * Excecution Time : 0ms
		 * 
		 */

	}

	// O(2^(str1 length+str2 length))
	private static int getMinStepsDNC(String str1, String str2, int index1, int index2)
	{

		if (index1 == str1.length())
		{
			return str2.length() - index2;
		} else if (index2 == str2.length())
		{
			return str1.length() - index1;
		}

		if (str1.charAt(index1) == str2.charAt(index2))
		{
			return getMinStepsDNC(str1, str2, index1 + 1, index2 + 1);
		} else
		{
			int count1 = 1 + getMinStepsDNC(str1, str2, index1 + 1, index2 + 1);
			int count2 = 1 + getMinStepsDNC(str1, str2, index1, index2 + 1);
			int count3 = 1 + getMinStepsDNC(str1, str2, index1 + 1, index2);
			return Math.min(count1, Math.min(count2, count3));
		}

	}

	// O(s1.length * s2.length)
	private static int getMinStepsTDDP(String str1, String str2, int index1, int index2, int[][] topDownDP)
	{

		if (index1 == str1.length())
		{
			return str2.length() - index2;
		} else if (index2 == str2.length())
		{
			return str1.length() - index1;
		}

		if (topDownDP[index1][index2] == 0)
		{

			if (str1.charAt(index1) == str2.charAt(index2))
			{
				topDownDP[index1][index2] = getMinStepsTDDP(str1, str2, index1 + 1, index2 + 1, topDownDP);
			} else
			{
				int count1 = 1 + getMinStepsTDDP(str1, str2, index1 + 1, index2 + 1, topDownDP);
				int count2 = 1 + getMinStepsTDDP(str1, str2, index1, index2 + 1, topDownDP);
				int count3 = 1 + getMinStepsTDDP(str1, str2, index1 + 1, index2, topDownDP);
				topDownDP[index1][index2] = Math.min(count1, Math.min(count2, count3));
			}
		}
		return topDownDP[index1][index2];

	}

	// O(s1.length * s2.length)
	private static int getMinStepsBUDP(String str1, String str2)
	{
		int bottumUpDP[][] = new int[str1.length() + 1][str2.length() + 1];

		// i=0 row is for empty string and j=0 col is for empty string
		for (int i = 0; i < bottumUpDP.length; i++)
		{
			for (int j = 0; j < bottumUpDP[0].length; j++)
			{
				if (i == 0 && j == 0)
				{
					// empty vs empty string
					bottumUpDP[i][j] = 0;
				} else if (i == 0)
				{
					bottumUpDP[i][j] = 1 + bottumUpDP[i][j - 1];
				} else if (j == 0)
				{
					bottumUpDP[i][j] = 1 + bottumUpDP[i - 1][j];
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1))
				{
					bottumUpDP[i][j] = bottumUpDP[i - 1][j - 1];
				} else
				{
					int count1 = bottumUpDP[i - 1][j - 1];
					int count2 = bottumUpDP[i - 1][j];
					int count3 = bottumUpDP[i][j - 1];
					bottumUpDP[i][j] = 1 + Math.min(count1, Math.min(count2, count3));
				}
			}
		}
		return bottumUpDP[str1.length()][str2.length()];
	}
}

/* https://github.com/shahiddhariwala */
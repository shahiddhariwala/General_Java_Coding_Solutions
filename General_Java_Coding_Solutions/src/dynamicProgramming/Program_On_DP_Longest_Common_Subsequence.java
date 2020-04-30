/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package dynamicProgramming;

public class Program_On_DP_Longest_Common_Subsequence
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
		String str1 = "rockstarcoder";
		String str2 = "shahidisbestcoder"; // sacoder
		startAlgo();
		System.out.println(getLCSDNC(str1, str2, 0, 0));
		endAlgo();
		startAlgo();
		System.out.println(getLCSTopDownDP(str1, str2, 0, 0, new int[str1.length() + 1][str2.length() + 1]));
		endAlgo();
		startAlgo();
		System.out.println(getLCSBottomUPDP(str1, str2));
		endAlgo();

		/*
		 * 7
		 * Excecution Time : 1692ms
		 * 7
		 * Excecution Time : 0ms
		 * 7
		 * Excecution Time : 0ms
		 * 
		 */

	}

	//O(2^(s1 length+s2 length))
	private static int getLCSDNC(String str1, String str2, int index1, int index2)
	{
		if (index1 >= str1.length() || index2 >= str2.length())
		{
			return 0;
		}

		int ifSame = 0;
		if (str1.charAt(index1) == str2.charAt(index2))
		{
			ifSame = 1 + getLCSDNC(str1, str2, index1 + 1, index2 + 1);
		}
		int c1 = getLCSDNC(str1, str2, index1 + 1, index2);
		int c2 = getLCSDNC(str1, str2, index1, index2 + 1);

		return Math.max(ifSame, Math.max(c1, c2));
	}

	private static int getLCSTopDownDP(String str1, String str2, int index1, int index2, int topDownDP[][])
	{
		if (index1 >= str1.length() || index2 >= str2.length())
		{
			return 0;
		}
		if (topDownDP[index1][index2] == 0)
		{

			if (str1.charAt(index1) == str2.charAt(index2))
			{
				topDownDP[index1][index2] = 1 + getLCSTopDownDP(str1, str2, index1 + 1, index2 + 1, topDownDP);
			} else
			{
				int c1 = getLCSTopDownDP(str1, str2, index1 + 1, index2, topDownDP);
				int c2 = getLCSTopDownDP(str1, str2, index1, index2 + 1, topDownDP);
				topDownDP[index1][index2] = Math.max(c1, c2);
			}
		}
		return topDownDP[index1][index2];
	}

	private static int getLCSBottomUPDP(String str1, String str2)
	{
		int bottomUpDP[][] = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 1; i < bottomUpDP.length; i++)
		{
			for (int j = 1; j < bottomUpDP[0].length; j++)
			{
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
				{
					bottomUpDP[i][j] = bottomUpDP[i - 1][j - 1] + 1;
				} else
				{
					bottomUpDP[i][j] = Math.max(bottomUpDP[i - 1][j], bottomUpDP[i][j - 1]);
				}
			}
		}

		return bottomUpDP[str1.length()][str2.length()];
	}
}

/* https://github.com/shahiddhariwala */
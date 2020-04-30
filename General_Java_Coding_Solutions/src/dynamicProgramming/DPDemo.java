/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package dynamicProgramming;

public class DPDemo
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
		System.out.println("Excecution Time : " + (endTime - startTime) + " ms");
	}

	public static void main(String[] args)
	{
		int n = 45;
		startAlgo();
		System.out.println(fib(n));
		endAlgo();

		// Using array to store repeated calculation,i.e overlapping calculation
		long storeArray[] = new long[n + 1];
		startAlgo();
		System.out.println(fib(n, storeArray));
		endAlgo();
		// BottomUp DP
		startAlgo();
		System.out.println(fibIS(n));
		endAlgo();
		/*
		 * 1134903170
		 * Excecution Time : 7643 ms
		 * 1134903170
		 * Excecution Time : 0 ms
		 * 1134903170
		 * Excecution Time : 0 ms
		 * 
		 */
	}

	// 0(n) TopDown DP
	private static long fib(int n, long[] storeArray)
	{
		if (n <= 0)
		{
			return 0;
		}
		if (storeArray[n] == 0)
		{
			if (n == 1)
			{
				storeArray[n] = n;
			} else
			{
				storeArray[n] = fib(n - 1, storeArray) + fib(n - 2, storeArray);
			}
		}
		return storeArray[n];
	}

	// O(n) BottomUp
	private static long fibIS(int n)
	{
		int[] bottomUpDp = new int[n + 1];
		bottomUpDp[0] = 0;
		bottomUpDp[1] = 1;

		for (int i = 2; i <= n; i++)
		{
			bottomUpDp[i] = bottomUpDp[i - 1] + bottomUpDp[i - 2];
		}

		return bottomUpDp[n];
	}

	// O(2^n)
	private static long fib(int n)
	{
		if (n < 0)
		{
			return 0;
		}
		if (n == 1 || n == 0)
		{
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

}

/* https://github.com/shahiddhariwala */
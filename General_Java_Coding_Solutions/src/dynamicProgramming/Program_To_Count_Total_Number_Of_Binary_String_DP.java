/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package dynamicProgramming;

public class Program_To_Count_Total_Number_Of_Binary_String_DP
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
		// Count the number of Binary Strings of Length N such that there are no
		// consecutive 1's present inside Binary Strings
		// N =2 , {0 0 , 1 0 , 1 1 , 0 1} ans = 3 {0 0 , 1 0 , 0 1} 1 1 not inlcude
		// since we have consecutive 1s
		int n = 25;
		startAlgo();
		System.out.println(countBinaryStringsDNC(n, 0, ""));
		endAlgo();
		startAlgo();
		System.out.println(countBinaryStringsBottomUp(n));
		endAlgo();
		/*
		 * n=10
		 * 0000000000
		 * 0000000001
		 * 0000000010
		 * 0000000100
		 * 0000000101
		 * 0000001000
		 * 0000001001
		 * 0000001010
		 * 0000010000
		 * 0000010001
		 * 0000010010
		 * 0000010100
		 * 0000010101
		 * 0000100000
		 * 0000100001
		 * 0000100010
		 * 0000100100
		 * 0000100101
		 * 0000101000
		 * 0000101001
		 * 0000101010
		 * 0001000000
		 * 0001000001
		 * 0001000010
		 * 0001000100
		 * 0001000101
		 * 0001001000
		 * 0001001001
		 * 0001001010
		 * 0001010000
		 * 0001010001
		 * 0001010010
		 * 0001010100
		 * 0001010101
		 * 0010000000
		 * 0010000001
		 * 0010000010
		 * 0010000100
		 * 0010000101
		 * 0010001000
		 * 0010001001
		 * 0010001010
		 * 0010010000
		 * 0010010001
		 * 0010010010
		 * 0010010100
		 * 0010010101
		 * 0010100000
		 * 0010100001
		 * 0010100010
		 * 0010100100
		 * 0010100101
		 * 0010101000
		 * 0010101001
		 * 0010101010
		 * 0100000000
		 * 0100000001
		 * 0100000010
		 * 0100000100
		 * 0100000101
		 * 0100001000
		 * 0100001001
		 * 0100001010
		 * 0100010000
		 * 0100010001
		 * 0100010010
		 * 0100010100
		 * 0100010101
		 * 0100100000
		 * 0100100001
		 * 0100100010
		 * 0100100100
		 * 0100100101
		 * 0100101000
		 * 0100101001
		 * 0100101010
		 * 0101000000
		 * 0101000001
		 * 0101000010
		 * 0101000100
		 * 0101000101
		 * 0101001000
		 * 0101001001
		 * 0101001010
		 * 0101010000
		 * 0101010001
		 * 0101010010
		 * 0101010100
		 * 0101010101
		 * 1000000000
		 * 1000000001
		 * 1000000010
		 * 1000000100
		 * 1000000101
		 * 1000001000
		 * 1000001001
		 * 1000001010
		 * 1000010000
		 * 1000010001
		 * 1000010010
		 * 1000010100
		 * 1000010101
		 * 1000100000
		 * 1000100001
		 * 1000100010
		 * 1000100100
		 * 1000100101
		 * 1000101000
		 * 1000101001
		 * 1000101010
		 * 1001000000
		 * 1001000001
		 * 1001000010
		 * 1001000100
		 * 1001000101
		 * 1001001000
		 * 1001001001
		 * 1001001010
		 * 1001010000
		 * 1001010001
		 * 1001010010
		 * 1001010100
		 * 1001010101
		 * 1010000000
		 * 1010000001
		 * 1010000010
		 * 1010000100
		 * 1010000101
		 * 1010001000
		 * 1010001001
		 * 1010001010
		 * 1010010000
		 * 1010010001
		 * 1010010010
		 * 1010010100
		 * 1010010101
		 * 1010100000
		 * 1010100001
		 * 1010100010
		 * 1010100100
		 * 1010100101
		 * 1010101000
		 * 1010101001
		 * 1010101010
		 * 144
		 * Excecution Time : 8ms
		 * 144
		 * Excecution Time : 0ms
		 * 
		 * 196418
		 * Excecution Time : 144ms
		 * 196418
		 * Excecution Time : 0ms
		 */

	}

	// O(2^n) it will perform very bad for
	private static long countBinaryStringsDNC(int n, int len, String stringSoFar)
	{

		if (n == len)
		{
			// System.out.println(stringSoFar);
			return 1;
		}

		long endWithzeros = countBinaryStringsDNC(n, len + 1, stringSoFar + "0");
		long endWithOnes = 0;
		if (stringSoFar.length() == 0 || stringSoFar.charAt(len - 1) != '1')
		{
			endWithOnes = countBinaryStringsDNC(n, len + 1, stringSoFar + "1");
		}

		return endWithzeros + endWithOnes;
	}

	// O(n)
	private static long countBinaryStringsBottomUp(int n)
	{
		// Its like a fibonacci series
		long ones[] = new long[n];
		long zeros[] = new long[n];

		// Seed
		ones[0] = 1;
		zeros[0] = 1;

		for (int i = 1; i < n; i++)
		{
			zeros[i] = zeros[i - 1] + ones[i - 1];
			ones[i] = zeros[i - 1];
		}
		return zeros[n - 1] + ones[n - 1];
	}

}

/* https://github.com/shahiddhariwala */
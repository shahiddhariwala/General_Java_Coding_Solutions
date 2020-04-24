/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * Given a string, count the number of distinct subsequences of it 
 * ( including empty subsequence ). For the uninformed, A subsequence of a string is a 
new string which is formed from the original string by deleting some of the characters
 without disturbing the relative positions of the remaining characters. For example, 
 "AGH" is a subsequence of "ABCDEFGH" while "AHG" is not.

Input Format
First line of input contains an integer 't' denoting number of test cases.
Next t lines contain a string each.

Constraints
1<=t<=100
1<=length of s<=100000
s will contain upper letters only.

Output Format
For each test case ,print ans%1000000007 in a new line each ,where ans is the number of distinct subsequences.

Sample Input
2
AAA
ABCDEFG
Sample Output
4
128
Explanation
For "AAA" , the distinct subsequences that can be formed are { '', 'A' , 'AA' , 'AAA }. So we print 4 ,
 no of distinct subsequences.
 */

package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Count_Subsequences_From_Given_Subsequences
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		sc.nextLine();
		int ans[] = new int[numCases];
		for (int i = 1; i <= numCases; i++)
		{
			String str = sc.nextLine();
			// printAllSubsequences(str);
			ans[i - 1] = countSubsequences(str);

		}
		for (int i : ans)
		{
			System.out.println(i);
		}
		sc.close();
	}

	private static String filterChars(String str, int num)
	{
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while (num > 0)
		{

			if ((num & 1) == 1)
			{
				sb.append(str.charAt(i));
			}
			num = num >> 1;
			i++;
		}
		return sb.toString();

	}

	private static void printAllSubsequences(String str)
	{
		int len = str.length();
		int range = (1 << len) - 1;
		for (int i = 0; i <= range; i++)
		{
			System.out.println(filterChars(str, i));
		}
		/*
		 * abcde
		 * 
		 * a
		 * b
		 * ab
		 * c
		 * ac
		 * bc
		 * abc
		 * d
		 * ad
		 * bd
		 * abd
		 * cd
		 * acd
		 * bcd
		 * abcd
		 * e
		 * ae
		 * be
		 * abe
		 * ce
		 * ace
		 * bce
		 * abce
		 * de
		 * ade
		 * bde
		 * abde
		 * cde
		 * acde
		 * bcde
		 * abcde
		 */
	}

	/*
	 * Approach 1: Dynamic Programming
	 * Intuition and Algorithm
	 * 
	 * Even though the final code for this problem is very short, it is not very
	 * intuitive to find the answer. In the solution below, we'll focus on finding
	 * all subsequences (including empty ones), and subtract the empty subsequence
	 * at the end.
	 * 
	 * Let's try for a dynamic programming solution. In order to not repeat work,
	 * our goal is to phrase the current problem in terms of the answer to previous
	 * problems. A typical idea will be to try to count the number of states dp[k]
	 * (distinct subsequences) that use letters S[0], S[1], ..., S[k].
	 * 
	 * Naively, for say, S = "abcx", we have dp[k] = dp[k-1] * 2. This is because
	 * for dp[2] which counts ("", "a", "b", "c", "ab", "ac", "bc", "abc"), dp[3]
	 * counts all of those, plus all of those with the x ending, like ("x", "ax",
	 * "bx", "cx", "abx", "acx", "bcx", "abcx").
	 * 
	 * However, for something like S = "abab", let's play around with it. We have:
	 * 
	 * dp[0] = 2, as it counts ("", "a")
	 * dp[1] = 4, as it counts ("", "a", "b", "ab");
	 * dp[2] = 7 as it counts ("", "a", "b", "aa", "ab", "ba", "aba");
	 * dp[3] = 12, as it counts ("", "a", "b", "aa", "ab", "ba", "bb", "aab", "aba",
	 * "abb", "bab", "abab").
	 * We have that dp[3]countsdp[2], plus("b", "aa", "ab", "ba", "aba")with"b"added
	 * to it. Notice that("", "a")are missing from this list, as they get double
	 * counted. In general, the sequences that resulted from putting"b"the last time
	 * (ie."b", "ab"`) will get double counted.
	 * 
	 * This insight leads to the recurrence:
	 * 
	 * dp[k] = 2 * dp[k-1] - dp[last[S[k]] - 1]
	 * 
	 * The number of distinct subsequences ending at S[k], is twice the distinct
	 * subsequences counted by dp[k-1] (all of them, plus all of them with S[k]
	 * appended), minus the amount we double counted, which is dp[last[S[k]] - 1].
	 * 
	 * 
	 */
	private static int countSubsequences(String str)
	{
		// Create an array to store index
		// of last
		int[] lastOccurences = new int[256];
		Arrays.fill(lastOccurences, -1);

		// dp[i] is going to store count of distinct
		// subsequences of length i
		int dp[] = new int[str.length() + 1];
		// Empty substring has only one subsequence
		dp[0] = 1;

		// Traverse through all lengths from 1 to str.length().
		for (int i = 1; i <= str.length(); i++)
		{
			// Number of subsequences with substring
			// str[0..i-1]
			dp[i] = (2 * dp[i - 1])%1000000007;
			// 2 becoz we have option for that char to be used or not to be used

			// If current character has appeared
			// before, then remove all subsequences
			// ending with previous occurrence.
			if (lastOccurences[(int) str.charAt(i - 1)] != -1)
			{
				// yeh check kr raha h ki jo char ka ascii no. h uspe pehle se updation h toh vo
				// char pehle occur kar gaya h
				// toh current value me uska contribution remove kardo
				dp[i] = (dp[i] - dp[lastOccurences[(int) str.charAt(i - 1)]]+1000000007)%1000000007;
				//Actually in large numbers during subtraction you should add MOD so that answer is not negative
			}

			// Mark occurrence of current character
			lastOccurences[(int) str.charAt(i - 1)] = (i - 1);
		}
		/*
		 * dp[i+i] gives us the number of subsequences upto i in the string.
		 * dp[i+1] = No. of distinct subsequences possible from S[0…i]
		 * So that’s we return dp[n] to get the answer.
		 */

		return dp[dp.length - 1]%1000000007;
	}

}

/* https://github.com/shahiddhariwala */
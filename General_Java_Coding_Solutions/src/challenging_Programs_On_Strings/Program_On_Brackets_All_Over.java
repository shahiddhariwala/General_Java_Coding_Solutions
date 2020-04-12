/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are given a string containing only opening and closing brackets "(" and ")" of size m. 
 * You have to append 2 strings a and b in the order a+s+b and make them valid string of size n 
 * with the following properties,

 1. At any index, number of opening brackets should be greater than or equal to closing brackets
 2. No. of opening and closing brackets should be equal. You have to tell number of combinations of string a and b 
if its possible, otherwise print "0" Print the asnwer with modulo 10^9 + 7.
Input Format
1st Line: n m 2nd Line: string s

Constraints
1<= m <= n <= 10^5 n-m <= 1200

Output Format
The number of combinations of a and b. Otherwise -1

Sample Input
4 2
((
Sample Output
1
Explanation
Only 1 possible case a="" , b="))"

In case
6 2
((

Possible answers are
((()))
()(())
(())()

So there are 3 possible combinations of a and b i.e
“(” and “)”
“()” and “”
“” and “()”

*/
/*Easy Explaination
 * as per the qn
y are given a string (s)
of size m

now u have to append 2 string (a) and (b) ==> a+s+b and the lenght of resultant string should be equals to n
and it should also satisfies the given 2 conditions.

given test case is like: ((
length(m) =2

we can add
a="" and b="))"
new length(n)=4


This problem can be solved with dynamic programming:

Calculate dp[i, j] : How many sequences of brackets of length i has balance j and intermediate balance never goes below zero (They form a prefix of a valid sequence of brackets).

For the given sequence of length n calculate the resulting balance a and the minimum balance b.

Try the length of the sequence added at the beginning c and its balance d. If  - b ≤ d then add dp[c, d] × dp[m - n - c, d + a] to the answer.

Time complexity: O((n - m)^2)


Let dp[i][j] = number of bracket sequences of length i and balance j.
Let’s formulate a recurrence for dp[i][j]. To do that, consider a bracket sequence of length i and balance j.
There are two cases: It’s either the sequence ends with a ‘)’ or it ends with a ‘(’. Let’s consider these cases.

Case 1: Ends with ‘)’
Then if we remove that last bracket, the remaining sequence must have a balance of j + 1, because that last ‘)’ must have matched a ‘(’ and thus reduced the number of unmatched left brackets to j.
So we have dp[i][j] = dp[i — 1][j + 1] in this case.

Case 2: Ends with ‘(’
Then if we remove that last bracket, the remaining sequence must have a balance of j — 1, because that last ‘(’ matches nothing and only adds to the number of unmatched left brackets.
In this case, we have dp[i][j] = dp[i — 1][j — 1]

Since case 1 and case 2 are just partitions of dp[i][j], we combine them to get the total possibilities for dp[i][j]:
dp[i][j] = dp[i — 1][j + 1] + dp[i — 1][j — 1]
 */
package challenging_Programs_On_Strings;

import java.util.Scanner;

public class Program_On_Brackets_All_Over
{
	public static int dp[][];

	public static long getParenthesis(String str)
	{
		long count = 0;

		if (str.charAt(str.length() - 1) == ')')
		{
		
		}
		return count % (1000000007);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int requiredLength = sc.nextInt();
		int legthOfGivenString = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		dp = new int[requiredLength][requiredLength - legthOfGivenString];
		long count = getParenthesis(str);
		System.out.println(count);
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
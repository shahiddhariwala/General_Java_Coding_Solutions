/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which is 
 * formed by the two distinct digits ai and bi but there is a rule to form n digit integer.

Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.

Alice is very weak in maths section. Help her to find the number of such n digit integers.

Input Format
The first line contains T, the number of test cases. Further T lines contains the value n which is the number of
 digit in the integer.

Constraints
1<=T<=20
1<=n<=25

Output Format
For each test case print the number of such n digit integer.

Sample Input
3
1
2
3
Sample Output
#1 : 2
#2 : 3
#3 : 5
Explanation
For n=1 : integers = a, b . For n=2 : integers = aa, ab, ba For n=3 : integers = aaa, aab, aba, baa, bab
*/
package challenging_Program_On_Backtracking;

import java.util.Scanner;

public class Program_On_Class_Assignment
{
	public static int count;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int n = sc.nextInt();
			count = 0;
			helpAlice(n, "", false);
			System.out.printf("#%d : %d\n", i, count);
			// One obersvation they are in fibonacci series 2,3,5,8,13,21,.......
			/*
			 * 6
			 * 1
			 * a
			 * b
			 * #1 : 2
			 * 2
			 * aa
			 * ab
			 * ba
			 * #2 : 3
			 * 3
			 * aaa
			 * aab
			 * aba
			 * baa
			 * bab
			 * #3 : 5
			 * 4
			 * aaaa
			 * aaab
			 * aaba
			 * abaa
			 * abab
			 * baaa
			 * baab
			 * baba
			 * #4 : 8
			 * 5
			 * aaaaa
			 * aaaab
			 * aaaba
			 * aabaa
			 * aabab
			 * abaaa
			 * abaab
			 * ababa
			 * baaaa
			 * baaab
			 * baaba
			 * babaa
			 * babab
			 * #5 : 13
			 * 6
			 * aaaaaa
			 * aaaaab
			 * aaaaba
			 * aaabaa
			 * aaabab
			 * aabaaa
			 * aabaab
			 * aababa
			 * abaaaa
			 * abaaab
			 * abaaba
			 * ababaa
			 * ababab
			 * baaaaa
			 * baaaab
			 * baaaba
			 * baabaa
			 * baabab
			 * babaaa
			 * babaab
			 * bababa
			 * #6 : 21
			 */
		}
		sc.close();

	}

	private static void helpAlice(int n, String str, boolean bFlag)
	{
		if (n == 0)
		{
			System.out.println(str);
			count++;
			return;
		}

		// we have 2 option to print a or to print b
		helpAlice(n - 1, str + 'a', false);
		if (!bFlag)
		{
			helpAlice(n - 1, str + 'b', true);
		}

		return;
	}
	/*Another Smart Approach
	If observed carefully , we can identify that this is a problem for fibonacci series. This is because at the nth place , there are two possibilities.
	Possibility 1 : We can choose to place the current character as 'a'. If so , then it doesn't matter whether we placed 'a' or 'b' at the previous position. The total number of ways in this possibility would equal to f(n-1)
	Possibility 2 : We can place the current character as 'b'. However we can only do it if the previous character was not 'b' . Hence the total number of ways for this case must be f(n-2)
	We add these two possibilities up and obtain the recursive relation
	f(n) = f(n-1) + f(n-2)
	This is clearly the recursive relation for Fibonacci Series.
	*/
}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Shahid has a string consisting of only 'a' and 'b' as the characters. Shahid describes perfectness 
 * of a string as the maximum length substring of equal characters. Shahid is given a number k which
 *  denotes the maximum number of characters he can change. Find the maximum perfectness he can generate
 *   by changing no more than k characters.

Input Format
The first line contains an integer denoting the value of K. The next line contains a string having only 
‘a’ and ‘b’ as the characters.

Constraints
2 ≤ N ≤ 10^5

Output Format
A single integer denoting the maximum perfectness achievable.

Sample Input
2
abba
Sample Output
4
*/
/*Shahid has a string consisting of only a and b as the characters.
 *  Shahid describes perfectness of a string as the maximum length substring of equal characters.
 *   Shahid is given a number K which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by swapping no more than k characters.

Basically, there is a string which consists of only a and b. A substring is a contiguous sequence of characters 
within a string. Our aim is to generate substrings of a and b by swapping characters such that the lengths of substrings of either a or b is maximum possible. The only constraint we have here is that only k swaps are allowed. So, you have to tell the maximum possible length of the substrings that can be generated. By swapping, we mean that a can be replaced by b and b can be replaced by a.

For example:
Consider the following string: abba and k = 2
So, we can make only two swaps

abba (swaps = 0)
aaba (swaps = 1)
aaaa (swaps = 2)

Thus, the maximum length of substring is 4.

Consider the string: ababab and k=2

ababab (swaps = 0)
aaabab (swaps =1)
aaaaab (swaps = 2)

Thus, the maximum length of substring is 5.
This problem can be solved with help of two pointers. Let the first pointer is l and the second pointer is r.
 Then for every position l we will move right end r until on the substring si.si + 1… sr 
 it is possible to make no more than k swaps to make this substring beautiful
 Then we need to update the answer with length of this substring and move l to the right.
*/
package stringAndStringBuilder.challenging_Programs_On_Strings;

import java.util.Scanner;

public class Program_On_Shahids_ab_Perfect_String
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int swaps = sc.nextInt(); sc.nextLine();
		String str = sc.nextLine();
		int maxLength=0;
		int aCount=0;
		int bCount=0;
		int left=0;
		for(int right =0;right<str.length();right++)
		{
			char ch = str.charAt(right);
			if(ch=='a')
			{
				aCount++;
			}
			else
			{
				bCount++;
			}
			if(Math.min(aCount, bCount)>swaps)
			{
				ch=str.charAt(left);
				if(ch=='a')
				{
					aCount--;
				}
				else
				{
					bCount--;
				}
				left++;
			}
			else
			{
				maxLength++;
			}
		}
		System.out.println(maxLength);
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Shahid is an extremely gifted student. He is great at everything including Combinatorics, Algebra, Number Theory, Geometry, Calculus, etc. He is not only smart but extraordinarily fast!.

One day Shahid was trying to find out if any one can possibly do calculations faster than him. As a result he made a very great contest and asked every one to come and take part.

In his contest he gave the contestants many different pairs of numbers. Each number is made from digits 0 or 1. The contestants should write a new number corresponding to the given pair of numbers. The rule is simple: The i-th digit of the answer is 1 if and only if the i-th digit of the two given numbers differ. In the other case the i-th digit of the answer is 0.

Shahid made many numbers and first tried his own speed. He saw that he can perform these operations on numbers of length ∞ (length of a number is number of digits in it) in a glance! He always gives correct answers so he expects the contestants to give correct answers, too. He is a good fellow so he won't give anyone very big numbers and he always gives one person numbers of same length.

Now you are going to take part in Shapur's contest. See if you are faster and more accurate.

Input Format
The first line contains an integer t , the no. of testcases. There are two inputs in each line. Each of them contains a single number. It is guaranteed that the numbers are made from 0 and 1 only and that their length is same. The numbers may start with 0. The length of each number doesn't exceed 100.

Constraints
Output Format
Write t lines — the corresponding answer to the corresponding input. Do not omit the leading 0s.

Sample Input
1
10111 10000
Sample Output
00111
Explanation
For the given example, Let str1 = "10111" and str2 = "10000", Value at first position of str1 is 1 and first position str2 is 1, hence according to the rule there will be 0 at the first position of the final ans.Similarly, for second position the value at second position of both of the strings is 0,so , there will be 0 at the second position of the final ans.Similarly, for third position the value at third position of str1 is 1 and str2 is 0,so , there will be 1 at the third position of the final ans and So, on.
*/

package stringAndStringBuilder.challenging_Programs_On_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Shapurs_Ultra_Fast_Mathematics
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numCases; i++)
		{
			String arr[] = br.readLine().split(" ");
			System.out.println(doFastCalculation(arr[0],arr[1]));
		}
		br.close();
	}

	private static String doFastCalculation(String str1, String str2)
	{
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				sb.append(0);
			}
			else
			{
				sb.append(1);
			}
		}
		return sb.toString();
	}

}

/* https://github.com/shahiddhariwala */
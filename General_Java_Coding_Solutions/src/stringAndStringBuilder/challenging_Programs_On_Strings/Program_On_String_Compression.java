/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Take as input S, a string. Write a function that does basic string compression
 * . Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice,
 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
*/
package stringAndStringBuilder.challenging_Programs_On_Strings;

import java.util.Scanner;

public class Program_On_String_Compression
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(doCompression(str));
		sc.close();

	}

	private static String doCompression(String str)
	{
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char ch = str.charAt(0);
		sb.append(ch);
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == ch)
			{
				count++;
			} else
			{
				if (count != 1)
				{
					sb.append(count);
				}

				count = 1;
				ch = str.charAt(i);
				sb.append(ch);
			}
		}
		if (count != 1)
		{
			sb.append(count);
		}
		return sb.toString();
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
*/
package challenging_Programs_On_Strings;

import java.util.Scanner;

public class Program_To_Print_Ascii_Differences
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++)
		{
			int c = str.charAt(i) - str.charAt(i-1);
			sb.append(c);
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
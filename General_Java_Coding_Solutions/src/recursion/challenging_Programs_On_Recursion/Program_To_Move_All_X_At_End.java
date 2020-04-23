/*
Code by  : Shahid Dhariwala 
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
E.g. for “abexexdexed” return “abeedeedxxx”.
Print the value returned

Input Format
Single line input containing a string

Constraints
Length of string <= 1000

Output Format
Single line displaying the string with all x's moved at the end

Sample Input
axbxc
Sample Output
abcxx
Explanation
All x's are moved to the end of string while the order of remaining characters remain the same.
*/
package recursion.challenging_Programs_On_Recursion;

public class Program_To_Move_All_X_At_End
{

	public static void main(String[] args)
	{
		System.out.println(moveXAtEnd("xxaxbxc"));

	}

	private static String moveXAtEnd(String str)
	{
		if (str.length() <= 1)
		{
			return str;
		}
		String drf = moveXAtEnd(str.substring(1));
		if (str.charAt(0) != 'x')
		{
			String os = str.charAt(0) + drf;
			return os;
		}
		return drf + str.charAt(0);
	}

}

/* https://github.com/shahiddhariwala */
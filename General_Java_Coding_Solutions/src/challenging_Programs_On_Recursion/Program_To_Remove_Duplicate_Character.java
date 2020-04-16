/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are
 *  reduced to a single char. E.g. for “hello” return “helo”. Print the value returned.

Input Format
Enter the string

Constraints
None

Output Format
Display the resulting string

Sample Input
hello
Sample Output
helo
*/
package challenging_Programs_On_Recursion;

public class Program_To_Remove_Duplicate_Character
{

	public static void main(String[] args)
	{
		System.out.println(doRecursiveDuplicateRemoval("hello"));
		System.out.println(doRecursiveDuplicateRemoval("helllo"));
		System.out.println(doRecursiveDuplicateRemoval("baap"));
		/*
		 * hel*lo
		 * hel*l*lo
		 * ba*ap
		 */
	}

	private static String doRecursiveDuplicateRemoval(String str)
	{
		if (str.length() <= 1)
		{
			return str;
		}
		String drf = doRecursiveDuplicateRemoval(str.substring(1));
		if (str.charAt(0) == drf.charAt(0))
		{
			return drf;
		}
		return str.charAt(0) + drf;
	}

}

/* https://github.com/shahiddhariwala */
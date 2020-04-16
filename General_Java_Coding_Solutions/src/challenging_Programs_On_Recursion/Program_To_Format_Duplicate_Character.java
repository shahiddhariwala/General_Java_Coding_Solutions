/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned

Input Format
Enter a String

Constraints
1<= Length of string <= 10^4

Output Format
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

Sample Input
hello
Sample Output
hel*lo
Explanation
We insert a "*" between the two consecutive 'l' .
*/
package challenging_Programs_On_Recursion;

public class Program_To_Format_Duplicate_Character
{

	public static void main(String[] args)
	{
		System.out.println(doRecursiveFormat("hello"));
		System.out.println(doRecursiveFormat("helllo"));
		System.out.println(doRecursiveFormat("baap"));
		/*
		 * hel*lo
		 * hel*l*lo
		 * ba*ap
		 */
	}

	private static String doRecursiveFormat(String str)
	{
		if (str.length() <= 1)
		{
			return str;
		}
		String drf = doRecursiveFormat(str.substring(1));
		if (str.charAt(0) == drf.charAt(0))
		{
			String os = str.charAt(0) + "*" + drf;
			return os;
		}
		return str.charAt(0) + drf;
	}

}

/* https://github.com/shahiddhariwala */
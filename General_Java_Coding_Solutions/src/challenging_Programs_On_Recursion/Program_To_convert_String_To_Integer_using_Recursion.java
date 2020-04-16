/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

Input Format
Enter a number in form of a String

Constraints
1 <= Length of String <= 10

Output Format
Print the number after converting it into integer

Sample Input
1234
Sample Output
1234
Explanation
Convert the string to int. Do not use any inbuilt functions.
*/
package challenging_Programs_On_Recursion;

public class Program_To_convert_String_To_Integer_using_Recursion
{

	public static void main(String[] args)
	{
		String str ="1000";
		int res = convertStringToInt(str);
		System.out.println(res);

	}

	private static int convertStringToInt(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int lastNum = str.charAt(str.length()-1)-48;
		int resultNumber = convertStringToInt(str.substring(0,str.length()-1));
		return lastNum+(resultNumber*10);
	}

}



/*https://github.com/shahiddhariwala*/
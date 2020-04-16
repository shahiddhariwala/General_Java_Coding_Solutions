/*
Code by  : Shahid Dhariwala 
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You will be given a numeric string S. Print all the possible codes for S.

Following vector contains the codes corresponding to the digits mapped.

string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

For example, string corresponding to 0 is " " and 1 is ".+@$"

Input Format
A single string containing numbers only.

Constraints
length of string <= 10

Output Format
All possible codes one per line in the following order.

The letter that appears first in the code should come first

Sample Input
12
Sample Output
.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c
Explanation
For code 1 the corresponding string is .+@$ and abc corresponds to code 2.
*/
package challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_on_Smart_KeyPad_1
{

	public static void main(String[] args)
	{
		String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printKeypadCodes(table,str,"");

	}

	private static void printKeypadCodes(String[] table, String str, String output)
	{
		if(str.length()==0)
		{
			System.out.println(output);
			return;
		}
		char ch = str.charAt(0);
		String myString = table[Integer.parseInt(ch+"")];
		for (int i = 0; i < myString.length(); i++)
		{
			printKeypadCodes(table, str.substring(1), output+myString.charAt(i));
		}
		
	}

}



/*https://github.com/shahiddhariwala*/
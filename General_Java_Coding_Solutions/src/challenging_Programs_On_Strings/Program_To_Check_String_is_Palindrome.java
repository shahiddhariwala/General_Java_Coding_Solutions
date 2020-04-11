/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.

Input Format
String

Constraints
String length between 1 to 1000 characters

Output Format
Boolean

Sample Input
abba
Sample Output
true
Explanation
A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".
*/
package challenging_Programs_On_Strings;

import java.util.Scanner;

public class Program_To_Check_String_is_Palindrome
{

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				flag=false;
				break;
			}
		}
		System.out.println(flag);
    }

}



/*https://github.com/shahiddhariwala*/
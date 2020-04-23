/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the 
 * characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

Input Format
Single line input containing a string

Constraints
Length of string <= 25

Output Format
Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

Sample Input
cab
Sample Output
abc
acb
bac
bca
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". 
We print them in lexicographical order.
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program_On_Dictionary_Order_Smaller
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		ArrayList<String> al = printAllSubsequences(string);
		Collections.sort(al);
		for (String s : al)
		{
			if(string.compareTo(s)>0)
			{

				System.out.println(s);
			}
		}

		sc.close();

	}

	private static ArrayList<String> printAllSubsequences(String str)
	{
		if (str.length() == 0)
		{
			ArrayList<String> baseList = new ArrayList<String>();
			baseList.add("");
			return baseList;
		}
		char ch = str.charAt(0);
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recursionResult = printAllSubsequences(str.substring(1));
		for (String s : recursionResult)
		{
			for(int i=0;i<=s.length();i++)
			{
				String temp = s.substring(0,i)+ch+s.substring(i);
				myResult.add(temp);
			}

		}

		return myResult;
	}

}

/* https://github.com/shahiddhariwala */
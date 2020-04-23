/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Print all the subsequences of a string in lexicographical order.

Input Format
First line contains an integer N, the no of strings.
Next, N lines follows one string per line.

Constraints
1 < len(str) < 20

Output Format
No of subsequences one per line

Sample Input
1  
ab
Sample Output
  
a  
ab  
b  
Explanation
4 subsequences are printed.
Empty string is a subsequence.
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program_To_Print_All_Subsequences_Of_String
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= numCases; i++)
		{
			String string = sc.nextLine();
			ArrayList<String> al = printAllSubsequences(string);
			Collections.sort(al);
			for (String s : al)
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
			myResult.add(s);
			myResult.add(ch + s);

		}

		return myResult;
	}

}

/* https://github.com/shahiddhariwala */
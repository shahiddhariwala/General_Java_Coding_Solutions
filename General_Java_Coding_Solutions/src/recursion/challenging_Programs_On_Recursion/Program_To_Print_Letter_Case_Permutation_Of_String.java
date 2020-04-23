/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 *  Print all possible strings we could create.

Input Format
Input a string S.

Constraints
S will be a string with length between 1 and 12.
S will consist only of letters or digits.

Output Format
Print all the output string in new line

Sample Input
a1b2
Sample Output
A1B2
A1b2
a1B2
a1b2
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.ArrayList;

public class Program_To_Print_Letter_Case_Permutation_Of_String
{

	public static void main(String[] args)
	{
		String str = "a1b2";
		ArrayList<String> ans = getPermutationOfString(str);
		System.out.println(ans);
		// [abc, bac, bca, acb, cab, cba]
		justPrintAllPermutation(str, "");
		// abc acb bac bca cab cba
	}

	private static void justPrintAllPermutation(String str, String output)
	{

		if (str.length() == 0)
		{
			System.out.print(output + " ");
			return;
		}

		char ch = str.charAt(0);
		if (ch >= 'A' && ch <= 'z')
		{
			String strch = ch + "";
			justPrintAllPermutation(str.substring(1), output + strch.toUpperCase());
			justPrintAllPermutation(str.substring(1), output + strch.toLowerCase());

		} else
		{
			justPrintAllPermutation(str.substring(1), output + ch);
		}

	}

	private static ArrayList<String> getPermutationOfString(String str)
	{
		if (str.equals(""))
		{
			ArrayList<String> baseList = new ArrayList();
			baseList.add("");
			return baseList;
		}

		char ch = str.charAt(0);
		ArrayList<String> getResult = getPermutationOfString(str.substring(1));
		ArrayList<String> myResult = new ArrayList<String>();
		for (int i = 0; i < getResult.size(); i++)
		{
			String temp = getResult.get(i);
			// loop for inserting our character
			if (ch >= '0' && ch <= '9')
			{
				myResult.add(ch + temp);
			} else
			{
				String starch = ch + "";
				myResult.add(starch.toUpperCase() + temp);
				myResult.add(starch.toLowerCase() + temp);
			}

		}
		return myResult;
	}

}

/* https://github.com/shahiddhariwala */
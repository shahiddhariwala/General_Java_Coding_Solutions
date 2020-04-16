/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

import java.util.ArrayList;

public class Program_To_Print_All_Permutation_Of_String
{

	public static void main(String[] args)
	{
		String str = "abc";
		ArrayList<String> ans = getPermutationOfString(str);
		System.out.println(ans);
		// [abc, bac, bca, acb, cab, cba]
		justPrintAllPermutation(str, "");
		//abc acb bac bca cab cba 
	}

	private static void justPrintAllPermutation(String str, String output)
	{

		if (str.length() == 0)
		{
			System.out.print(output + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			String newWithoutCh = str.substring(0, i) + str.substring(i + 1);
			justPrintAllPermutation(newWithoutCh, output + ch);
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
			for (int j = 0; j <= temp.length(); j++)
			{
				myResult.add(temp.substring(0, j) + ch + temp.substring(j));
			}

		}
		return myResult;
	}

}

/* https://github.com/shahiddhariwala */
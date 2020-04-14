/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_To_Get_Subsequences_ArrayList_Using_Recursion
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		ArrayList<String> al = getSubsequences(str);
		System.out.println(al);
		sc.close();
		// [, a, b, ab, c, ac, bc, abc]


	}

	private static ArrayList<String> getSubsequences(String str)
	{
		ArrayList<String> al;
		if(str.equals(""))
		{
			al = new  ArrayList<String>();
			al.add("");
			return al;
		}
		char ch = str.charAt(0);
		
		al = getSubsequences(str.substring(1));
		ArrayList<String> myResult = new ArrayList<String>();
		for (String s : al)
		{
			myResult.add(s);
			myResult.add(ch+s);
			
		}
		return myResult;
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_To_Print_Paths_To_Reach_End_Path
{

	public static void main(String[] args)
	{
		int n = 2;
		int m = 2;
		// reach (n,n) from 0,0 only movement is allowed 1 step horizonal right or 1
		// step vertical down
		ArrayList<String> al = printMazePath(n, m, 0, 0);
		for (String s : al)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(al.size());
		// HHVV HVHV HVVH VHHV VHVH VVHH
		// 6
		justPrintMazePath(n, m, 0, 0, "");
	}

	private static ArrayList<String> printMazePath(int n, int m, int i, int j)
	{
		if (i > n || j > m)
		{
			ArrayList<String> baseCase = new ArrayList<String>();
			return baseCase; // empty so that nothing can be printed
		}
		if (i == n && j == m)
		{
			ArrayList<String> baseCase = new ArrayList<String>();
			baseCase.add("");
			return baseCase;
		}
		// for any i & j
		// we can reach them by coming from top or from left
		ArrayList<String> rrH = printMazePath(n, m, i + 1, j);
		ArrayList<String> rrV = printMazePath(n, m, i, j + 1);
		ArrayList<String> myResult = new ArrayList<String>();
		for (String s : rrH)
		{
			myResult.add("H"+s);
		}
		for (String s : rrV)
		{
			myResult.add("V"+s);
		}
		return myResult;
	}

	private static void justPrintMazePath(int n, int m, int i, int j, String output)
	{
		if (i > n || j > m)
		{
			return;
		}

		if (i == n && j == m)
		{
			System.out.print(output + " ");
			return;
		}
		justPrintMazePath(n, n, i + 1, j, output + "H");
		justPrintMazePath(n, n, i, j + 1, output + "V");

	}

}

/* https://github.com/shahiddhariwala */
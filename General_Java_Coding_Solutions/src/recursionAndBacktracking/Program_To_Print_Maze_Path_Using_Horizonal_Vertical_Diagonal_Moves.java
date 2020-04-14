/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursionAndBacktracking;

import java.util.ArrayList;

public class Program_To_Print_Maze_Path_Using_Horizonal_Vertical_Diagonal_Moves
{

	public static int count=0;
	public static void main(String[] args)
	{
		int n = 2;
		int m = 2;
		justPrintMazePath(n,m,0,0,"");
		System.out.println("\n"+count);
		System.out.println(printMazePath(n,m,0,0));
//		VVHH VHVH HVVH DVH VDH VHHV HVHV DHV HHVV HDV VHD HVD DD 
//		13
//		[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]

	}
	private static void justPrintMazePath(int n ,int m,int i,int j,String output)
	{
		if (i > n || j > m)
		{
			return;
		}
		
		if(i== n && j == m )
		{
			count++;
			System.out.print(output+" ");
			return;
		}
		justPrintMazePath(n,m,i+1,j,"H"+output);
		justPrintMazePath(n,m,i,j+1,"V"+output);
		justPrintMazePath(n,m,i+1,j+1,"D"+output);
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
		ArrayList<String> rrD = printMazePath(n, m, i+1, j + 1);
		ArrayList<String> myResult = new ArrayList<String>();
		for (String s : rrH)
		{
			myResult.add("H" + s);
		}
		for (String s : rrV)
		{
			myResult.add("V" + s);
		}
		for (String s : rrD)
		{
			myResult.add("D" + s);
		}
		return myResult;
	}
}



/*https://github.com/shahiddhariwala*/
// Pattern
/*
===========================================================================
5
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 
===========================================================================


 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Down_Speed_Arrow
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, nsp = (2 * n) - 3; row <= n; row++)
		{
			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			if (row == n)
				nst = nst - 1;
			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			nst++;
			nsp -= 2;
			System.out.println();
		}
		System.out.println("===========================================================================");
		br.close();
		// logic end here

	}

}

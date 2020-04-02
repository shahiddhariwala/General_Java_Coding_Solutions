// Pattern
/*
===========================================================================
5
* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 
===========================================================================


 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Up_Speed_Arrow
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = n, nsp = 0; row <= n; row++)
		{
			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			int nst2 = nst;
			if (row == 1)
				nst2 = nst - 1;
			for (int cst = 1; cst <= nst2; cst++)
			{
				System.out.print("* ");
			}
			nst--;
			nsp = (2 * row) - 1;
			System.out.println();
		}
		System.out.println("===========================================================================");
		br.close();
		// logic end here

	}

}

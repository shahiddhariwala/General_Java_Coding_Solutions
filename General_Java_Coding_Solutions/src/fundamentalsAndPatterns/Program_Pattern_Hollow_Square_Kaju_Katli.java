// Pattern
/*
===========================================================================
9
        * 
      *   * 
    *       * 
  *           * 
*               * 
  *           * 
    *       * 
      *   * 
        * 
===========================================================================

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Hollow_Square_Kaju_Katli
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, nsp = n / 2, nspi = 0; row <= n; row++)
		{

			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}

			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nspi; csp++)
			{
				System.out.print("  ");
			}
			int nst2 = nst;
			if (row == 1 || row == n)
			{
				nst2 = 0;
			}
			for (int cst = 1; cst <= nst2; cst++)
			{
				System.out.print("* ");
			}
			if (row <= n / 2)
			{
				nspi = (2 * row) - 1;
				nsp -= 1;
			} else
			{
				nspi -= 2;
				nsp += 1;
			}

			System.out.println();
		}
		System.out.println("===========================================================================");
		br.close();
		// logic end here

	}

}

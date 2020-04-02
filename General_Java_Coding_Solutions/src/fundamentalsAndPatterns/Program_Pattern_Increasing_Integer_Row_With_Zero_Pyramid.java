// Pattern
/*
===========================================================================
5
				1	
			2	0	2	
		3	0	0	0	3	
	4	0	0	0	0	0	4	
5	0	0	0	0	0	0	0	5	
===========================================================================

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Increasing_Integer_Row_With_Zero_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, nsp = n - 1, num = 1; row <= n; row++, num = row)
		{
			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("\t");
			}

			for (int cst = 1; cst <= nst; cst++)
			{

				if (cst == 1 || cst == nst)
				{
					System.out.print(num + "\t");
				} else
				{
					System.out.print("0\t");
				}
			}
			nst = nst + 2;
			nsp -= 1;
			System.out.println();
		}
		System.out.println("===========================================================================");
		br.close();
		// logic end here

	}

}

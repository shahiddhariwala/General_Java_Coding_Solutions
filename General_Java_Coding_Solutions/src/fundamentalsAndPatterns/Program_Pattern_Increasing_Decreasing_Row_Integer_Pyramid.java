// Pattern
/*
===========================================================================
5
				1	
			1	2	1	
		1	2	3	2	1	
	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1	
===========================================================================

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Increasing_Decreasing_Row_Integer_Pyramid
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
				System.out.print(num + "\t");
				if (cst < row)
				{
					num += 1;
				} else
				{
					num -= 1;
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

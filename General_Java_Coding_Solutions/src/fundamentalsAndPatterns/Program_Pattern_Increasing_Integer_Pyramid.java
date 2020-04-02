// Pattern
/*
===========================================================================
5
				1	
			2	3	4	
		5	6	7	8	9	
	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25	
===========================================================================

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Increasing_Integer_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, nsp = n - 1, num = 1; row <= n; row++)
		{
			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("\t");
			}

			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print(num + "\t");
				num += 1;
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

// Pattern
/*
===========================================================================
10
                  0 
                9 0 9 
              8 9 0 9 8 
            7 8 9 0 9 8 7 
          6 7 8 9 0 9 8 7 6 
        5 6 7 8 9 0 9 8 7 6 5 
      4 5 6 7 8 9 0 9 8 7 6 5 4 
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 
===========================================================================

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Increasing_Decreasing_TopToBottom_Row_With_Zero_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========================================================================");
		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, nsp = n - 1, num = n; row <= n; row++, num = n - row + 1)
		{
			for (int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++)
			{
				if (cst == nst)
				{
					System.out.print("0 ");
				} else
				{
					System.out.print(num + " ");
					num++;
				}

			}
			num--;
			for (int cst = 1; cst <= nst - 1; cst++)
			{

				System.out.print(num + " ");
				num--;

			}
			nst = nst + 1;
			nsp -= 1;
			System.out.println();
		}
		System.out.println("===========================================================================");
		br.close();
		// logic end here

	}

}

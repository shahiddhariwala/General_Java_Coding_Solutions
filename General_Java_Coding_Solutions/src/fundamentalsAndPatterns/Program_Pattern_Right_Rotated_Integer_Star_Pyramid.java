// Pattern
/*
5
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
5 * 5 * 5 * 5 * 5 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1 

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Right_Rotated_Integer_Star_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1, num = 1; row <= (2 * n) - 1; row++)
		{
			for (int cst = 1; cst <= nst; cst++)
			{
				if (cst % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(num + " ");
			}
			if (row < n)
			{
				nst = nst + 2;
				num += 1;
			} else
			{
				nst -= 2;
				num -= 1;
			}

			System.out.println();
		}
		br.close();
		// logic end here

	}

}

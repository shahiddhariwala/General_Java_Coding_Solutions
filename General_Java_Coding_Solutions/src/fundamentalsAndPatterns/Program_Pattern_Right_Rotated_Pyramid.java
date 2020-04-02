// Pattern
/*
5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Right_Rotated_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int n = Integer.parseInt(br.readLine());

		for (int row = 1, nst = 1; row <= (2 * n) - 1; row++)
		{
			for (int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			if (row < n)
			{
				nst += 1;
			} else
			{
				nst -= 1;
			}

			System.out.println();
		}
		br.close();
		// logic end here

	}

}

// Pattern
/*
5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Upside_Down_Pyramid
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int number = 5;
		for (int i = 1; i <= number; i++)
		{

			for (int j = 1; j <= i - 1; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= (((number - i) * 2) + 1); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// logic end here

	}

}

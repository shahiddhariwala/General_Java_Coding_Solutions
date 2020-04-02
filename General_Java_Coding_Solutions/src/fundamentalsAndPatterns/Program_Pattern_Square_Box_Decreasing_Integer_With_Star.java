/*
5
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
*/
package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Square_Box_Decreasing_Integer_With_Star
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int lines = Integer.parseInt(br.readLine());
		for (int row = 1; row <= lines; row++)
		{
			for (int col = lines; col >= 1; col--)
			{
				if (col != row)
					System.out.print(col + " ");
				else
					System.out.print("* ");
			}
			System.out.print("\n");

		}
		// logic end here
		br.close();
	}

}

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Square_Box
{
// Pattern
//	* * * * * * 
//	* * * * * * 
//	* * * * * * 
//	* * * * * * 
//	* * * * * * 
//	* * * * * * 

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int number = Integer.parseInt(br.readLine());
		for (int i = 1; i <= number; i++)
		{
			for (int j = 1; j <= number; j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");

		}
		// logic end here
		br.close();
	}

}

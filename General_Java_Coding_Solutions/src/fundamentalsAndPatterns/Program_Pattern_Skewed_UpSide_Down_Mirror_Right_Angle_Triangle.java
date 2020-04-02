// Pattern
//* * * * * 
//    * * * * 
//        * * * 
//            * * 
//                * 

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_Skewed_UpSide_Down_Mirror_Right_Angle_Triangle
{

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Actual Program Logic
		int number = Integer.parseInt(br.readLine());
		for (int i = 1; i <= number; i++)
		{
			for (int j = 1; j <= (i - 1) * 2; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= number - i + 1; j++)
			{
				System.out.print("* ");
			}

			System.out.print("\n");

		}
		// logic end here
		br.close();

	}

}

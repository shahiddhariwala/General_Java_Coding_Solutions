// Pattern
//* * * * * 
//    * * * * 
//        * * * 
//            * * 
//                * 

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program_Pattern_Skewed_UpSide_Down_Mirror_Right_Angle_Triangle
{

	public static void main(String[] args) throws IOException
	{
		// File IO Start
		File input = new File("Input.txt");
		File output = new File("Output.txt");
		input.createNewFile();
		output.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(input));
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		// File IO End

		// Actual Program Logic
		int number = Integer.parseInt(br.readLine());
		for (int i = 1; i <= number; i++)
		{
			for (int j = 1; j <= (i - 1) * 2; j++)
			{
				bw.write("  ");
			}
			for (int j = 1; j <= number - i + 1; j++)
			{
				bw.write("* ");
			}

			bw.write("\n");

		}
		// logic end here
		br.close();
		bw.close();
	}

}

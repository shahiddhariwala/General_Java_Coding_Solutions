package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program_Reverse_Number
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

		int number = Integer.parseInt(br.readLine());
		int preserveNumber = number;
		int ans = 0;
		int rem = 0;
		while (number != 0)
		{
			// getting the last digit
			rem = number % 10;
			number /= 10;
			ans = ans * 10 + rem;
		}
		bw.write("Reverse of " + preserveNumber + " is " + ans);
		br.close();
		bw.close();
	}

}

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program_GCD_HCM
{

	public static void main(String[] args) throws IOException
	{
		// Input
		File input = new File("Input.txt");
		File output = new File("Output.txt");
		input.createNewFile();
		output.createNewFile();
		// return false if file exist
		// System.out.println("File Creation Done");

		// Reading from File
		BufferedReader br = new BufferedReader(new FileReader(input));
		// Writing to file
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));

		int divedent = Integer.parseInt(br.readLine());
		int divisor = Integer.parseInt(br.readLine());

		int rem = 0;

		while (divedent % divisor != 0)
		{
			rem = divedent % divisor;
			divedent = divisor;
			divisor = rem;
		}
		bw.write("GCD/HCM is " + rem);
		br.close();
		bw.close();
	}

}

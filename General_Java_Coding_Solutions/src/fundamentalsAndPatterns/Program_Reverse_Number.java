package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Reverse_Number
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
		System.out.print("Reverse of " + preserveNumber + " is " + ans);
		br.close();
	}

}

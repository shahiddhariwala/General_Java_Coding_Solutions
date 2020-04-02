package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_GCD_HCM
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int divedent = Integer.parseInt(br.readLine());
		int divisor = Integer.parseInt(br.readLine());

		int rem = 0;

		while (divedent % divisor != 0)
		{
			rem = divedent % divisor;
			divedent = divisor;
			divisor = rem;
		}
		System.out.print("GCD/HCM is " + rem);
		br.close();

	}

}

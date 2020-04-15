/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

public class Program_To_Calculate_Power_In_LogN
{

	public static void main(String[] args)
	{

		System.out.println(powerFunction(3, 4));
		System.out.println(powerFunction(2, 10));
		System.out.println(powerFunction(2, 5));
		System.out.println(powerFunction(2, 4));
		System.out.println(powerFunction(2, 2));
		/*
		 * 81
		 * 1024
		 * 32
		 * 16
		 * 4
		 */
	}

	// logN
	private static int powerFunction(int num, int n)
	{
		if (n == 0)
			return 1;
		int pow = powerFunction(num, n / 2);

		if (n % 2 == 1)
			return pow * pow * num;
		else
			return pow * pow;
	}

}

/* https://github.com/shahiddhariwala */
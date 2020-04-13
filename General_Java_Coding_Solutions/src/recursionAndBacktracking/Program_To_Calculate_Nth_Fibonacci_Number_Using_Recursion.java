/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

public class Program_To_Calculate_Nth_Fibonacci_Number_Using_Recursion
{

	public static void main(String[] args)
	{
		System.out.println(getFibo(120));
	}

	private static int getFibo(int n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return getFibo(n - 1) + getFibo(n - 2);
	}

}

/* https://github.com/shahiddhariwala */
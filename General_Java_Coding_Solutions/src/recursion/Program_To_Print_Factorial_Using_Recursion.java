/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursion;

public class Program_To_Print_Factorial_Using_Recursion
{

	public static void main(String[] args)
	{
		System.out.println(getFactorial(5));

	}

	private static int getFactorial(int n)
	{
		if(n==0 || n==1)
		{
			//base case
			return 1;
		}
		else
		{
			return n*getFactorial(n-1);
		}
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursion;

public class Program_To_Calculate_Power_Using_Recursion
{

	public static void main(String[] args)
	{
		System.out.println(power(2,4));
	}
	private static int power(int x, int n)
	{
		if(n==0)
		{
			//handles base case x^0 = 1
			return 1;
		}
		return x*(power(x,n-1));
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

public class Program_To_Print_N_Numbers_Using_Recursion
{
	public static void printIncreasing(int N)
	{
		// This called as Doing work as Stack is falling, before popping out of
		// activation record
		if (N == 0)
			return;
		else
			printIncreasing(N - 1);
		System.out.println("PI " + N);
	}

	public static void printDecreasing(int N)
	{

		// This called as Doing work as Stack is building
		if (N == 0)
			return;
		else
		{
			System.out.println("DI " + N);
			printDecreasing(N - 1);
		}
		// Tail Recursion , stack will be empty imdeddiately,as there is no work to do
		// after return
		// compiler does it to save time
	}

	public static void doWorkBeforeAndAfterCall(int n)
	{
		if (n == 0)
			return;
		else
		{
			// work before CALL
			System.out.println("DI2 " + n);
			doWorkBeforeAndAfterCall(n - 1);
			// work after CALL
			System.out.println("PI2 " + n);
		}
	}

	public static void PDISkip(int n)
	{
		if (n == 0)
			return;
		if (n % 2 == 1)
		{
			// odd number
			System.out.println(n);

		}
		PDISkip(n - 1);
		if (n % 2 == 0)
		{
			// even number
			System.out.println(n);
		}

	}

	public static void main(String[] args)
	{
		printDecreasing(5);
		printIncreasing(5);
		System.out.println("===================================");
		doWorkBeforeAndAfterCall(5);
		System.out.println("#######################################");
		PDISkip(5);

	}

}

/* https://github.com/shahiddhariwala */
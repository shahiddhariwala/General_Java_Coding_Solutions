/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops;

public class Method_Overloading_Demo
{
	static int sum(int a, int b)
	{
		System.out.println("int sum");
		return a + b;
	}

	static int sum(int a, int b, int c)
	{
		System.out.println("triple int sum");
		return a + b + c;
	}

	// static void sum(int a,int b,int c)
	// {
	// System.out.println("triple int sum");
	// System.out.println(a+b+c);
	// } Not possible as it will cause confusions

	static float sum(float a, float b)
	{
		System.out.println("float sum");
		return a + b;
	}

	static double sum(double a, double b)
	{
		System.out.println("double sum");
		return a + b;
	}

	// vaaraible arguments are kept last and in method only one varaible arguments
	// is allowed
	static int sum(int... param)
	{
		System.out.println("I am inside Variable Arguements Function");
		// Function with varaible number of arguments
		int sum = 0;
		for (int i : param)
		{
			sum += i;
		}
		return sum;
	}

	static int sum(String s, int... param)
	{
		System.out.println("I am inside Variable Arguements Function " + s);
		// Function with varaible number of arguments
		int sum = 0;
		for (int i : param)
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		// Method Overloading Type of Argument and Number of Arguments
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1.0f, 2.0f));
		System.out.println(sum(1.0, 2.0));
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(1, 2, 3, 4, 5, 6));
		System.out.println(sum(1, 2, 3, 4, 5, 6, 7));
		System.out.println(sum("Shahid", 1, 2, 3, 4, 5, 16, 7));
		int arr[] =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(sum(arr));

	}

}

/* https://github.com/shahiddhariwala */
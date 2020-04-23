/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

public class Program_To_Find_Even_Or_Odd
{

	public static void main(String[] args)
	{
		// For Every Number if its is Odd its LSB will be 1 or if its even number then
		// its LSB will be 0
		int num = 21;

		if ((num & 1) == 1)
		{
			System.out.println("Its Odd");
		} else
		{
			System.out.println("Its Even");
		}

		int num1 = 212;

		if ((num1 & 1) == 1)
		{
			System.out.println("Its Odd");
		} else
		{
			System.out.println("Its Even");
		}
		/*
		 * Its Odd
		 * Its Even
		 * 
		 */
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*

*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*	
 */
package recursion;

public class Program_To_Print_Triangle_Pattern_Using_Recursion
{

	public static void main(String[] args)
	{
		printPattern(5, 1, 1);

	}

	private static void printPattern(int N, int row, int col)
	{
		if (row > N)
		{
			return;
		}
		if (col <= row)
		{
			System.out.print("*\t");
			printPattern(N, row, col + 1);
		} else
		{
			System.out.println();
			printPattern(N, row + 1, 1);
		}
	}

}

/* https://github.com/shahiddhariwala */
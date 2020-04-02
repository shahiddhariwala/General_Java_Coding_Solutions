// Pattern
/*
5
        * 
      * ! * 
    * ! * ! * 
  * ! * ! * ! * 
* ! * ! * ! * ! * 

 */

package fundamentalsAndPatterns;

import java.io.IOException;

public class Program_Pattern_Star_Exclaimation_Pyramid
{

	public static void main(String[] args) throws IOException
	{

		int number = 5;
		for (int i = 1; i <= number; i++)
		{

			for (int j = 1; j <= number - i; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++)
			{
				if (j % 2 != 0)
					System.out.print("* ");
				else
					System.out.print("! ");
			}

			System.out.print("\n");

		}

	}

}

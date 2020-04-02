// Pattern
/*
5
*       * 
  *   *   
    *     
  *   *   
*       * 
6
*         * 
  *     *   
    * *     
    * *     
  *     *   
*         * 
7
*           * 
  *       *   
    *   *     
      *       
    *   *     
  *       *   
*           * 

 */

package fundamentalsAndPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Pattern_CrossX
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Actual Program Logic
		int number = Integer.parseInt(br.readLine());
		for (int i = 1; i <= number; i++)
		{

			for (int j = 1; j <= number; j++)
			{
				if (j == i || j == number - i + 1)
				{
					System.out.print("* ");
				} else
				{
					System.out.print("  ");
				}
			}

			System.out.print("\n");

		}
		// logic end here
		br.close();
	}

}

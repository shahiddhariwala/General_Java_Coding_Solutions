/*
Code by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 *Take N (number of rows), print the following pattern (for N = 4).
4
			1	
		2	3	2	
	3	4	5	4	3	
4	5	6	7	6	5	4	

     
     Each character is separated from other by a tab.
 */

package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Number_Triangle_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows = sc.nextInt();
		
		for(int row=1,nsp=numRows-1,nst=1;row<=numRows;row++)
		{
			int number=row;
			//space
			for(int csp = 1;csp<=nsp;csp++)
			{
				System.out.print("\t");
			}
			//numbers
			for(int cst = 1;cst<=nst;cst++)
			{
				System.out.print(number+"\t");
				if(cst>(nst/2))
				{
					number--;
				}
				else
				{
					number++;
				}
				
			}
			
			nst=nst+2;
			nsp=nsp-1;
			System.out.println();
		}
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
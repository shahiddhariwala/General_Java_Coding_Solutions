/*
Code by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * Take N (number of rows), print the following pattern (for N = 5).
5
*	*	*	*	*	
*	*		*	*	
*				*	
*	*		*	*	
*	*	*	*	*	

     
     Each '*' is separated from other by a tab.
 */

package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows = sc.nextInt();
		
		for(int row=1,nst=(numRows/2)+1,nsp=0;row<=numRows;row++)
		{
			//star
			for(int cst = 1;cst<=nst;cst++)
			{
				System.out.print("*\t");
			}
			//space
			for(int csp = 1;csp<=nsp;csp++)
			{
				System.out.print("\t");
			}
			//stars
			int nst2=nst;
			if(row == 1 || row ==numRows)
			{
				nst2=nst-1;
			}
			for(int cst = 1;cst<=nst2;cst++)
			{
				System.out.print("*\t");
			}
			if(row>(numRows/2))
			{
				nst=nst+1;
				nsp=nsp-2;
			}
			else
			{
				nst=nst-1;
				nsp=(row*2)-1;
			}
			System.out.println();
		}
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
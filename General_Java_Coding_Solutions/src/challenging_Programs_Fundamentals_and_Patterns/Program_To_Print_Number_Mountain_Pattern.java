/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Number_Mountain_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows = sc.nextInt();
		for (int row = 1,nst=1,nsp=(2*numRows)-3; row <= numRows; row++) {
			int number =1;
			for(int cst = 1 ; cst <= nst ; cst++)
			{
				System.out.print(number+"\t");
				number++;
			}
			
			for(int csp = 1 ; csp <= nsp ; csp++)
			{
				System.out.print("\t");
				
			}
			
			int nst2=nst;
			if(row==numRows)
			{
				nst2=nst-1;
				number--;
			}
			for(int cst = 1 ; cst <= nst2 ; cst++)
			{
				number--;
				System.out.print(number+"\t");
				
			}
			nst=nst+1;
			nsp=nsp-2;
			System.out.println();
		}

	}

}

/* https://github.com/shahiddhariwala */
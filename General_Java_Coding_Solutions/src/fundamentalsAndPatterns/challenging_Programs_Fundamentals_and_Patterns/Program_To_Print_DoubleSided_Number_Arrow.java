/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
Explanation
Catch the pattern and print it accordingly.
 */
package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_DoubleSided_Number_Arrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows  = sc.nextInt();
		for(int row=1,nspo = numRows,nspi=0,nst=1,number=1 ; row <=numRows ; row++)
		{
			for(int csp =1 ;csp <=nspo ; csp++)
			{
				System.out.print("  ");
			}
			for(int cst =1 ;cst<=nst;cst++)
			{
				System.out.print(number+" ");
				number--;
			}
			for(int csp =1 ;csp <=nspi ; csp++)
			{
				System.out.print("  ");
			}
			number++;
			int nst2=nst;
			if(row==1||row==numRows)
			{
				nst2=nst-1;
				number=2;
			}
			for(int cst =1 ;cst<=nst2;cst++)
			{
				System.out.print(number+" ");
				number++;
			}
			//System.out.print("| "+number);
			if(row>numRows/2)
			{
				nst=nst-1;
				nspi=nspi-2;
				number-=2;
				nspo=nspo+2;
			}
			else
			{
				nst=nst+1;
				nspi=(row*2)-1;
				nspo=nspo-2;
			}
			System.out.println();
		}
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5
Input Format
Take N as input.

Constraints
N <= 20

Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4 
     3 2 1 0 1 2 3 
       2 1 0 1 2 
         1 0 1 
           0 
         1 0 1 
       2 1 0 1 2 
     3 2 1 0 1 2 3 
   4 3 2 1 0 1 2 3 4 
 5 4 3 2 1 0 1 2 3 4 5
 */
package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Hourglass_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numRows = (2*num)+1;
		
		for(int row = 1,number=num,nsp=0,nst=numRows; row <= numRows; row++)
		{
			for(int csp = 1 ; csp <=nsp ; csp++)
			{
				System.out.print("  ");
			}
			
			for(int cst = 1 ; cst <= nst ; cst++)
			{
				
				System.out.print(number+" ");
				if(cst<=nst/2)
				{
					number--;
				}
				else
				{
					number++;
				}
				
			}
			if(row<=numRows/2)
			{
				number=number-2;
				nst=nst-2;
				nsp=nsp+1;
			}
			else
			{
				nst=nst+2;
				nsp=nsp-1;
			}
			
			
			System.out.println();
		}
		sc.close();
	}

}



/*https://github.com/shahiddhariwala*/
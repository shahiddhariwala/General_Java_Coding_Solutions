/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
Input Format
Take N as input.

Constraints
Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 
 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Inverted_Hourglass_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numRows = (2 * num) + 1;

		for (int row = 1, number = num, nsp = numRows - 2, nst = 1; row <= numRows; row++) {
			number = num;
			for (int cst = 1; cst <= nst; cst++) {

				System.out.print(number + " ");

				number--;

			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			number++;
			int nst2 = nst;
			if(row==(numRows/2)+1)
			{
				nst2=nst-1;
				number++;
			}
			for (int cst = 1; cst <= nst2; cst++) {

				System.out.print(number + " ");

				number++;

			}
			if (row <= numRows / 2) {
				nst = nst + 1;
				nsp = nsp - 2;
			} else {
				nst = nst - 1;
				nsp = nsp + 2;
			}

			System.out.println();
		}
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
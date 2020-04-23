/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*TTake as input N, a number. Print the pattern as given in output section for corresponding input.

Input Format
Enter value of N

Constraints
Output Format
All numbers and stars are Space separated

Sample Input
5
Sample Output
1 2 3 4 5
1 2 3 4 * 
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
Explanation
Catch the pattern for the corresponding input and print them accordingly.*/
package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Upside_Down_Numbers_Triangle_and_Star_Pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numRows = sc.nextInt();
		for(int row = 1,nst=0,non=numRows ; row<=numRows;row++)
		{
			for(int num=1;num<=non;num++)
			{
				System.out.print(num+" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("* ");
			}
			nst=(2*row)-1;
			non=non-1;
			System.out.println();
		}

	}

}



/*https://github.com/shahiddhariwala*/
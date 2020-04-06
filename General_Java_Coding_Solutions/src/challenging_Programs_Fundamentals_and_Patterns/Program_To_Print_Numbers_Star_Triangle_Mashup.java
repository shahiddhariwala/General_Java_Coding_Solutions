/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input N, a number. Print the pattern as given in the input and output section.

Input Format
Enter value of N

Constraints
Output Format
Print the pattern.

Sample Input
7
Sample Output
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
Explanation
There is no space between any two numbers. Catch the pattern for corresponding input and print them accordingly.
*/
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Numbers_Star_Triangle_Mashup {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numRows = sc.nextInt();
		for(int row = 1,nst=numRows-1 ; row<=numRows;row++)
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(num);
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			nst=nst-1;
			System.out.println();
		}

	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * 
 * Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
6
Sample Output
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
Explanation
Each number is separated from other by a tab.
 */
package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Pascal_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int passcalArray[][] = new int[num+1][num+1];
		for(int row =1;row<= num;row++)
		{
			
			for(int cst = 1 ; cst <= row;cst++)
			{
				if(cst==row || cst==1)
				{
					passcalArray[row][cst]=1;
				}
				else
				{
					passcalArray[row][cst]=passcalArray[row-1][cst-1]+passcalArray[row-1][cst];
				}
				System.out.print(passcalArray[row][cst]+"\t");
			}
			System.out.println();
		}

	}

}



/*https://github.com/shahiddhariwala*/
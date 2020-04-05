/*
Code by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*IP:  4
0	
1	1	
2	3	5	
8	13	21	34	

 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Print_Fibonacci_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRow =sc.nextInt();
		int fiboArray[] = new int[100];
		fiboArray[0]=0;
		fiboArray[1]=1;
		for (int i = 2; i < fiboArray.length; i++) {
			fiboArray[i] = fiboArray[i-1]+fiboArray[i-2];
		}
		
		int i=0;
		for(int row=1;row<=numRow;row++)
		{
			for(int nst = 1; nst <= row;nst++)
			{
				System.out.print(fiboArray[i]+"\t");
				i++;
			}
			System.out.println();
		}

	}

}



/*https://github.com/shahiddhariwala*/
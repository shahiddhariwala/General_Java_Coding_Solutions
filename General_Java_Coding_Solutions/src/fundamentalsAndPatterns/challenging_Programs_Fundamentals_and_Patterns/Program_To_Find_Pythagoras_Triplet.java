/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Given a number N (denoting one of the legs of the triangle), Prlong its Pythagoras pair in increasing order if they exist. Otherwise, prlong "-1".

Input Format
A single longeger N

Constralongs
N <= 10^9

Output Format
Two numbers X and Y denoting the rest of the numbers of the Pythagorean triplet in increasing order.

Sample Input
3
Sample Output
4 5
 */

package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Find_Pythagoras_Triplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		// (m^2-n^2,2mn,m^2+n^2)
		// given m and n , they form above pythagorean triplet
		// we are given one side of it
		// Observation:
		// 1. m^2+n^2 is largest thats why its our hypotenus
		// 2. 2mn is always even
		// 3. we are always given either 2mn or m^2-n^2
		
		long hypo;
		long leg2;
		if (num % 2 == 0) {
			// even
			// Therefore num = 2mn
			// We can assume m=num/2 and n=1
			hypo = ((num*num)/4 )+ 1;
			leg2 = ((num*num)/4 )- 1;

		} else {
			// odd
			// its odd then m^2-n^2 = num
			// (m-n)*(m+n)=num
			// lets assume (m-n)=num and (m+n) = 1
			// there fore
			// m - n = num
			// m + n = 1
			// Using Method of elimination
			// m = (num+1)/2 && n=(num-1)/2
			hypo =  ((num*num+1)/2);
			leg2 = ((num*num-1)/2);
		}

		// largest number

		if (num == 1 || num ==2 || num ==0) {
			System.out.println(-1);
			System.exit(0);
		}
		System.out.println(leg2 + " " + hypo);
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
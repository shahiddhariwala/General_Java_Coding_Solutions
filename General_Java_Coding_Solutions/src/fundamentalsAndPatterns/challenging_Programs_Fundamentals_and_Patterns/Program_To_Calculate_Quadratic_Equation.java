/*
Coded by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
Given coefficients of a quadratic equation , you need to print the nature of the roots 
(Real and Distinct , Real and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.

Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.

Constraints
-100 <= a, b, c <= 100

Output Format
Output contains one/two lines. First line contains nature of the roots .
The next line contains roots(in non-decreasing order) separated by a space if they exist. 
If roots are imaginary do not print the roots. Output the integer values for the roots.

Sample Input
1 -11 28
Sample Output
Real and Distinct
4 7
Explanation
The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , 
(-b - sqrt(b^2 - 4ac))/2a
 */
package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Calculate_Quadratic_Equation {
/*
 * Quick Info
 * The discriminant, b2 - 4ac, offers valuable information about the
 *  "nature" of the roots of a quadratic equation where a, b and c are rational values. 
 *  It quickly tells you if the equation has two real roots (b2 - 4ac > 0), 
 *  one real repeated root (b2 - 4ac = 0) or two complex conjugate roots (b2 - 4ac < 0). 
 *  If you are trying to determine the "type" of roots of a quadratic equation (not the actual roots themselves),
 *  you need not complete the entire quadratic formula. Simply look at the discriminant.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//1 -11 28
		System.out.printf("Eqaution is : %dx^2 + (%d)x + %d = 0 \n",a,b,c);
		int bb = (int)Math.pow(b, 2);
		int _2a = 2*a;
		int _4ac = 4*a*c;
		
		int discriminant = bb-_4ac;
		//check discriminat to determine the nature of roots
		if(discriminant<0)
		{
			System.out.println("Imaginary");
		}
		else
		{
			int rootPos=(int) ((-b+Math.sqrt(bb-_4ac))/_2a);
			int rootNeg=(int) ((-b-Math.sqrt(bb-_4ac))/_2a);
			
			if(rootPos==rootNeg)
			{
				System.out.println("Real and Equal");
				System.out.println(rootPos+ " "+rootNeg);
			}
			else
			{
				System.out.println("Real and Distinct");
				int max = Math.max(rootNeg, rootPos);
				int min = Math.min(rootNeg,rootPos);
				System.out.println(min+ " "+max);
			}
		}
		
		sc.close();
	}
}

/*https://github.com/shahiddhariwala*/
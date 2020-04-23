/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010

Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
 */

package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Convert_Binary_Decimal {

	public static int getDecimalFromBinary(String binaryString) {
		int pow = 0;
		int num = 0;
		int temp = 0;
		for (int i = binaryString.length()-1; i >= 0; i--) {
			temp = Integer.parseInt(binaryString.charAt(i) + "");
			if (temp == 1) {
				num = num + (int) Math.pow(2, pow);
			}
			pow++;

		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binaryString = sc.nextLine();
		// System.out.println(Integer.parseInt(binaryString,2));
		// :P one line answer
		System.out.println(getDecimalFromBinary(binaryString));
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
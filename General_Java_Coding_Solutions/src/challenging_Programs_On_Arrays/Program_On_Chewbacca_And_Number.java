/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Luke Skywalker gave Chewbacca an integer number x. 
 * Chewbacca isn't good at numbers but he loves inverting digits in them. 
 * Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number
 by inverting some (possibly, zero) digits. The decimal representation of
  the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker 
gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits.
 The number shouldn't contain leading zeroes.

Sample Input
4545
Sample Output
4444
Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit 
is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_On_Chewbacca_And_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numString = sc.nextLine();
		System.out.println(getChewbakaNumber(numString));
	}

	private static long getChewbakaNumber(String numString) {
		char arr[] = numString.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int temp = Integer.parseInt(arr[i] + "");

			if ((9 - temp) < temp) {
				if (i == 0 && temp == 9) {
					// don't do anything
				} else {
					temp = 9 - temp;
				}
			}

			sb.append(temp);
		}
		return Long.parseLong(sb.toString());
	}

}

/* https://github.com/shahiddhariwala */
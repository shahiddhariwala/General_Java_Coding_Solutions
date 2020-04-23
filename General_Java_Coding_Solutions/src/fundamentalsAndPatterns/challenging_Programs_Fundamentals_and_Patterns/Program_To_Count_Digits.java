/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.

Input Format
Integer (A number) Integer (A digit)

Constraints
0 <= N <= 1000000000 0 <= Digit <= 9

Output Format
Integer (count of times digit occurs in the number)

Sample Input
5433231 
3
Sample Output
3
Explanation
The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
 */

package fundamentalsAndPatterns.challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Count_Digits {

	public static int countDigit(int num, int digit) {
		int count = 0;
		while (num > 0) {
			if (num % 10 == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = sc.nextInt();
		System.out.println(countDigit(num, digit));
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
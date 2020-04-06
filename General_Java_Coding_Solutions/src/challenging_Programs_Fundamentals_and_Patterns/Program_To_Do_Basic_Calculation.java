/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Write a program that works as a simple calculator.

1.It reads a character (ch)
2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number.
3.If ch is 'X' or 'x', the program terminates.
4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).


Write code to achieve above functionality.

Input Format
Constraints
0 <= Input integers <= 100000000
( It is assured that the second integer provided for division and modulo operations will not be 0. )

Output Format
Output a single integer output for the operations in a new line each.

Sample Input
* 
1 
2 
/ 
4 
2 
+ 
3 
2 
; 
X
Sample Output
2 
2 
5 
Invalid operation. Try again.
Explanation
Maybe use a do-while.
*/
package challenging_Programs_Fundamentals_and_Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_To_Do_Basic_Calculation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ch;
		do {
			ch = br.readLine();
			int num1;
			int num2;
			switch (ch.charAt(0)) {
			case '+':
				num1 = Integer.parseInt(br.readLine().charAt(0) + "");
				num2 = Integer.parseInt(br.readLine().charAt(0) + "");
				System.out.println(num1 + num2);
				break;
			case '/':
				num1 = Integer.parseInt(br.readLine().charAt(0) + "");
				num2 = Integer.parseInt(br.readLine().charAt(0) + "");
				System.out.println(num1 / num2);
				break;
			case '%':
				num1 = Integer.parseInt(br.readLine().charAt(0) + "");
				num2 = Integer.parseInt(br.readLine().charAt(0) + "");
				System.out.println(num1 % num2);
				break;
			case '*':
				num1 = Integer.parseInt(br.readLine().charAt(0) + "");
				num2 = Integer.parseInt(br.readLine().charAt(0) + "");
				System.out.println(num1 * num2);
				break;
			case '-':
				num1 = Integer.parseInt(br.readLine().charAt(0) + "");
				num2 = Integer.parseInt(br.readLine().charAt(0) + "");
				System.out.println(num1 - num2);
				break;

			default:
				if (ch.charAt(0) == 'x' || ch.charAt(0) == 'X') {
					System.exit(0);
				}
				System.out.println("Invalid operation. Try again.");
				break;

			}

		} while (!ch.equalsIgnoreCase("x"));

	}

}

/* https://github.com/shahiddhariwala */
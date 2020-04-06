/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Take the following as input.

A number
Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.

abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Single line input containing an integer

Constraints
0 < N < 1000000000

Output Format
Print boolean output for each testcase.
"true" if the given number is an Armstrong Number, else print "false".

Sample Input
371
Sample Output
true
Explanation
Use functions. Write a function to get check if the number is armstrong number or not. Numbers are armstrong 
if it is equal to sum of each digit raised to the power of number of digits.
 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Check_If_Number_Is_Armstrong {

	public static boolean checkArmstrong(int num)
	{
		int backup = num;
		int sum=0;
		int digitCount=0;
		while(num>0)
		{
			num=num/10;
			digitCount++;
		}
		num=backup;
		while(num>0)
		{
			int rem = num%10;
			sum = sum + (int)Math.pow(rem, digitCount);
			num=num/10;
			
		}
		return backup==sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkArmstrong(num));

	}

}



/*https://github.com/shahiddhariwala*/
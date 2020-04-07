/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Convert_Anybase_To_Decimal {

	public static int anybaseToDecimal(int num, int base) {
		int counter = 0;
		int rem;
		int decimalNumber = 0;
		while (num > 0) {
			rem = num % 10;
			decimalNumber = decimalNumber + (rem*(int)Math.pow(base, counter));
			counter++;
			num=num/10;
		}
		return decimalNumber;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		System.out.println(anybaseToDecimal(num, base));

	}

}

/* https://github.com/shahiddhariwala */
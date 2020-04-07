/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Convert_Decimal_To_Anybase {

	public static int decimalToAnybase(int num, int base) {
		int multiplier=1;
		int rem;
		int ans = 0;
		while (num > 0) {
			rem = num%base;
			ans = ans+ (rem*multiplier);
			multiplier*=10;
			num=num/base;
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base =sc.nextInt();
		System.out.println(decimalToAnybase(num, base));

	}

}

/* https://github.com/shahiddhariwala */
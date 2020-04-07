/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Convert_Anybase_To_Anybase_Number {

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
		int number = sc.nextInt();
		int numbersBase = sc.nextInt();
		int requiredNumberBase = sc.nextInt();
		int decimalNumber = anybaseToDecimal(number, numbersBase);
		System.out.println(decimalToAnybase(decimalNumber, requiredNumberBase));
	}

}



/*https://github.com/shahiddhariwala*/
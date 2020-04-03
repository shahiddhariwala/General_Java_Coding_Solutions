/*
16	|1998	 = 14
16	|124	 = 12
16	|7	 = 7

HexaDecimal of 1998 is 7ce
HexaDecimal of 1998 using inbuilt method is 7ce



e x 16^0	 = 14
c x 16^1	 = 192
7 x 16^2	 = 1792
Total		   1998

Decimal of 7ce is 1998
Decimal of 7ce using inbuilt method is 1998

 */
package numberSystemAndDataType;

public class Program_To_Convert_Decimal_To_Hexadecimal_And_ViceVersa {

	public static String getHexaDecimal(int num) {
		int rem;
		String str = "";
		while (num > 0) {

			rem = num % 16;
			if (rem > 9) {
				char ch = (char) (97 + rem - 10);
				str = ch + str;
			} else {
				str = rem + str;
			}
			System.out.printf("16\t|%d\t = %d\n", num, rem);
			num = num / 16;
		}
		return str;
	}

	public static int getDecimal(String str) {
		int rem = 0;
		int count = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			int currentNumber;
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'e') {
				currentNumber = 10 + str.charAt(i) -97;
			} else {
				currentNumber = Integer.parseInt(str.charAt(i) + "");
			}
			rem = rem + (currentNumber * (int) Math.pow(16, count));
			System.out.printf("%c x 16^%d\t = %d\n", str.charAt(i), count, currentNumber * (int) Math.pow(16, count));
			count++;
		}
		System.out.println("Total\t\t   " + rem);
		return rem;
	}

	public static void main(String[] args) {

		int dec = 1998;
		String hexaDecimalNumber = "7ce";
		System.out.println("\nHexaDecimal of " + dec + " is " + getHexaDecimal(dec));
		System.out.println("HexaDecimal of " + dec + " using inbuilt method is " + Integer.toHexString(dec));
		System.out.println("\n\n");
		System.out.println("\nDecimal of " + hexaDecimalNumber + " is " + getDecimal(hexaDecimalNumber));
		System.out.println("Decimal of " + hexaDecimalNumber + " using inbuilt method is "
				+ Integer.parseInt(hexaDecimalNumber, 16));

	}

}

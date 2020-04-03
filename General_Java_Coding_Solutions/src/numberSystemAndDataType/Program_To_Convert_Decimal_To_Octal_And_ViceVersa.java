/*
2	|32	 = 0
2	|16	 = 0
2	|8	 = 0
2	|4	 = 0
2	|2	 = 0
2	|1	 = 1

Octal of 32 is 100000
Octal of 32 using inbuilt method is 100000





1 x 2^0	 = 1
1 x 2^1	 = 2
1 x 2^2	 = 4
1 x 2^3	 = 8
1 x 2^4	 = 16
1 x 2^5	 = 32
Total	   63

Decimal of 111111 is 63
Decimal of 111111 using inbuilt method is 63

 */
package numberSystemAndDataType;

public class Program_To_Convert_Decimal_To_Octal_And_ViceVersa {

	public static String getOctal(int num) {
		int rem;
		String str = "";
		while (num > 0) {
			
			rem = num%8;
			str = rem + str;
			System.out.printf("8\t|%d\t = %d\n",num,rem);
			num=num/8;
		}
		return str;
	}
	public static int getDecimal(String str ) {
		int rem=0;
		int count=0;
		for(int i = str.length()-1;i>=0;i--)
		{
			int currentNumber =  Integer.parseInt(str.charAt(i)+"");
			rem = rem + (currentNumber*(int)Math.pow(8, count));
			System.out.printf("%c x 8^%d\t = %d\n",str.charAt(i),count,currentNumber*(int)Math.pow(8, count));
			count++;
		}
		System.out.println("Total\t   "+rem);
		return rem;
	}
	public static void main(String[] args) {

		int dec = 80;
		String OctalNumber = "120";
		System.out.println("\nOctal of " + dec + " is " + getOctal(dec));
		System.out.println("Octal of " + dec + " using inbuilt method is " + Integer.toOctalString(dec));
		System.out.println("\n\n");
		System.out.println("\nDecimal of " + OctalNumber + " is " + getDecimal(OctalNumber));
		System.out.println("Decimal of " + OctalNumber + " using inbuilt method is " + Integer.parseInt(OctalNumber,8));
		
	}

}

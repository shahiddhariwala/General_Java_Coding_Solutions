/*
2	|32	 = 0
2	|16	 = 0
2	|8	 = 0
2	|4	 = 0
2	|2	 = 0
2	|1	 = 1

Binary of 32 is 100000
Binary of 32 using inbuilt method is 100000





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

public class Program_To_Convert_Decimal_To_Binary_And_ViceVersa {

	public static String getBinary(int num) {
		int rem;
		String str = "";
		while (num > 0) {
			
			rem = num%2;
			str = rem + str;
			System.out.printf("2\t|%d\t = %d\n",num,rem);
			num=num/2;
		}
		return str;
	}
	public static int getDecimal(String str ) {
		int rem=0;
		int count=0;
		for(int i = str.length()-1;i>=0;i--)
		{
	
			if(str.charAt(i)=='1')
				rem = rem+ (int)Math.pow(2, count);
			System.out.printf("%c x 2^%d\t = %d\n",str.charAt(i),count,(int)Math.pow(2, count));
			count++;
		}
		System.out.println("Total\t   "+rem);
		return rem;
	}
	public static void main(String[] args) {

		int dec = 32;
		String binaryNumber = "111111";
		System.out.println("\nBinary of " + dec + " is " + getBinary(dec));
		System.out.println("Binary of " + dec + " using inbuilt method is " + Integer.toBinaryString(dec));
		System.out.println("\n\n\n\n");
		System.out.println("\nDecimal of " + binaryNumber + " is " + getDecimal(binaryNumber));
		System.out.println("Decimal of " + binaryNumber + " using inbuilt method is " + Integer.parseInt(binaryNumber,2));
		
	}

}

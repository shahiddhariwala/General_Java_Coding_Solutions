/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Convert_Decimal_To_Octal {

	public static String getOctalNumber(int decimalnumber) {
		
		String ans = "";
		
		int div = decimalnumber;
		int quotient = 0;
		while(div>0)
		{
			quotient=div%8;
			ans = quotient + ans;
			div = div/8;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimalnumber = sc.nextInt();
		//System.out.println(Integer.toOctalString(decimalnumber));
		//One Line :P
		
		System.out.println(getOctalNumber(decimalnumber));
	}

	

}



/*https://github.com/shahiddhariwala*/
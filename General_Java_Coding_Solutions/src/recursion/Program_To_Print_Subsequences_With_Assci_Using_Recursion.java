/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_To_Print_Subsequences_With_Assci_Using_Recursion
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "ab";
		getSubsequencesWithASCII(str,"");
		System.out.println("\n"+((int)Math.pow(3, str.length())));
		sc.close();
//		 b 98 a ab a98 97 97b 9798 
//		 9

	}

	private static void getSubsequencesWithASCII(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.print(output+" ");
			return;
		}
		char ch = input.charAt(0);
		int asc = ch;
		getSubsequencesWithASCII(input.substring(1),output);
		getSubsequencesWithASCII(input.substring(1),output+ch);
		getSubsequencesWithASCII(input.substring(1),output+asc);
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package challenging_Programs_On_Recursion;

public class Program_Replace_All_Pi_In_String
{

	public static void main(String[] args)
	{
		System.out.println(doRecursiveReplace("xpippix"));
		System.out.println(doRecursiveReplace("xpipix"));
		System.out.println(doRecursiveReplace("xpip"));

	}

	private static String doRecursiveReplace(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		if (str.substring(0, 2).equals("pi"))
		{
			String os = "3.14" + doRecursiveReplace(str.substring(2));
			return os;
		}
		else
		{
			String os = str.substring(0, 1) + doRecursiveReplace(str.substring(1));
			return os;
		}
	}

}

/* https://github.com/shahiddhariwala */
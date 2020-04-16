/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursion;

public class Program_to_Print_Subsequences_Using_Recursion
{

	public static int count=0;
	public static void main(String[] args)
	{
		String str = "abc";
		printAllSubsequences(str,"");
		System.out.println("\n"+count);
		/*
		 * _ c b bc a ac ab abc
		 * 8
		 */
	}

	private static void printAllSubsequences(String str, String output)
	{
		if(str.length()==0)
		{
			count++;
			System.out.print(output+" ");
			return;
		}
		char ch = str.charAt(0);
		printAllSubsequences(str.substring(1),output);
		printAllSubsequences(str.substring(1),output+ch);
		
	}

}



/*https://github.com/shahiddhariwala*/
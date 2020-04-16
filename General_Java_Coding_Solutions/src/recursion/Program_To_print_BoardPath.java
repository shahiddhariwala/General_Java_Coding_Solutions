/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package recursion;

public class Program_To_print_BoardPath
{

	
	public static void main(String[] args)
	{
		int N = 10;
		int dice=6;
		int count = justPrintBoardPath(N,"",dice);
		System.out.println("\ncount "+count);
	}

	private static int justPrintBoardPath(int n, String output,int dice)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			System.out.print(output+" ");
			return 1;
		}
		int possiblePathCount=0;
		for (int i = 1; i <= dice; i++)
		{
			possiblePathCount += justPrintBoardPath(n-i,output+i,dice);
			
		}
		return possiblePathCount;
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

public class Program_Find_The_Missing_Two_Numbers
{

	public static void main(String[] args)
	{
		int N = 6;
		int arr[] =
		{ 1, 3, 4, 5 };
		printMissingNumbers(arr,N);
		System.out.println("++++++++\t(^_^)\t++++++++");
		int arr2[]= {1,3,4,6};
		printMissingNumbers(arr2,N);
		
	}

	private static void printMissingNumbers(int[] arr, int N)
	{
		int z = 0;
		for (int i = 0; i < arr.length; i++)
		{
			z = z ^ arr[i];
		}

		for (int i = 1; i <= N; i++)
		{
			z = z ^ i;
		}
		// Z will have the sum of remanining two numbers
		// now we know z is since made up of two numbers each bit will be EXOR of two
		// ith bit

		int group1 = 0;
		
		int group2 = 0;
		
		int setBit = z&~(z-1);
		for (int i = 0; i < arr.length; i++)
		{
			if ((arr[i] & setBit) == setBit)
			{
				// its last bit is set
				group1 = group1 ^ arr[i];
			} else
			{// its last bit is unset
				group2 = group2 ^ arr[i];
			}
		}
		for (int i = 1; i <= N; i++)
		{
			if ((i & setBit) == setBit)
			{
				// its last bit is set
				group1 = group1 ^ i;
			} else
			{
				// its last bit is unset
				group2 = group2 ^ i;
			}
		}
		System.out.println(group1);
		System.out.println(group2);
		
	}

}

/* https://github.com/shahiddhariwala */
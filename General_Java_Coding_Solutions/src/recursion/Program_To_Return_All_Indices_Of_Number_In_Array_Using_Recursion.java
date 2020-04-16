/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

import java.util.Arrays;

public class Program_To_Return_All_Indices_Of_Number_In_Array_Using_Recursion
{

	public static void main(String[] args)
	{

		int arr[] =
		{ 3, 8, 1, 8, 8, 4 };
		int ans[] = getAllIndices(arr, 0, 8, 0);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] getAllIndices(int[] arr, int startIndex, int val, int counter)
	{
		int ans[];
		if ((startIndex == arr.length) && counter == 0)
		{
			// Value not found
			return null;
		}
		if (startIndex == arr.length)
		{
			// if we have reached end, create an array with size of counter
			ans = new int[counter];
			return ans;
		} else
		{
			if (arr[startIndex] == val)
			{
				ans = getAllIndices(arr, startIndex + 1, val, counter + 1);
				ans[counter] = startIndex;
			} else
			{
				ans = getAllIndices(arr, startIndex + 1, val, counter);
			}
		}
		return ans;
	}

}

/* https://github.com/shahiddhariwala */
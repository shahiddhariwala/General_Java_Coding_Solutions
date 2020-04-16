/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

public class Program_To_Find_First_Index_Of_Element_In_Array_Using_Recursion
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 3, 8, 6, 1, 9, 7, 9, 9, 6, 9, 9 };
		int arr2[] =
		{ 1, 2, 3, 44, 5, 6, 7, 8, 4, 4, 4, 6, 7, 8, 9 };
		int arr3[] =
		{ 1, 0 };
		System.out.println(printFirstIndex(arr, 0, 6));
		System.out.println(printFirstIndex(arr2, 0, 4));
		System.out.println(printFirstIndex(arr3, 0, 2));
		/*
		 * 2 8 -1
		 * 
		 */
	}

	private static int printFirstIndex(int[] arr, int i, int val)
	{
		if (i == arr.length)
		{
			// if array reaches end
			return -1;
		}

		if (arr[i] == val)
		{
			return i;
		} else
		{
			// checkNextIndex
			return printFirstIndex(arr, i + 1, val);
		}

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

public class Program_To_Find_Last_Index_Of_Element_In_Array_Using_Recursion
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 3, 8, 6, 1, 9, 7, 9, 9, 6, 9, 9 };
		int arr2[] =
		{ 1, 2, 3, 44, 5, 6, 7, 8, 4, 4, 4, 6, 7, 8, 9 };
		int arr3[] =
		{ 1, 0 };
		System.out.println(printLastIndex(arr, 0, 6));
		System.out.println(printLastIndex(arr2, 0, 4));
		System.out.println(printLastIndex(arr3, 0, 2));
		/*
		 * 8 10 -1
		 */
	}

	private static int printLastIndex(int[] arr, int i, int val)
	{
		if (i == arr.length)
		{
			// if array reaches end
			return -1;
		}
		int checkNext = printLastIndex(arr, i + 1, val);
		if (arr[i] == val)
		{
			return i > checkNext ? i : checkNext;
		} else
		{
			// checkNextIndex
			return checkNext;
		}

	}

}

/* https://github.com/shahiddhariwala */
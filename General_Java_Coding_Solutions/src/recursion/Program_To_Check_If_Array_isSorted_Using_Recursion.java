/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

public class Program_To_Check_If_Array_isSorted_Using_Recursion
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 3, 8, 6, 1, 9, 7 };
		int arr2[] =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr3[] =
		{ 1, 0 };
		System.out.println(isArraySorted(arr, 0));
		System.out.println(isArraySorted(arr2, 0));
		System.out.println(isArraySorted(arr3, 0));
		/*
		 * false true false
		 */
	}

	private static boolean isArraySorted(int[] arr, int i)
	{
		if (i == arr.length - 1)
		{
			// if you have traversed entire and has now only 1 element to check
			// single element is sorted itself
			return true;
		}
		if (arr[i] <= arr[i + 1])
		{
			return isArraySorted(arr, i + 1);
		}
		return false;
	}

}

/* https://github.com/shahiddhariwala */
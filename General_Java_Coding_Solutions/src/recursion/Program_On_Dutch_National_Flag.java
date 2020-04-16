/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursion;

public class Program_On_Dutch_National_Flag
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 1, 1, 0, 2, 1, 0, 2 };
		// Only 0,1,2 are the number in array
		// we have to sort array in O(N) compleixty i.e Linear and in Constant Space
		// Complexity O(1)
		System.out.print("before sorting\t");
		for (Integer i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("after sorting\t");
		doSort(arr);
		for (Integer i : arr)
		{
			System.out.print(i + " ");
		}

	}

	private static void doSort(int[] arr)
	{

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high)
		{
			if (arr[mid] == 0)
			{
				swap(arr, low, mid);
				low++;
				mid++;

			} else if (arr[mid] == 1)
			{
				mid++;
			} else
			{
				swap(arr, mid, high);
				high--;
			}
		}

	}

	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

/* https://github.com/shahiddhariwala */
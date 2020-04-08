/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
Lower bound of 3 is 5
Upper bound of 3 is 7
*/
package functions_1D_2D_Array;

public class Program_To_Find_Lower_Upper_Bound_In_An_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,2,2,2,3,3,3,9,11};
		int numberToFind = 3;
		int lowerIndex = findLowerBound(arr,numberToFind);
		int upperIndex = findUpperBound(arr,numberToFind);
		System.out.println("Lower bound of "+numberToFind+" is "+lowerIndex);
		System.out.println("Upper bound of "+numberToFind+" is "+upperIndex);
	}

	private static int findUpperBound(int[] arr, int itemToFind) {
		int ans=-1;
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi)
		{
			int mid = (lo+hi)/2;
			if(itemToFind<arr[mid])
			{
				hi =mid-1;
			}
			else if(itemToFind>arr[mid])
			{
				lo = mid+1;
			}
			else
			{
				ans= mid;
				lo=mid+1;
			}
		}
		return ans;
	}
	

	private static int findLowerBound(int[] arr, int itemToFind) {
		int ans=-1;
		int lo = 0;
		int hi = arr.length-1;
		while(lo<hi)
		{
			int mid = (lo+hi)/2;
			if(itemToFind<arr[mid])
			{
				hi =mid-1;
			}
			else if(itemToFind>arr[mid])
			{
				lo = mid+1;
			}
			else
			{
				ans= mid;
				hi=mid-1;
			}
		}
		return ans;
	}
	

}



/*https://github.com/shahiddhariwala*/
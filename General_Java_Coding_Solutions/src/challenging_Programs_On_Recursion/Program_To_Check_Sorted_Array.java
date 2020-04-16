/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input N, the size of an integer array. Take one more input, which is a list of N integers separated by a space, and store that in an array. Write a recursive function which prints true if the array is sorted, and false otherwise.

Input Format
N x y z

Constraints
1 < N < 1000
-10^9 < i < 10^9, where i is an element of the array

Output Format
true OR false

Sample Input
5
1 2 3 4 5
Sample Output
true
*/

package challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_To_Check_Sorted_Array
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean result = checkIfSorted(arr,0);
		System.out.println(result);
		sc.close();
	}

	private static boolean checkIfSorted(int[] arr,int index)
	{
		if(index==arr.length-1)
			return true;
		
		if(arr[index]<=arr[index+1])
			return checkIfSorted(arr,index+1);
		return false;
	}

}



/*https://github.com/shahiddhariwala*/
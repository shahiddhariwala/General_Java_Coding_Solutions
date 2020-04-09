/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that selection sorts the array. Print the elements of sorted array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Sort the array using Selection Sort and print that Array.

Input Format
Constraints
N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.

Output Format
Sample Input
4
2
-18
45
30
Sample Output
-18
2
30
45
Explanation
Write selection sort to sort the given integers in the problem.
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Sort_An_Array_Using_Selection_Sort {
	public static void doSelectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(min != i )
			{
				int temp = arr[i];
				arr[i] =arr[min];
				arr[min]=temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 1; i <= numCases; i++) {
			arr[i-1]=sc.nextInt();
		}
		doSelectionSort(arr);
		for(Integer i : arr)
		{
			System.out.println(i);
		}
		sc.close();
	}
}



/*https://github.com/shahiddhariwala*/
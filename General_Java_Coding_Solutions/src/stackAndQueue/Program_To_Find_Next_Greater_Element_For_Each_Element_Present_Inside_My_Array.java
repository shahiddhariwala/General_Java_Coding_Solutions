/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Program_To_Find_Next_Greater_Element_For_Each_Element_Present_Inside_My_Array
{

	public static void main(String[] args)
	{
		// We are given a  array, print the next greater number for every
		// element.
		// If it is not found print -1 for that number.
		// To find the next greater number for element Ai , start from index i + 1 and
		// go uptil the last index
		//We need to do it in O(N) complexity
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		printNextGreaterElements(arr);
		/*
		 * 7
		 * 2 1 4 8 6 7 5
		 * 1,4
		 * 2,4
		 * 4,8
		 * 6,7
		 * 5,-1
		 * 7,-1
		 * 8,-1
		 */
		sc.close();
	}

	private static void printNextGreaterElements(int[] arr)
	{
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			while(!stack.isEmpty() && arr[i]>stack.peek())
			{
				int rv = stack.pop();
				System.out.println(rv+","+arr[i]);
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty())
		{
			int rv = stack.pop();
			System.out.println(rv+","+"-1");
		}
	}

}



/*https://github.com/shahiddhariwala*/
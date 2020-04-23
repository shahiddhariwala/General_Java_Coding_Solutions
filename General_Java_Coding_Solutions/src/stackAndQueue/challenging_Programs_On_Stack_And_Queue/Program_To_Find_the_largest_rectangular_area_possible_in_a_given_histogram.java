/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Find the largest rectangular area possible in a given histogram where the largest rectangle 
 * can be made of a number of contiguous bars.


Input Format
First line contains a single integer N, denoting the number of bars in th histogram.
Next line contains N integers, ith of which, denotes the height of ith bar in the histogram.

Constraints
1<=N<=10^6
Height of each bar in histogram <= 10^9

Output Format
Output a single integer denoting the area of the required rectangle.

Sample Input
5
1 2 3 4 5
Sample Output
9
Explanation
The largest rectangle can be obtained of breadth=3 and length=3. Its starting index is 2 and 
ending index is 4 and it has a height of 3. Hence area = 3*3 = 9
*/
package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_To_Find_the_largest_rectangular_area_possible_in_a_given_histogram
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long arr[] = new long[num];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextLong();
		}
		long ans = findLagestRectangle(arr);
		System.out.println(ans);
		sc.close();

	}

	private static long findLagestRectangle(long[] arr)
	{

		//essence of this is , we caclulate area between two small towers
		//topAreaLocal
		long globalMax = 0;
		long topAreaLocal = 0;
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		while (i < arr.length)
		{
			// If this bar is higher than the bar on top stack, push it to stack
			if (stack.isEmpty() || arr[i] >= arr[stack.peek()])
			{
				stack.push(i++);
			} else
			{

				// If this bar is lower than top of stack, then calculate area of rectangle
				// with stack top as the smallest (or minimum height) bar. 'i' is
				// 'right index' for the top and element before top in stack is 'left index'
				int topi = stack.pop();
				// topi is our smallest curr index

				// Righ index is our current index
				if (stack.isEmpty())
				{
					topAreaLocal = (i) * arr[topi];
				} else
				{
					int lefti = stack.peek();
					// left larger index is just previous index of smalli
					topAreaLocal = (i - lefti - 1) * arr[topi];
				}

				if (topAreaLocal > globalMax)
				{
					globalMax = topAreaLocal;
				}

			}
		}
		// Now pop the remaining bars from stack and calculate area with every
		// popped bar as the smallest bar

		while (!stack.isEmpty())

		{
			int topi = stack.pop();

			if (stack.isEmpty())
			{
				topAreaLocal = (i) * arr[topi];
			} else
			{
				int lefti = stack.peek();
				topAreaLocal = (i - lefti - 1) * arr[topi];
			}

			if (topAreaLocal > globalMax)
			{
				globalMax = topAreaLocal;
			}
		}
		return globalMax;
	}

}

/* https://github.com/shahiddhariwala */
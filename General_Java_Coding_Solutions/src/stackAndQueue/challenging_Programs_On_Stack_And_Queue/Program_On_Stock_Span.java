/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and 
 * we need to calculate span of stock’s price for all N days. You are given an array of length N, where ith 
 * element of array denotes the price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day,
 for which stock's price on these days is less than or equal to that on the ith day.

Input Format
First line contains integer N denoting size of the array.
Next line contains N space separated integers denoting the elements of the array.

Constraints
1 <= N <= 10^6

Output Format
Display the array containing stock span values.

Sample Input
5
30 35 40 38 35
Sample Output
1 2 3 1 1 END
Explanation
For the given case
for day1 stock span =1
for day2 stock span =2 (as 35>30 so both days are included in it)
for day3 stock span =3 (as 40>35 so 2+1=3)
for day4 stock span =1 (as 38<40 so only that day is included)
for day5 stock span =1 (as 35<38 so only that day is included)
hence output is 1 2 3 1 1 END

5
2 1 3 2 3
1 1 3 1 5 END

Input :
6
1 2 3 1 2 4

Output:
1 2 3 1 2 6
*/
package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_On_Stock_Span
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		printStockSpan(arr);
		sc.close();

	}

	private static void printStockSpan(int[] arr)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)      
		{

			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
			{
				// Pop element from stack till new element is greater than stack elements
				stack.pop();
			}

			if (stack.isEmpty())
			{
				// If stack is empty then current element is the greatest so far
				ans[i] = i + 1;
			} else
			{
				// Current element is greater than elements after s.top()
				ans[i] = i - stack.peek();
			}

			stack.push(i);
		}
		for (int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i] + " ");
		}
		System.out.println("END");

	}

}

/* https://github.com/shahiddhariwala */
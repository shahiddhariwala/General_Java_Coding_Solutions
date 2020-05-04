/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
There is a group of MMA fighters standing together in a line.
 Given the value of their strengths, find the strength of the strongest fighter in continuous sub-groups of size k.

Input Format
First line contains an integer N, the number of fighters Followed by N integers 
where i'th integer denotes the strength of i'th fighter. Next line contains the size of sub-group k

Constraints
1<=N<=10^7
1<=k<=N
1 <= Ai <= 100000

Output Format
Space separated integers in a single line denoting strength of strongest fighters in the groups.

Sample Input
5
1 3 1 4 5
3
Sample Output
3 4 5
Explanation
First sub-group: 1 3 1 --> Max strength is 3
Second sub-group: 3 1 4 --> Max strength is 4
Third sub-group: 1 4 5 --> Max strength is 5
*/

package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class FastReader
{
	BufferedReader br;
	StringTokenizer st;

	public FastReader()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next()
	{
		while (st == null || !st.hasMoreElements())
		{
			try
			{
				st = new StringTokenizer(br.readLine());
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt()
	{
		return Integer.parseInt(next());
	}

	long nextLong()
	{
		return Long.parseLong(next());
	}

	double nextDouble()
	{
		return Double.parseDouble(next());
	}

	String nextLine()
	{
		String str = "";
		try
		{
			str = br.readLine();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
}

public class Program_To_Find_Strongest_Fighter_In_Window_Of_K
{
	/*
	 * Brute Force: Run two loops. In the outer loop, take all subarrays of size K.
	 * In the inner loop, get the maximum of the current subarray.
	 * Efficient Approach - (Sliding Window Technique using Deque)
	 * 
	 * We create a Deque, Qi of capacity k, that stores only useful elements of
	 * current window of k elements. An element is useful if it is in current window
	 * and is greater than all other elements on left side of it in current window.
	 * 
	 * We process all array elements one by one and maintain Qi to contain useful
	 * elements of current window and these useful elements are maintained in sorted
	 * order. The element at front of the Qi is the largest and element at rear of
	 * Qi is the smallest of current window.
	 */
	public static void main(String[] args)
	{
		FastReader sc = new FastReader();
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		findStrongestMMAFighter(arr, k);

	}

	private static void findStrongestMMAFighter(int[] arr, int k)
	{
		// Create a Double Ended Queue, Qi that will store indexes of array elements
		// The queue will store indexes of useful elements in every window and it will
		// maintain decreasing order of values from front to rear in Qi, i.e.,
		// arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order

		Deque<Integer> dq = new LinkedList<Integer>();
		// Dequeue first element will be the largest one always
		int i = 0;
		// We have to process first k elements separately
		for (; i < k; i++)
		{
			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
			{
				dq.removeLast();
			}
			dq.addLast(i);

		}
		for (; i < arr.length; i++)
		{

			// First element will always be larger
			System.out.print(arr[dq.peekFirst()] + " ");

			// remove elements which are not in current window
			while (!dq.isEmpty() && dq.peekFirst() <= i - k)
			{
				dq.removeFirst();
			}
			// Remove unwanted elements
			while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()])
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		if (!dq.isEmpty())
			System.out.print(arr[dq.peek()] + " ");

	}

}

/* https://github.com/shahiddhariwala */
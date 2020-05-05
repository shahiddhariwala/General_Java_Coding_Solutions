/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 05-May-2020
*/
/*
 * Given K sorted arrays each with N elements merge them and output the sorted array

Input Format
First line contains 2 space separated integers K and N.
K is number of arrays.
N is number of elements in each array.
Next K lines contain N space separated integers each where ith line denotes the element of ith sorted array.

Constraints
Elements of array <= |10^15|
N <= 10^5
K <= 10

Output Format
Single line consisting of space separated numbers

Sample Input
3 4
1 3 5 7
2 4 6 8
0 9 10 11
Sample Output
0 1 2 3 4 5 6 7 8 9 10 11
Explanation
If we were to combine all the arrays into one and then sort it , the output would be as above.
 */

package heap.challenging_Program_On_Heap;

import java.util.*;

public class Merge_K_Sorted_Arrays
{

	public static void main(String args[])
	{

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();

		int cols = sc.nextInt();

		for (int i = 0; i < rows; i++)

		{

			for (int j = 0; j < cols; j++)

			{

				pq.add(sc.nextInt());

			}

		}

		while (!pq.isEmpty())
		{

			System.out.print(pq.remove() + " ");

		}
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
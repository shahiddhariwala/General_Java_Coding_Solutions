/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 05-May-2020
*/
/*
 * Given an array of n numbers. Your task is to read numbers from the array and keep at-most K numbers at the top (according to their decreasing frequency) every time a new number is read. We basically need to print top k numbers sorted by frequency when input stream has included k distinct elements, else need to print all distinct elements sorted by frequency. If frequency of two numbers are same then print them in increasing order.

Input Format
First line contains integer t as number of test cases. Each test case contains following input. First line contains integer n which represents the length of the array and next line contains n space separated integers.

Constraints
1 < t < 100 1< n < 100000

Output Format
Print top k running stream.

Sample Input
1
5 2
5 1 3 5 2
Sample Output
5 1 5 1 3 5 1 5 1
 */

package heap.challenging_Program_On_Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Top_K_Most_Frequent_Numbers_In_A_Stream
{

	private static class Node implements Comparable<Node>
	{
		int data;
		int frequency;

		Node(int data)
		{
			this.data = data;
			this.frequency = 1;
		}

		@Override
		public int compareTo(Node o)
		{

			if(o.frequency != this.frequency)
				return o.frequency - this.frequency;
			else
				return this.data - o.data;
		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int arr[] = new int[sc.nextInt()];
			int k=sc.nextInt();
			for (int j = 0; j < arr.length; j++)
			{
				arr[j]=sc.nextInt();
			}
			topK(arr,k);
		}
		sc.close();
	}

	public static void topK(int arr[], int k)
	{
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		HashMap<Integer, Node> hm = new HashMap<Integer, Node>();
		for(int i=0;i<arr.length;i++)
		{
			int key = arr[i];
			if(hm.containsKey(key))
			{
				Node oldValue = hm.get(key);
				oldValue.frequency+=1;
				//refresh the maxHeap
				pq.remove(oldValue);
				pq.add(oldValue);
			}
			else
			{
				Node newNode = new Node(key);
				hm.put(key, newNode);
				pq.add(newNode);
			}
			ArrayList<Node> al = new ArrayList<>();
			int count=1;
			while(!pq.isEmpty() && count <=k)
			{
				Node temp = pq.remove();
				System.out.print(temp.data+" ");
				al.add(temp);
				count++;
			}
			pq.addAll(al);
		}
		System.out.println();
	}
}

/* https://github.com/shahiddhariwala */
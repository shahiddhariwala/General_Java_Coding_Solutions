/*
_Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Reverse a Queue using recursion.

Input Format
Enter the size of the queue N and N more number and store in the queue.

Constraints
None

Output Format
Display the values of the reversed queue.

Sample Input
3
1
2
3
Sample Output
3 2 1 END
*/
package challenging_Programs_On_Stack_And_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Program_To_Reverse_A_Queue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int num=sc.nextInt();
		for (int i = 0; i < num; i++)
		{
			q.add(sc.nextInt());
		}
		reverseQueue(q);
		for(Integer i : q)
		{
			System.out.print(i+" ");
		}
		System.out.println("END");
		sc.close();
	}

	private static void reverseQueue(Queue<Integer> q1) 
	{
		if (q1.isEmpty())
		{
			return;
		}
		int item = q1.remove();
		reverseQueue(q1);
		q1.add(item);

	}
}

/* https://github.com/shahiddhariwala */
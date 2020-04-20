/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Program_To_Print_First_Negative_Integer_In_Window_Of_Size_K
{

	public static void main(String[] args)
	{
		int arr[] = {12,-1,-7,8,-15,30,18,28, -1};
		int k=3;
		printFirstNegativeNumbers(arr,k);
		//-1 -1 -7 -15 -15 0 -1

		
		
	}

	private static void printFirstNegativeNumbers(int[] arr, int k)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		int i=0;
		for(;i<k;i++)
		{
			if(arr[i]<0)
				q.add(i);
		}
		for(;i<arr.length;i++)
		{
			if(!q.isEmpty())
			{
				System.out.print(arr[q.peek()]+" ");
				
			}
			else
			{
				System.out.print(0+" ");
			}
			while(!q.isEmpty() && q.peek()<=i-k)
			{
				q.remove();
			}
			if(arr[i]<0)
			{
				q.add(i);
			}
			
		}
		if(!q.isEmpty())
			System.out.println(arr[q.peek()]);
		else
			System.out.println(0);
			
		
	}

}



/*https://github.com/shahiddhariwala*/
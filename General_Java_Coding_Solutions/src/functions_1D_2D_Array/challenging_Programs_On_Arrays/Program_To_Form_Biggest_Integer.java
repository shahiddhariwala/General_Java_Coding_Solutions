/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

Input Format
First line contains integer t which is number of test case.
For each test case, you are given a single integer n in the first line which is the size of array A[] and next line contains n space separated integers denoting the elements of the array A .

Constraints
1<=t<=100
1<=m<=100
1<=A[i]<=10^5

Output Format
Print the largest value.

Sample Input
1
4
54 546 548 60
Sample Output
6054854654
Explanation
Upon rearranging the elements of the array , 6054854654 is the largest possible number that can be generated.
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program_To_Form_Biggest_Integer
{

	public static void main(String[] args)
	{
		Comparator<String> comprator = new Comparator<String>()
		{

			@Override
			public int compare(String o1, String o2)
			{

				int ans = (o2 + o1).compareTo(o1 + o2);

				System.out.println("o1 " + o1 + "\to2 " + o2 + " comparison " + ans);
				return ans;
			}

		};
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			int num = sc.nextInt();
			ArrayList<String> numbers = new ArrayList<String>();
			for (int j = 0; j < num; j++)
			{
				numbers.add(sc.nextInt() + "");
			}
			numbers.sort(comprator);
			Collections.sort(numbers, comprator);
			numbers.forEach(System.out::print);
			System.out.println();
		}

		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
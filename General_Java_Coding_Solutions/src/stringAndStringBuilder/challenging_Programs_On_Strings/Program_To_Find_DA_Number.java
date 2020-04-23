/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Shahid and Salmanare having a discussion on a new type of number that they call Dhariwala Academy Number or DA Number.
They use following criteria to define a DA Number.

1. 0 and 1 are not a DA number.
2. 2,3,5,7,11,13,17,19,23,29 are DA numbers.
3. Any number not divisible by the numbers in point 2( Given above) are also DA numbers.
Shahids aid he loved DA numbers.Hearing it, Salman throws a challenge to him.

Salman will give Shahida string of digits. Shahid's task is to find the number of DA numbers in the string.

DA number once detected should not be sub-string or super-string of any other DA number.
Ex- In 4991, both 499 and 991 are DA numbers but you can choose either 499 or 991, not both.

Further, the DA number formed can only be a sub-string of the string.
Ex - In 481, you can not take 41 as DA number because 41 is not a sub-string of 481.

As there can be multiple solutions, Salman asks Shahidto find the maximum number of DA numbers that can be formed 
from the given string.

Shahid has to take class of Launchpad students. Help him by solving Gautam's challenge.

Input Format
First line contain size of the string.

Next line is A string of digits.

Constraints
1 <= Length of strings of digits <= 17

Output Format
Maximum number of DA numbers that can be formed.

Sample Input
5
81615
Sample Output
2
Explanation
61 and 5 are two DA numbers.
*/

package stringAndStringBuilder.challenging_Programs_On_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_To_Find_DA_Number
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		boolean[] visited = new boolean[num];
		int count = 0;
		for (int len = 1; len <= str.length(); len++)
		{

			for (int si = 0; si <= str.length() - len; si++)
			{

				int ei = si + len;

				String ss = str.substring(si, ei);
				System.out.println(ss);
				if (isDANumber(Long.valueOf(ss)) && isValid(visited, si, ei))
				{

					count++;
					System.out.println("DA =>"+ss);
					for (int i = si; i < ei; i++)
					{
						visited[i] = true;
					}

				}
			}

		}

		System.out.println(count);

	}

	public static boolean isValid(boolean[] visited, int start, int end)
	{
		//for checking DA number once detected should not be sub-string or super-string of any other DA number.
		// Ex- In 4991, both 499 and 991 are DA numbers but you can choose either 499 or 991, not both.
		for (int i = start; i < end; i++)
		{
			if (visited[i])
			{
				return false;
			}
		}

		return true;
	}

	public static boolean isDANumber(long n)
	{

		if (n == 0 || n == 1)
		{
			return false;
		}

		long[] arr =
		{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < arr.length; i++)
		{
			if (n == arr[i])
			{
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			if (n % arr[i] == 0)
			{
				return false;
			}
		}

		return true;
	}

}

/* https://github.com/shahiddhariwala */
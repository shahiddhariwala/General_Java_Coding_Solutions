/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 06-May-2020
*/
/*
 * Given an array find the number which comes with maximum frequency. It must work in O(n) time complexity.

Input Format
Enter the size of the array N and add N more numbers and store in an array

Constraints
1 <= N <= 10^7

Output Format
Display the number with the maximum frequency.

Sample Input
5
1 2 2 2 3
Sample Output
2
Explanation
2 has the highest frequency in the array i.e. 3.
 */

package hashMap.challenging_Program_on_Hashing_And_Tries;

import java.util.*;

public class Highest_Frequency
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HashMap<Integer, Integer> hs = new HashMap<>();
		int maxCount = 0;
		int maxNum = 0;
		for (int i = 0; i < num; i++)
		{
			int temp = sc.nextInt();
			if (hs.containsKey(temp))
			{
				int ov = 1 + hs.get(temp);
				hs.put(temp, ov);
				if (ov > maxCount)
				{
					maxCount = ov;
					maxNum = temp;
				}
			} else
			{
				hs.put(temp, 1);
			}
		}
		System.out.println(maxNum);
	}
}

/* https://github.com/shahiddhariwala */
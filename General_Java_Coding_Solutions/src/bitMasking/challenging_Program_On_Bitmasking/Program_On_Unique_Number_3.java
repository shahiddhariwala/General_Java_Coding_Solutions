/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 We are given an array containg n numbers. 
 All the numbers are present thrice except for one number which is only present once.
 Find the unique number. Only use - bitwise operators, and no extra space.

Input Format
First line contains the number n. Second line contains n space separated number.

Constraints
N < 10^5

Output Format
Output a single line containing the unique number

Sample Input
7
1 1 1 2 2 2 3
Sample Output
3
Explanation
3 is present only once
*/
package bitMasking.challenging_Program_On_Bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class Program_On_Unique_Number_3
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
		findUniqueNumber(arr);
		sc.close();
	}

	private static void findUniqueNumber(int[] arr)
	{
		int countArray[] = new int[64];
		for (int i = 0; i < arr.length; i++)
		{
			// Extract Bits of Every Nummber and upate the count Array
			int k = 0;
			int currentNumber = arr[i];
			while (currentNumber != 0)
			{
				countArray[k] = countArray[k] + (currentNumber & 1);
				k++;
				currentNumber = currentNumber >> 1;
			}
		}
		//System.out.println(Arrays.toString(countArray));
		//Now take moduler 3 as each bits will be updated and will be of order 3n but unqiue wil have 3n+1 
		int power=1;
		int answer=0;
		for (int i = 0; i < countArray.length; i++)
		{
			countArray[i] = countArray[i]%3;
			answer = answer + (countArray[i]*power);
			power = power<<1;
					
		}
		System.out.println(answer);
	}
}

/* https://github.com/shahiddhariwala */
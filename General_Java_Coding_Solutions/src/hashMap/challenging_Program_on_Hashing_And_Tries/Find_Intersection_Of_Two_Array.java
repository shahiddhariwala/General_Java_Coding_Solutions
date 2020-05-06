/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 06-May-2020
*/

/*
 * Take as input N, the size of array. Take N more inputs and store that in an array. Take N more inputs and store that in another array. Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.

Input Format
First line contains N denoting the size of the two arrays. Second line contains N space separated integers denoting the elements of the first array. Third line contains N space separated integers denoting the elements of the second array.

Constraints
Length of Arrays should be between 1 to 100000.

Output Format
Display the repeating elements in a comma separated manner enclosed in square brackets. The numbers should be sorted in increasing order.

Sample Input
7
1 2 3 1 2 4 1
2 1 3 1 5 2 2
Sample Output
[1, 1, 2, 2, 3]
Explanation
Check which integer is present in both the arrays and add them in an array .Print this array as the ans.

 */
package hashMap.challenging_Program_on_Hashing_And_Tries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class Find_Intersection_Of_Two_Array
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for (int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		ArrayList<Integer> arrIntersection = findIntersection(arr1, arr2);
		Collections.sort(arrIntersection);
		System.out.println(arrIntersection);
		sc.close();
	}

	private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int val : arr1)
		{
			hm.put(val, hm.getOrDefault(val, 0)+1);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int val : arr2)
		{
			if (hm.containsKey(val))
			{
				int ov = hm.get(val);
				list.add(val);
				if((ov-1)==0)
				{
					hm.remove(val);
				}
				else
				{
					hm.put(val,ov-1);
				}
			}
		}

		return list;
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 06-May-2020
*/

/*
 * Mike loves hashing. He decides to create his own hashing technique, so he creates a Hash Function, given as :


int* hash_array(int A[], int n)
{
    int* hash = new int[MAX]; //MAX is the maximum possible value of A[i]
    for(int i=0;i<=MAX;i++) hash[i]=-1; //initialize hash to -1.
    int count = 0;
    for(int i=0;i<n;i++) // Loop through elements of array
    {
        if(hash[A[i]] == -1) // A[i] was not assigned any hash before
        {
            hash[A[i]] = count; // Assigning hash to A[i]
            count++;
            continue;
        }
        for(int j = 0;j<i;j++)
        {
            if(hash[A[j]] > hash[A[i]]) // All the hashes greater than previous hash of A[i] are decremented.
                hash[A[j]]--;
        }
        hash[A[i]] = count - 1; // Assigning a new hash to A[i]
    }
    return hash;
}

You are given an array A. You have to find the Mike's hashes for all the values that appears in this array.

Input Format
First line contains a single integer n. Next line contains n integers, denoting the elements of array, A.

Constraints
1<=N<=10^5 1<=A[i]<=10^9

Output Format
Print k lines, where k is the number of distinct integers in A. ith line contains integer whose hash value is (i-1).

Sample Input
4
1 2 1 3
Sample Output
2
1
3
Explanation
First iteration : hash[1] = 0. Second iteration : hash[2] = 0 + 1. Third iteration : hash[2] = hash[2] - 1 = 0, hash[1] = 1. Fourth iteration : hash[3] = 1 + 1 = 2.
 */
package hashMap.challenging_Program_on_Hashing_And_Tries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

public class Mike_and_HashTrick
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			if (!map.containsKey(arr[i]))
			{
				map.put(arr[i], i);
				res.add(arr[i]);
			}

			else
			{
				map.put(arr[i], i);
			}

		}

		HashMap<Integer, Integer> ans = sortByValue(map);

		for (int val : ans.keySet())
		{
			System.out.println(val);
		}

	}

	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
		{
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
}

/* https://github.com/shahiddhariwala */
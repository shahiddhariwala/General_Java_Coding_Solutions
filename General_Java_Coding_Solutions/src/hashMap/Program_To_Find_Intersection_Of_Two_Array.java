/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_To_Find_Intersection_Of_Two_Array
{

	public static void main(String[] args)
	{
		int arr1[] =
		{ 5, 1, 3, 4, 7 };
		int arr2[] =
		{ 2, 4, 3, 5, 7, 10, 15 };
		ArrayList<Integer> arrIntersection = findIntersection(arr1, arr2);
		for (Integer a : arrIntersection)
		{
			System.out.println(a);
		}
		/*
		 * 3
		 * 4
		 * 5
		 * 7
		 */
	}

	private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2)
	{
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		for (int val : arr1)
		{
			hm.put(val, false);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int val : arr2)
		{
			if (hm.containsKey(val))
			{
				hm.put(val, true);
			}
		}

		Set<Map.Entry<Integer, Boolean>> entries = hm.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entries)
		{
			if (entry.getValue())
			{
				list.add(entry.getKey());
			}
		}
		return list;
	}

}

/* https://github.com/shahiddhariwala */
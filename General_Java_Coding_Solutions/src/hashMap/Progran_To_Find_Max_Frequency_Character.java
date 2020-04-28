/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Progran_To_Find_Max_Frequency_Character
{

	public static void main(String[] args)
	{
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreqCharacter(str));
	}

	private static char getMaxFreqCharacter(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : str.toCharArray())
		{
			if (hm.containsKey(c))
			{
				int prevVal = hm.get(c);
				hm.put(c, prevVal + 1);
			} else
			{
				hm.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		char maxChar = '0';
		int maxVal = 0;
		for (Map.Entry<Character, Integer> entry : entries)
		{
			if (entry.getValue() > maxVal)
			{
				maxVal = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		return maxChar;
	}

}

/* https://github.com/shahiddhariwala */
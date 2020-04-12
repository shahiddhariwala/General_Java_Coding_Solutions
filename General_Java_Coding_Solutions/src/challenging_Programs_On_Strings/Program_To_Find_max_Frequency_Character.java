/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
*/
package challenging_Programs_On_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_To_Find_max_Frequency_Character
{

	public static void main(String[] args)
	{
		//This program can run on anytype of string try it :P
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				int val = hm.get(str.charAt(i));
				hm.replace(str.charAt(i), val,val+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		int max =Integer.MIN_VALUE;
		Character maxKey=' ';
		for (Map.Entry<Character,Integer> entry : hm.entrySet())
		{
			if(entry.getValue() > max)
			{
				max=entry.getValue();
				maxKey=entry.getKey();
			}
		}
		
		System.out.println(maxKey);
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
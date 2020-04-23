/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
We are given a hashmap which maps all the letters with number. Given 1 is mapped with A, 2 is mapped with B…..26 is mapped with Z. Given a number, you have to print all the possible strings.

Input Format
A single line contains a number.

Constraints
Number is less than 10^6

Output Format
Print all the possible strings in sorted order in different lines.

Sample Input
123
Sample Output
ABC
AW
LC
Explanation
'1' '2' '3' = ABC
'1' '23' = AW
'12' '3' = LC
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program_On_Mapped_Strings
{/*
	 * To Solve any Problem related to Recursion All you need to do is Break the
	 * Problem into 3 important components which are as follows :-
	 * 1.Bigger Problem : The original Problem statement is your bigger problem.
	 * 2.Smaller Problem: In every recursive prblm there exist a prblm statement
	 * which you need to achieve in order to fullfill the prblm statement but by
	 * considering such a smaller prblm from the bigger prblm is needed which we
	 * need to assume that the recursion will work and will give the answer.
	 * 3.Self Work: The amount of work which one should do in order to make the
	 * smaller problem your problem.
	 * 
	 * For e.g.., In order to find the max of any array, three components will be :-
	 * Bigger Problem : To find the max in whole array viz find max in array from
	 * index 0 to n - 1.
	 * 
	 * Smaller Problem: Assume that the recursion works and will find the max of
	 * array from index 1 to n - 1.
	 * 
	 * Self Work : In order to make your smaller prblm your bigger prblm all you
	 * need to do is to compare the ans return by assuming the smaller prblm works
	 * with the 0th index element and return the max among both of them.
	 * Approach Discussion
	 * 
	 * Bigger Problem : To Print all of the possible mapped String of given number.
	 * Smaller Problem : Assume the recursion works and will give you ans for just
	 * after the first digit.
	 * 
	 * Self Work : In order to make you smaller prblm your problem all you need to
	 * work for the 0th index element. Because it could be the part included in the
	 * answer or not. So first number could be mapped as it is or can be mapped by
	 * including just the next digit with. For e.g.., 123 either first digit will be
	 * mapped as '1' or as '12' but not for '123'
	 * 
	 * Note : Do handle that the number should be smaller than 26 as for two digit
	 * number could be like 321 so your recursion will take either 3 or 32 but 32 is
	 * not valid.
	 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> al = printMappedStrings(str);
		Collections.sort(al);
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		sc.close();

	}

	private static ArrayList<String> printMappedStrings(String str)
	{
		if (str.length() == 0)
		{
			ArrayList<String> baseList = new ArrayList<String>();
			baseList.add("");
			return baseList;
		}
		//myResult 
		ArrayList<String> myResult = new ArrayList<String>();
		//for single digit
		int ch = Integer.parseInt(str.charAt(0) + "");
		char chAlpha = (char) ('A' + ch - 1);
		ArrayList<String> recursionResult1Char = printMappedStrings(str.substring(1));
		//get Recursion Result and add our single digits alphabet to it
		for (String s : recursionResult1Char)
		{
			//chAlpha is our single digit alphabet
			myResult.add(chAlpha + s);
		}
		//if String length is of 2 digit or more
		if (str.length() >= 2)
		{
			//get frsit 2 digit
			int str2 = Integer.parseInt(str.substring(0, 2));
			// check if double digits belong in our alphabets range i.e 1 to 26 A to Z
			if (str2 >= 1 && str2 <= 26)
			{
				//if they belong get our Alphabet in ch2
				char ch2 = (char) ('A' + str2 - 1);
				//we have taken first 2 digit of our string , so get result for remanining substring
				ArrayList<String> recursionResult2Char = printMappedStrings(str.substring(2));
				//after getting result from remanining string we just have to add our double digit alphabet to it
				for (String s : recursionResult2Char)
				{
					myResult.add(ch2 + s);
				}
			}
		}

		return myResult;
	}

}

/* https://github.com/shahiddhariwala */
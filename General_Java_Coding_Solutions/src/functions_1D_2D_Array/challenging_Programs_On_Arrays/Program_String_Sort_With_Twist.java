/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * Nishant is a very naughty boy in Launchpad Batch. One day he was playing with strings, a
 * nd randomly shuffled them all. Your task is to help Nishant Sort all the strings 
 * ( lexicographically ) but if a string is present completely as a prefix in another string, t
 * hen string with longer length should come first. Eg bat, batman are 2 strings and the string
 *  bat is present as a prefix in Batman - then sorted order should have - Batman, bat.

Input Format
N(integer) followed by N strings.

Constraints
N<=1000

Output Format
N lines each containing one string.

Sample Input
3
bat
apple
batman
Sample Output
apple
batman
bat
Explanation
In mathematics, the lexicographic or lexicographical order (also known as lexical order, 
dictionary order, alphabetical order or lexicographic(al) product) is a generalization of 
the way words are alphabetically ordered based on the alphabetical order of their component letters.

 */
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_String_Sort_With_Twist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();sc.nextLine();
		String arr[] = new String[numCases];
		for (int i = 0; i < numCases; i++) {

			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].contains(arr[j]) || arr[j].contains(arr[i]))
				{
					if(arr[i].compareTo(arr[j])<0)
					{
						String temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(String s : arr)
		{
			System.out.println(s);
		}
		sc.close();

		// System.out.println("a".compareTo("aba")); //op -1 so if a < b ==> -1
	}

}

/* https://github.com/shahiddhariwala */
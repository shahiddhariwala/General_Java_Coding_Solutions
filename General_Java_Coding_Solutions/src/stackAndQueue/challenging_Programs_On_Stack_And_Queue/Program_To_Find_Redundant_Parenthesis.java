/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 You are given an balanced expression. 
 You have to find if it contains duplicate parentheses or not. 
 A set of parentheses are duplicate if same subexpression is surrounded by multiple parenthesis.

Input Format
First line contains integer t as number of test cases.
Next t lines contains one balanced expression each.

Constraints
1 < t < 100
1< expression < 100

Output Format
Print "Duplicate" if the expression has any redundancy. Else print "Not Duplicates".

Sample Input
2
(((a+(b))+(c+d)))
((a+(b))+(c+d))
Sample Output
Duplicate
Not Duplicates
Explanation
For 1st test case : The subexpression "a+(b)" is surrounded by two pairs of brackets.
*/
package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_To_Find_Redundant_Parenthesis
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();sc.nextLine();
		for (int i = 1; i <= numCases; i++)
		{
			String str = sc.nextLine();
			boolean ans = balancedParenthesis(str);
			if (ans)
				System.out.println("Duplicate");
			else
				System.out.println("Not Duplicates");
		}
		sc.close();
	}

	/*
	 * Sample Input
	 * 2
	 * (((a+(b))+(c+d)))
	 * ((a+(b))+(c+d))
	 * 
	 * Sample Output
	 * Duplicate
	 * Not Duplicates
	 * 
	 * You just have to check here that if there are unnecessary parenthesis or not.
	 * In the 1st case (((a+(b))+(c+d))) you can observe that the first parenthesis
	 * pair is not necessary(this expression could be represented by ((a+(b))+(c+d))
	 * ) hence you have to print Duplicate.
	 * In case 2 there is no unnecessary parenthesis so you print Not Duplicates
	 * This problem is somewhat similar to the valid parenthesis problem using
	 * stack.
	 * 
	 * The idea is to use stack. Iterate through the given expression and for each
	 * character in the expression, if the character is a open parenthesis ‘(‘ or
	 * any of the operators or operands, push it to the top of the stack. If the
	 * character is close parenthesis ‘)’, then pop characters from the stack till
	 * matching open parenthesis ‘(‘ is found and a counter is used, whose value is
	 * incremented for every character encountered till the opening parenthesis ‘(‘
	 * is found. If the number of characters encountered between the opening and
	 * closing parenthesis pair, which is equal to the value of the counter, is less
	 * than or equal to 1, then a pair of duplicate parenthesis is found else there
	 * is no occurrence of redundant parenthesis pairs. For example, (((a+b))+c) has
	 * duplicate brackets around “a+b”. When the second “)” after a+b is
	 * encountered, the stack contains “((“. Since the top of stack is a opening
	 * bracket, it can be concluded that there are duplicate brackets.
	 * 
	 * 
	 * 
	 */
	private static boolean balancedParenthesis(String str)
	{
		Stack<Character> s = new Stack<>();
		boolean flag = false;
		int counter = 0;
		for (int i = 0; i < str.length(); i++)
		{

			char ch = str.charAt(i);
			if (ch != ')')
			{
				s.push(ch);
			} else if (str.charAt(i) == ')')
			{
				if (!s.isEmpty())
				{
					counter = 0;
					while (!s.isEmpty() && s.peek() != '(')
					{
						s.pop();
						counter++;
					}
					s.pop();
					if (counter == 0)
					{
						return true;
					}
				}
			}
		}
		return flag;
	}

}

/* https://github.com/shahiddhariwala */
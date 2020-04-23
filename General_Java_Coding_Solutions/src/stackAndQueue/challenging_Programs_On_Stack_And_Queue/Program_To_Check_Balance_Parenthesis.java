/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

Input Format
A string of '(' , ')' , '{' , '}' and '[' , ']' .

Constraints
1<=|S|<=10^5

Output Format
Print "Yes" if the brackets are balanced and "No" if not balanced.

Sample Input
(())
Sample Output
Yes
Explanation
(()) is a balanced string.
 */
package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_To_Check_Balance_Parenthesis
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean ans = balancedParenthesis(str);
		if (ans)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
		/*
		 * Question is pretty simple just keep the track of corresponding open and
		 * closed brackets.
		 * 
		 * Algo
		 * Each time you encounter an open bracket simply push it into stack.
		 * 
		 * If you got any closed bracket.
		 * 2.1 If the stack is empty return false.
		 * 2.2 Check if the closed bracket matches the peek element of stack.
		 * 
		 * 2.3.1 If yes pop the element and continue.
		 * 2.3.2 else return false.
		 * At the end return true if stack is empty.
		 */
	}

	static boolean balancedParenthesis(String str)
	{
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[')
			{
				s.push(c);
			} else if (c == ')')
			{
				if (s.empty() || s.peek() != '(')
				{
					return false;
				}
				s.pop();
			} else if (c == '}')
			{
				if (s.empty() || s.peek() != '{')
				{
					return false;
				}
				s.pop();
			} else if (c == ']')
			{
				if (s.empty() || s.peek() != '[')
				{
					return false;
				}
				s.pop();
			}
		}
		return s.empty();
	}
}

/* https://github.com/shahiddhariwala */
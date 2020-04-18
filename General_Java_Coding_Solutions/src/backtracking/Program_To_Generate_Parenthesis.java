/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.

Input Format
Single line containing an integral value 'n'.

Constraints
1<=n<=11

Output Format
Print the balanced parentheses strings with every possible solution on new line.

Sample Input
2
Sample Output
()() 
(()) 
*/
package backtracking;
import java.util.Scanner;
import java.util.Stack;

public class Program_To_Generate_Parenthesis
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numBalance = sc.nextInt();
		printBalancesParenthesisStrings(numBalance, "", 0, 0, numBalance);
		sc.close();

	}

	/*
	 * Algorithm:
	 * 
	 * Keep track of counts of open and close brackets.
	 * 
	 * Initialize these counts as 0.
	 * 
	 * Recursively call the generateParenthesis() function until open bracket count
	 * is less than the given n.
	 * 
	 * If open bracket count becomes more than the close bracket count, then put a
	 * closing bracket and recursively call for the remaining brackets.
	 * 
	 * If open bracket count is less than n, then put an opening bracket and call
	 * _printParenthesis() for the remaining brackets.
	 */
	private static void printBalancesParenthesisStrings(int numBalance, String output, int closeCount, int openCOunt,
			int limit)
	{
		if (numBalance == 0)
		{
			System.out.println(output);

			return;
		}
		if (closeCount < openCOunt && openCOunt != 0)
		{
			// close the bracket
			printBalancesParenthesisStrings(numBalance - 1, output + ')', closeCount + 1, openCOunt, limit);
		}
		if (openCOunt < limit)
			printBalancesParenthesisStrings(numBalance, output + '(', closeCount, openCOunt + 1, limit);

	}

	private static boolean checkBalance(String output)
	{
		Stack<Character> stak = new Stack<Character>();
		for (int i = 0; i < output.length(); i++)
		{
			if (output.charAt(i) == '(')
			{
				stak.push('(');
			} else
			{
				if (!stak.isEmpty())
				{
					stak.pop();
				} else
				{
					return false;
				}
			}
		}
		if (stak.isEmpty())
			return true;
		return false;
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Shahid sir loves coding. Hence, he took up position of an instructor and founded Dhariwala Academy, a startup that serves students with awesome code modules. It is a very famous place and students are always queuing up to have one of those modules. Each module has a cost associated with it. The modules are kept as a pile. The job of an instructor is very difficult. He needs to handle two types of queries:

1) Student Query: When a student demands a module, the code module on the top of the pile is given and the student is charged according to the cost of the module. This reduces the height of the pile by 1. In case the pile is empty, the student goes away empty-handed.

2) Instructor Query: Sir prepares a code module and adds it on top of the pile. And reports the cost of the module. Help him manage this process.

Input Format
First line contains an integer Q, the number of queries. Q lines follow. A Type-1 ( Student ) Query, is indicated by a single integer 1 in the line. A Type-2 ( Instructor ) Query, is indicated by two space separated integers 2 and C (cost of the module prepared) .

Constraints
Q < 10^5

Output Format
For each Type-1 Query, output the price that student has to pay i.e. cost of the module given to the customer in a new line. If the pile is empty, print "No Code" (without the quotes).

Sample Input
7
2 73
2 83
2 43
1
1
2 16
2 48
Sample Output
43
83
Explanation
Iteration 1 :
Input : 2 73
Stack : 73 <- Top

Iteration 2 :
Input : 2 83
Stack : 73, 83 <- Top

Iteration 3 :
Input : 2 43
Stack : 73, 83,43 <- Top

Iteration 4 :
Input : 1
Print and pop 43
Stack : 73, 83 <- Top

Iteration 5 :
Input : 1
Print and pop 83
Stack : 73 <- Top

Iteration 6 :
Input : 2 16
Stack : 73, 16 <- Top

Iteration 7 :
Input : 2 48
Stack : 73, 16, 48 <- Top
*/
package stackAndQueue.challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_On_Shahid_Sir_And_Coding
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int numQ = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < numQ; i++)
		{
			int QueryType = sc.nextInt();
			if (QueryType == 1)
			{
				if (stack.isEmpty())
				{
					System.out.println("No Code");
				} else
				{
					System.out.println(stack.pop());
				}
			} else
			{
				int cost = sc.nextInt();
				stack.push(cost);
			}
		}
		sc.close();
	}

}

/* https://github.com/shahiddhariwala */
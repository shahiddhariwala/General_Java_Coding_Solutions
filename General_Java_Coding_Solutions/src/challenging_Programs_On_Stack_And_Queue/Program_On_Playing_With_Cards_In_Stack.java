/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are at a casino. There are N stacked cards on pile .
 *  Each card has a number written on it. Then there will be Q iterations. 
 *  In ith iteration, you start picking up the cards in Ai-1th pile from the top one by one and check whether the number written
 *  on the card is divisible by the ith prime number. If the number is divisible, you stack that card on pile Bi. 
 *  Otherwise, you stack that card on pile Ai. After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ .
 *  Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .

Input Format
First line contains N and Q. The next line contains N space separated integers representing the initial pile of cards i.e., A0.
 The leftmost value represents the bottom plate of the pile.

Constraints
N < 10^5

Output Format
Output N lines, each line containing the number written on the card.

Sample Input
5 1
3 4 7 6 5
Sample Output
4
6
3
7
5
Explanation
Initially:

A0 = [3, 4, 7, 6, 5]<-TOP

After 1st iteration:

A0 = []<-TOP

A1 = [5, 7, 3]<-TOP

B1 = [6, 4]<-TOP

Now first print B1 from top to bottom then A1 from top to bottom.


Sample Test Case:
20 21
80 37 86 79 8 39 43 41 15 33 30 15 45 55 61 74 49 49 20 66
Correct Answer:
80
86
8
30
74
20
66
45
15
33
15
39
55
49
49
37
41
43
61
79

*/
package challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_On_Playing_With_Cards_In_Stack
{

	public static int primesCheck[] = new int[1000005];
	public static int seqPrimes[] = new int[1000005];

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numQ = sc.nextInt();

		Stack<Integer> A0 = new Stack<Integer>();
		for (int i = 0; i < num; i++)
		{
			A0.add(sc.nextInt());
		}
		calculatePrimes();
		goPlayWithCards(A0, numQ);

		sc.close();

	}

	private static void calculatePrimes()
	{
		primesCheck[0] = 0;
		primesCheck[1] = 0;
		primesCheck[2] = -1;
		for (int i = 3; i < 1000005; i += 2)
		{
			// Marking all odd as primes
			primesCheck[i] = -1;
		}

		for (int i = 3; i * i < 1000005; i += 2)
		{
			if (primesCheck[i] == -1)
			{
				for (int j = i * i; j < 1000005; j += i)
				{
					primesCheck[j] = 0;
				}
			}
		}

		int k = 0;
		for (int i = 0; i < 1000005; i++)
		{
			if (primesCheck[i] == -1)
			{
				++k;
				seqPrimes[k] = i;

			}
		}

	}

	private static void goPlayWithCards(Stack<Integer> A0, int numQ)
	{

		Stack<Integer> A1 = new Stack<Integer>();
		Stack<Integer> B0 = new Stack<Integer>();
		for (int i = 1; i <= numQ; i++)
		{
			int currIthPrime = seqPrimes[i];
			while (!A0.isEmpty())
			{
				int pop = A0.pop();
				if (pop % currIthPrime == 0)
				{
					B0.add(pop);
				} 
				else
				{
					A1.add(pop);
				}
			}
			while (!B0.isEmpty())
			{
				System.out.println(B0.pop());
			}
			//Copy the data into A0 and clear the A1
			A0 = (Stack<Integer>) A1.clone();
			A1.clear();
		}
		while (!A0.isEmpty())
		{
			System.out.println(A0.pop());
		}
	}

}

/* https://github.com/shahiddhariwala */
/*
Coded by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Shahid recently graduated from college. To celebrate, he went to a candy shop and bought all the candies. The total cost was a number upto which there are n prime numbers (starting from 2). Since Shahid wants to minimize his cost, he calls you to help him find the minimum amount that needs to be paid. Being a student of Shahid bhaiya it is now your job to help him out :)

Input Format
First line contains a single integer denoting the number of test cases T. Next T lines contains a single integer N, denoting the number of primes required.

Constraints
T <= 10000

It is guaranteed that the answer does not exceed 10^6.

Output Format
Print the minimum cost that needs to be paid.

Sample Input
2
5
1
Sample Output
11
2
Explanation
In the first case there are 5 primes upto 11(2,3,5,7,11).
 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Prime_Numbers_Shahid_Loves_Candy {
	/*
	 * Quick Tip : Use Prime Seive
	 */
	public static int primes[] = new int[10000005];
	// Prime index is my Prime only array i.e its show position example 5th prime is
	// 11
	public static int primesIndex[] = new int[10000005];

	public static void fillPrimes() {

		primes[0] = 0;
		primes[1] = 0;
		primes[2] = -1;
		// Mark all odd numbers as primes as it is know even numbers greater than 2 are
		// not prime
		for (int i = 3; i < 1000005; i += 2) {
			primes[i] = -1;
		}
		for (int i = 3; i * i < 1000005; i += 2) {
			if (primes[i] != 0) {
				
				// mark all squares of it and multiple of i's above it as non primes
				for (int j = i * i; j < 1000005; j += i) {
					primes[j] = 0;
				}
			}
		}
		int index=0;
		for(int i=0;i<10000005;i++)
		{
			if(primes[i]==-1)
			{
				primesIndex[index++]=i;
						
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(br.readLine());
		fillPrimes();
		while (numCases > 0) {
			int index = Integer.parseInt(br.readLine());
			if (index == 0) {
				System.out.println(0);
				return;
			}
			System.out.println(primesIndex[index - 1]);
			numCases--;
		}

	}

}

/* https://github.com/shahiddhariwala */
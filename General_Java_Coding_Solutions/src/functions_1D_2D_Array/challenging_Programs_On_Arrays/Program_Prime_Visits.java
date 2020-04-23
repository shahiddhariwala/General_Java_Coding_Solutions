/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*PMO gives two random numbers a & b to the Prime Minister. PM Manmohan Singh wants to visit all countries
 * between a and b (inclusive) , However due to shortage of time he can't visit each and every country ,
 * So PM Manmohan Singh decides to visit only those countries,for which country number has two divisors. 
 * 
 * So your task is to find number of countries Mr. Manmohan Singh will visit.



Input Format
The first line contains N , no of test cases. The next N lines contain two integers a and b denoting the range of country numbers.

Constraints
a<=1000000 & b<=1000000.
N<=1000

Output Format
Output contains N lines each containing an answer for the test case.

Sample Input
2
1 10
11 20
Sample Output
4
4
Explanation
PM Manmohan Singh chooses countries with numbers 2,3,5 and 7 for the first testcase.
For the second testcase , he chooses countries with numbers 11,13,17 and 19.
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_Prime_Visits {
	private static int primeSeive[] = new int[1000005];
	private static int cumPrimes[] = new int[1000005];

	public static void main(String[] args) {
		fillPrimes();
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		while(0<numCases--)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			if(start!=0)
				System.out.println(cumPrimes[end]-cumPrimes[start-1]);
			else
				System.out.println(cumPrimes[end]-cumPrimes[start]);
		}
	}

	private static void fillCumPrimes() {
		for(int j=1;j<1000000;j++)
		{
			cumPrimes[j]=cumPrimes[j-1]+primeSeive[j];
		}

	}

	private static void fillPrimes() {

		primeSeive[0] = 0;
		primeSeive[1] = 0;
		primeSeive[2] = 1;
		// Marking all odd number as prime
		for (int i = 3; i < 1000005; i = i + 2) {
			primeSeive[i] = 1;
		}
		for (int i = 3; i * i < 1000005; i = i + 2) {
			if (primeSeive[i] == 1) {
				// mark all squares of it and multiple of i's above it as non primes
				for (int j = i * i; j < 1000000; j += i) {
					primeSeive[j] = 0;
				}
			}
		}
		fillCumPrimes();

	}

}

/* https://github.com/shahiddhariwala */
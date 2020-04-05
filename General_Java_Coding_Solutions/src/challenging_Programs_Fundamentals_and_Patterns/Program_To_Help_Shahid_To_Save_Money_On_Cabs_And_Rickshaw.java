/*
Coded by : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 * Shahid often uses public transport. The transport in the city is of two types: cabs and rickshaws.
 *  The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n, 
 *  the cabs are numbered by integers from 1 to m.

Public transport is not free. There are 4 types of tickets:

A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.

Shahid knows for sure the number of rides he is going to make and the transport he is going to use.
 He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.

Input Format
Each Test case has 4 lines which are as follows:

The first line contains four integers c1, c2, c3, c4 (1 ≤ c1, c2, c3, c4 ≤ 1000) — the costs of the tickets.
The second line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of rickshaws and cabs Shahid is going to use.
The third line contains n integers ai (0 ≤ ai ≤ 1000) — the number of times Shahid is going to use the rickshaw number i.
The fourth line contains m integers bi (0 ≤ bi ≤ 1000) — the number of times Shahid is going to use the cab number i.

Constraints
1 <= T <= 1000 , where T is no of testcases
1 ≤ c1, c2, c3, c4 ≤ 1000
1 ≤ n, m ≤ 1000
0 ≤ ai , bi ≤ 1000

Output Format
For each testcase , print a single number - the minimum sum of rupees Shahid will have to spend on the tickets in a new line.

Sample Input
2
1 3 7 19
2 3
2 5
4 4 4
4 3 2 1
1 3
798
1 2 3
Sample Output
12
1
Explanation
For the first testcase ,
The total cost of rickshaws = min( min(2 * 1, 3) + min(5 * 1, 3), 7) = min(5, 7) = 5
The total cost of cabs = min( min(4 * 1, 3) + min(4 * 1, 3) + min(4 * 1, 3) , 7) = min ( 9, 7) = 7
Total final cost = min( totalCabCost + totalRickshawCost , c4) = min( 5 + 7, 19) = min ( 12, 19) = 12
We print 12.
 */
package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Help_Shahid_To_Save_Money_On_Cabs_And_Rickshaw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		while (numCases > 0) {

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int numberOfRick = sc.nextInt();
			int numberOfcab = sc.nextInt();

			int arrCab[] = new int[numberOfcab];
			int arrRick[] = new int[numberOfRick];

			for (int i = 0; i < numberOfRick; i++) {
				arrRick[i] = sc.nextInt();
			}
			for (int i = 0; i < numberOfcab; i++) {
				arrCab[i] = sc.nextInt();
			}

			int totalCostOfRick = 0;
			for (int i = 0; i < numberOfRick; i++) {
				totalCostOfRick += Math.min(arrRick[i] * c1, c2);
			}
			totalCostOfRick = Math.min(totalCostOfRick, c3);
			int totalCostOfCab = 0;
			for (int i = 0; i < numberOfcab; i++) {
				totalCostOfCab += Math.min(arrCab[i] * c1, c2);
			}
			totalCostOfCab = Math.min(totalCostOfCab, c3);
			//System.out.println("\ntotalCostOfCab " + totalCostOfCab);
			//System.out.println("totalCostOfRick " + totalCostOfRick);
			System.out.println(Math.min(c4, totalCostOfCab + totalCostOfRick));
			numCases--;
		}
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
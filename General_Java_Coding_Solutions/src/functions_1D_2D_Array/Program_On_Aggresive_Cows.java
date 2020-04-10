/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

Input Format
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

Constraints
2 <= N <= 100,000
0 <= xi <= 1,000,000,000
2 <= C <= N

Output Format
Print one integer: the largest minimum distance.

Sample Input
5 3
1 2 8 4 9
Sample Output
3
Explanation
Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]
*/

package functions_1D_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program_On_Aggresive_Cows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numStalls = sc.nextInt();
		int numCows = sc.nextInt();
		int stallArray[] = new int[numStalls];
		for (int i = 0; i < stallArray.length; i++) {
			stallArray[i]=sc.nextInt();
		}
		Arrays.sort(stallArray);
		int k = binarySearch(stallArray,numCows);
		System.out.println(k);
		sc.close();
		
	}

	private static int binarySearch(int[] stallArray,int numCows) {
		int left=0;
		int right =stallArray.length-1;
		int ans = 0;
		while(left<=right)
		{
			int mid =(left+right)/2;
			if(checkByPlacing(mid,stallArray,numCows))
			{
				ans=mid;
				left=mid+1;
			}
			else
			{
			
				right=right-1;
			}

		}
		return ans;
	}

	private static boolean checkByPlacing(int mid, int[] stallArray,int numCows) {
		int prev=stallArray[0];
		int count=1;
		for (int i = 1; i < stallArray.length; i++) {
			if((stallArray[i]-prev) >= mid)
			{
				count++;
				prev = stallArray[i];
				if(count==numCows)
					return true;
			}
		}
		return count==numCows;
	}

}



/*https://github.com/shahiddhariwala*/
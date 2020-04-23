/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

Input Format
First line contains number of test cases, T. Next T lines contains integers, n and k.

Constraints
1<=T<=10 1<=N<=10^15 1<=K<=10^4

Output Format
Output the integer x

Sample Input
2
10000 1
1000000000000000 10
Sample Output
10000
31
Explanation
For the first test case, for x=10000, 10000^1=10000=n
*/
package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_To_Find_Kth_Root {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++) {
			
			long n = sc.nextLong();
			long k = sc.nextLong();
			System.out.println(findNumX(n,k));
			//System.out.println(x);
			
		}
		sc.close();

	}

	private static long findNumX(long n, long k) {
		if(k==1)
			return n;
		else
		{
			int left = 1;
			int right = 1000000;
			int mid=0;
			int ans=0;
			while(left<=right)
			{
				mid=(left+right)/2;
				//System.out.println("#"+mid);
				long temp =(long) Math.pow(mid, k);
				if(temp <= n)
				{
					ans=mid;
					left=mid+1;
				}
				else
				{
					right=mid-1;
				}
			}
			return ans;
		}
		
		
	}

}



/*https://github.com/shahiddhariwala*/
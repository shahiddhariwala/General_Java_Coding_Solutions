/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*
 Take as input N, the size of array. Take N more inputs and store that in an array.
  Take as input M, the size of second array and take M more inputs and store that in second array.
   Write a function that returns the sum of two arrays. Print the value returned.

Input Format
Constraints
Length of Array should be between 1 and 1000.

Output Format
Sample Input
4
1 0 2 9
5
3 4 5 6 7
Sample Output
3, 5, 5, 9, 6, END
Explanation
Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any (0 here ) .
*/

package functions_1D_2D_Array.challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_On_Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int M = sc.nextInt();
		int arr2[] = new int[M];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int maxArr[];
		int minArr[];
		if(N >= M)
		{
			maxArr = arr;
			minArr = arr2;
		}
		else
		{
			 maxArr = arr2;
			 minArr = arr;
		}
		int i=maxArr.length-1;
		int j=minArr.length-1;
		int newSum[] = new int[maxArr.length+1];
 		int carry=0;
 		int fromMin=0;
		while(i>=0)
		{
			
			if(j<0)
			{
				fromMin=0;
			}
			else
			{
				fromMin=minArr[j];
			}
			int temp = maxArr[i]+fromMin+carry;
			carry = temp/10;
			temp=temp%10;
			newSum[i+1]=temp;
			i--;
			j--;
		}
		newSum[0]=carry;
		
		for (int k = 0; k < newSum.length; k++) {
			if(k==0 && carry ==0)
				continue;
			System.out.print(newSum[k]+", ");
		}
		System.out.println("END");
		sc.close();

	}

}

/* https://github.com/shahiddhariwala */
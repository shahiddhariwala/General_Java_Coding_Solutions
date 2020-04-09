/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
Explanation
Find any pair of elements in the array which has sum equal to target element and print them.*/

package challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Program_To_Find_Target_Sum_Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 1; i <= numCases; i++) {
			arr[i - 1] = sc.nextInt();
		}
		int target = sc.nextInt();
		targetSum(arr, target);
		sc.close();

	}


	 public static void targetSum(int[] arr, int target){
	        Arrays.sort(arr);
	        int left = 0;
	        int right = arr.length - 1;
	        while (left < right) {
	            int sum = arr[left] + arr[right];
	            if (sum > target) {
	                right--;
	            } else if (sum < target) {
	                left++;
	            } else {
	                System.out.println(arr[left] + " and " + arr[right]);
	                left++;
	                right--;
	            }
	        }
	    }



}

/* https://github.com/shahiddhariwala */
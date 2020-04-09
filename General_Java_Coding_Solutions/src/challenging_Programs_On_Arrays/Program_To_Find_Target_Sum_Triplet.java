/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
  Take as input N, the size of array. Take N more inputs and store that in an array. 
  Take as input “target”, 
  a number. Write a function which prints all triplets of numbers which sum to target.

Input Format
First line contains input N.
Next line contains N space separated integers denoting the elements of the array.
The third line contains a single integer T denoting the target element.

Constraints
Length of Array should be between 1 and 1000.

Output Format
Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C 
where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted
 order. Print only unique triplets.

Sample Input
9
5 7 9 1 2 4 6 8 3
10
Sample Output
1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5
Explanation
Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array
 which sum to target number.
 */

package challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Find_Target_Sum_Triplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int arr[] = new int[numCases];
		for (int i = 1; i <= numCases; i++) {
			arr[i - 1] = sc.nextInt();
		}
		int target = sc.nextInt();
		targetSumTriplet(arr, target);
		sc.close();

	}

	private static void targetSumTriplet(int[] arr, int target) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 3; i++) {
			int tempTarget = target - arr[i];
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				int sum = arr[left] + arr[right];
				if (sum > tempTarget) {
					right--;
				} else if (sum < tempTarget) {
					left++;
				} else {
					System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
					left++;
					right--;
				}
			}
		}

	}

}

/* https://github.com/shahiddhariwala */
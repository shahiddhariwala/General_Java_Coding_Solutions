/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * Given an array S of size N , check if it is possible to split sequence into two sequences -
s1 to si and si+1 to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.

Input Format
First line contains a single integer N denoting the size of the input.
Next N lines contain a single integer each denoting the elements of the array S.

Constraints
0 < N < 1000 Each number in sequence S is > 0 and < 1000000000

Output Format
Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.

Sample Input
5 
1 
2 
3 
4 
5
Sample Output
true
Explanation
Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.

 */

package challenging_Programs_Fundamentals_and_Patterns;

import java.util.Scanner;

public class Program_To_Check_Increasing_Decreasing_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfElement = sc.nextInt();
		boolean flag=true;
		int arr[] = new int[numOfElement];
		for(int i=0;i<numOfElement;i++)
		{
			arr[i]=sc.nextInt();
		}
		int countOfChange=0;
		for(int i=1;i<numOfElement;i++)
		{
			if(arr[i]<arr[i-1] && flag==true)
			{
				//dont do anything
			}
			else if(arr[i]>arr[i-1] && flag==false)
			{
				//dont do anything
				//sequence is set to drecreasing
			}
			else
			{
				flag=false;
				countOfChange++;
			}
		}
		if(countOfChange<=1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
You are given number of pages in n different books and m students. 
The books are arranged in ascending order of number of pages. Every student is assigned to read some 
consecutive books. The task is to assign books in such a way that the maximum number of pages assigned 
to a student is minimum.

Input Format
First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 
1st line contains two integers n and m which represents the number of books and students and 2nd line 
contains n space separated integers which represents the number of pages of n books in ascending order.

Constraints
1 < t < 50
1< n < 100
1< m <= 50
1 <= Ai <= 1000

Output Format
Print the maximum number of pages that can be assigned to students.

Sample Input
1
4 2
12 34 67 90
Sample Output
113 
Explanation
1st students : 12 , 34, 67 (total = 113)
2nd students : 90 (total = 90)
Print max(113, 90)
*/
package challenging_Programs_On_Arrays;

import java.util.Scanner;

public class Program_On_Book_Allocation_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++) {
			
			int numbooks = sc.nextInt();
			int numStudents = sc.nextInt();
			int bookArray[] = new int[numbooks];
			for (int j = 0; j < bookArray.length; j++) {
				bookArray[j] = sc.nextInt();
			}
			System.out.println(getMinimumLargestPages(bookArray, numStudents, numbooks));

		}
		sc.close();

	}

	private static int getSumArray(int bookArray[]) {
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum = sum + bookArray[i];
		}
		return sum;
	}

	private static boolean checkIfAllocationIsOkay(int mid, int[] bookArray, int numStudents) {
		int counStudents=1;
		int sum=0;
		for (int i = 0; i < bookArray.length; i++) {
			sum = sum + bookArray[i];
			if(sum >mid)
			{
				sum=bookArray[i];
				counStudents++;
			
			}
		}
		return counStudents<=numStudents;
	}

	private static int getMinimumLargestPages(int bookArray[], int numStudents, int numbooks) {
		int lowestMax = bookArray[numbooks - 1];
		int highestMax = getSumArray(bookArray);
		int answer = 0;
		while (lowestMax <= highestMax) {
			int mid = lowestMax + highestMax;
			mid = mid >> 1;
			if (checkIfAllocationIsOkay(mid, bookArray, numStudents)) {
				answer=mid;
				//All the possible allocation lesser than it will be okay
				highestMax=mid-1;
			}
			else
			{
				//check possible allocation greater than mid
				lowestMax = mid+1;
			}

		}
		return answer;
	}

}

/* https://github.com/shahiddhariwala */
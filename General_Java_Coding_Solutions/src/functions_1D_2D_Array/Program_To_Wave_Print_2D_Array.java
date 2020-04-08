/*
Code by  : Shahid Dhariwala

LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
 * 
2D Array is as follow
11	12	13	14	
21	22	23	24	
31	32	33	34	
41	42	43	44	

Row Wise Wave Print
11 12 13 14 24 23 22 21 31 32 33 34 44 43 42 41 END

 */
package functions_1D_2D_Array;

import java.util.Scanner;

public class Program_To_Wave_Print_2D_Array {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		display2DArray(arr);
		wavePrintRowWise(arr);
		wavePrintColumnWise(arr);
	}

	private static void wavePrintColumnWise(int[][] arr) {
		System.out.println("\nColumn Wise Wave Print");
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + ", ");
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[j][i] + ", ");
				}
			}

		}
		System.out.println("END");
		
	}

	private static void wavePrintRowWise(int[][] arr) {
		System.out.println("\nRow Wise Wave Print");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}

		}
		System.out.println("END");

	}

	private static void display2DArray(int[][] arr) {
		System.out.println("\n2D Array is as follow");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

	}

	public static int[][] takeInputTo2DArray() {
		// System.out.println("Enter the Number of Rows in your 2D");
		int numRows = sc.nextInt();
		int numCols = sc.nextInt();
		int arr[][] = new int[numRows][numCols];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Take_Input_2D_Array_Print_2D_Array {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * int arr[][]; System.out.println(arr); Will throw error as array is not
		 * initialised
		 */

		// Initialising the 2D Array
		int numRows = 5; // numRows are actually number of 1D arrays references
		int numCols = 10; // numCOls are the number of elements in that 1D arrays
		// arr[numRows][] is a 1D array itself
		// Each 2D arrays is made up of 1D array itself,containing pointers to it
		int arr[][] = new int[numRows][numCols];
		System.out.println(arr);
		System.out.println(Arrays.deepToString(arr));
		display2DArray(arr);
		/* 
		[[I@452b3a41
		[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
		arr[0]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[1]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[2]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[3]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[4]	=> |0||0||0||0||0||0||0||0||0||0|
		By Default everything is initialised to zero in array
		 */
		arr[2][1]=21;
		arr[1][2]=12;
		System.out.println("Val at arr[2][1] is "+arr[2][1]);
		System.out.println("Val at arr[1][2] is "+arr[1][2]);
		display2DArray(arr);
		/*
		Val at arr[2][1] is 21
		Val at arr[1][2] is 12
		arr[0]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[1]	=> |0||0||12||0||0||0||0||0||0||0|
		arr[2]	=> |0||21||0||0||0||0||0||0||0||0|
		arr[3]	=> |0||0||0||0||0||0||0||0||0||0|
		arr[4]	=> |0||0||0||0||0||0||0||0||0||0|
		 */
		
		System.out.println("Initializing Zig-Zag Array");
		int[][]  arr2 = new int[3][];
		arr2[0]=new int[4];
		arr2[1]=new int[0];
		arr2[2]=new int[3];
		display2DArray(arr2);
		/*
		 * Initializing Zig-Zag Array
			arr[0]	=> |0||0||0||0|
			arr[1]	=> 
			arr[2]	=> |0||0||0|
		 */
		
		int arr3[][] = takeInputTo2DArray();
		display2DArray(arr3);
		
		/*
		 *  Enter the Number of Rows in your 2D
			3
			Enter the Number of Cols in row 0
			3
			Enter the Items
			1 2 3 
			
			Enter the Number of Cols in row 1
			3
			Enter the Items
			3 2 1 
			
			Enter the Number of Cols in row 2
			6
			Enter the Items
			1 2 3 6 77 88
			
			arr[0]	=> |1||2||3|
			arr[1]	=> |3||2||1|
			arr[2]	=> |1||2||3||6||77||88|

		 */
		
		//Initialising 2D with values
		System.out.println("Initialising 2D with values");
		int arr4[][] = {{1,2,3},{2,3},{44,55,666,77,777,777,897,78,6}};
		display2DArray(arr4);
		/*
		 * Initialising 2D with values
			arr[0]	=> |1||2||3|
			arr[1]	=> |2||3|
			arr[2]	=> |44||55||666||77||777||777||897||78||6|
		 */
		sc.close();
		
	}

	private static int[][] takeInputTo2DArray() {
		System.out.println("Enter the Number of Rows in your 2D");
		int numRows=sc.nextInt();
		int arr[][] = new int[numRows][];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Number of Cols in row "+i);
			int numCols=sc.nextInt();
			arr[i]=new int[numCols];
			System.out.println("Enter the Items");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}

			System.out.println();
		}
		return arr;
	}

	private static void display2DArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]\t=> ",i);
			//printing object arr[i] ? return getClass().getName()+"@"+Integer.toHexString(hashCode());
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("|" + arr[i][j] + "|");
			}

			System.out.println();
		}

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala

LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*


2D Array is as follow
11	12	13	14	
21	22	23	24	
31	32	33	34	
41	42	43	44	
Spiral ClockWise
11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END
Spiral AntiClockWise
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END



 */
package functions_1D_2D_Array;

public class Program_To_Spiral_Print_2D_Array {

	public static void main(String[] args) {
		int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		display2DArray(arr);
		System.out.println("Spiral ClockWise");
		spiralPrintClockWise(arr);
		System.out.println("Spiral AntiClockWise");
		spiralPrintAntiClockWise(arr);
	}

	private static void spiralPrintAntiClockWise(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;
		int count = (bottom + 1) * (right + 1);// number of elements yet to be printed
		int dir = 1;
		// dir = 1 top to bottom
		// dir = 2 left to right
		// dir = 3 bottom to top
		// dir 4 = right to left

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					left++;
					dir = 2;
				}

			}
			if (count > 0) {

				if (dir == 2) {

					for (int i = left; i <= right; i++) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					bottom--;
					dir = 3;
				}

			}
			if (count > 0) {

				if (dir == 3) {

					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					right--;
					dir = 4;
				}
			}

			if (count > 0) {
				if (dir == 4) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					top++;
					dir = 1;
				}
			}

		}

		System.out.println("END");

	}

	private static void spiralPrintClockWise(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;
		int count = (bottom + 1) * (right + 1);// number of elements yet to be printed
		int dir = 1;
		// dir = 1 left to right
		// dir = 2 top to bottom
		// dir = 3 right to left
		// dir 4 = bottom to up

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					top++;
					dir = 2;
				}
			}
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					right--;
					dir = 3;
				}

			}
			if (count > 0) {

				if (dir == 3) {

					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					bottom--;
					dir = 4;
				}

			}
			if (count > 0) {

				if (dir == 4) {

					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					left++;
					dir = 1;
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

}

/* https://github.com/shahiddhariwala */
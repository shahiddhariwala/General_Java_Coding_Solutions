/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package recursionAndBacktracking;

public class Program_To_Print_MazePath
{

	public static void main(String[] args)
	{
		int numRows = 2;
		int numColumns = 2;
		System.out.println("\nHorizontal Vertical \n");
		int count = justPrintAndCountMazePath(numRows, numColumns, 0, 0, "");
		System.out.println("\nCount " + count);
		System.out.println("\n\nHorizontal Vertical Diagonal \n");
		int hvdCount = justPrintAndCountMazePathHVD(numRows, numColumns, 0, 0, "");
		System.out.println("\nCount " + hvdCount);

		/*
		 * Horizontal Vertical
		 * HHVV HVHV HVVH VHHV VHVH VVHH
		 * Count 6
		 * Horizontal Vertical Diagonal
		 * HHVV HVHV HVVH HVD HDV VHHV VHVH VHD VVHH VDH DHV DVH DD
		 * Count 13
		 */
	}

	private static int justPrintAndCountMazePath(int numRows, int numColumns, int i, int j, String output)
	{
		if (i > numRows || j > numColumns)
		{
			return 0;
		}
		if (i == numRows && j == numColumns)
		{
			System.out.print(output + " ");
			return 1;
		}
		int hCount = justPrintAndCountMazePath(numRows, numColumns, i + 1, j, output + "H"); // horizontal
		int vCount = justPrintAndCountMazePath(numRows, numColumns, i, j + 1, output + "V"); // vertical
		return hCount + vCount;

	}

	private static int justPrintAndCountMazePathHVD(int numRows, int numColumns, int i, int j, String output)
	{
		if (i > numRows || j > numColumns)
		{
			return 0;
		}
		if (i == numRows && j == numColumns)
		{
			System.out.print(output + " ");
			return 1;
		}
		int hCount = justPrintAndCountMazePathHVD(numRows, numColumns, i + 1, j, output + "H"); // horizontal
		int vCount = justPrintAndCountMazePathHVD(numRows, numColumns, i, j + 1, output + "V"); // vertical
		int dCount = justPrintAndCountMazePathHVD(numRows, numColumns, i + 1, j + 1, output + "D"); // Diagonal
		return vCount + hCount + dCount;

	}

}

/* https://github.com/shahiddhariwala */
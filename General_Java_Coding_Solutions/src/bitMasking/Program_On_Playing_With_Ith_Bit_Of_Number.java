/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package bitMasking;

public class Program_On_Playing_With_Ith_Bit_Of_Number
{
	public static void main(String[] args)
	{
		System.out.println("------------Check if ith Bit is set or not--------------");
		int i = 3;
		int num = 22;
		int mask = 1 << i - 1;
		System.out.println(Integer.toBinaryString(mask));
		System.out.println(Integer.toBinaryString(num));
		System.out.println((num & mask) > 0 ? "Its Set" : "its not set");

		/*
		 * ------------Check if ith Bit is set or not--------------
		 * 100
		 * 10110
		 * Its Set
		 */

		System.out.println("-----------Set Ith Bit--------------");
		int numSet = 8;
		int ans = setBit(numSet, 2);
		System.out.println(Integer.toBinaryString(numSet));
		System.out.println(Integer.toBinaryString(ans));
		System.out.println(ans);
		/*
		 * -----------Set Ith Bit--------------
		 * 1000
		 * 1010
		 * 10
		 */

		System.out.println("-----------UnSet Ith Bit--------------");
		int ans2 = unsetBit(15, 2);
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(ans2));
		/*
		 * -----------UnSet Ith Bit--------------
		 * 1111
		 * 1101
		 */
		System.out.println("-----------get Position of RightMost set Bit--------------");
		System.out.println(54);
		System.out.println(Integer.toBinaryString(54));
		int pos = getRightMostPositionOfSetBit(54);
		System.out.println(pos);
		/*
		 * -----------get Position of RightMost set Bit--------------
		 * 54
		 * 110110
		 * 2
		 */
		System.out.println("-----------Adding one to Number--------------");
		int ans3 = addOne(10);
		System.out.println(ans3);
		/*
		 * -----------Adding one to Number--------------
		 * 11
		 */
	}

	private static int addOne(int i)
	{
		int mask = 1;
		// do till we get first 0bit
		while ((i & mask) != 0)
		{
			i = i ^ mask;
			mask = mask << 1;
		}
		i = i ^ mask;
		return i;
	}

	private static int getRightMostPositionOfSetBit(int i)
	{
		int pos = 1;
		int mask = 1;
		while ((i & mask) == 0)
		{
			pos++;
			mask = mask << 1;
		}

		return pos;
	}

	private static int unsetBit(int i, int j)
	{
		int mask = 1 << j - 1;
		mask = ~mask;
		return i & mask;
	}

	public static int setBit(int num, int pos)
	{
		int mask = 1 << pos - 1;
		return num | mask;
	}
}

/* https://github.com/shahiddhariwala */
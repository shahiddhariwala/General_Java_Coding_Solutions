/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package textProcessing;

import java.util.Arrays;
import java.util.BitSet;

public class HuffmanClient
{

	public static void main(String[] args)
	{
		String str = "abbccda";
		HuffmanEncoder hf = new HuffmanEncoder(str);
		String codedString = hf.encode(str);
		System.out.println(codedString);
		String decodedString = hf.decode(codedString);
		System.out.println(decodedString);

		BitSet bitSet = new BitSet(codedString.length());
		int bitCounter = 0;
		for (Character c : codedString.toCharArray())
		{
			if (c.equals('1'))
			{
				bitSet.set(bitCounter);
			}
			bitCounter++;
		}
		byte[] arr = bitSet.toByteArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		// This array is of two bytes, earlier our string was of 14 bytes (2 bytes x 7 char)

		/*
		 * 01111100001001
		 * abbccda
		 * [62, 36]
		 * 2
		 * 
		 */

	}

}

/* https://github.com/shahiddhariwala */
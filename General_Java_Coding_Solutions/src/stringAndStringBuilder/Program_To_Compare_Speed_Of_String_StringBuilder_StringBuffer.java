/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
Time is in Milli Second
Time take to do operation on StringBuilder is 14
Time take to do operation on StringBuffer is 17
Time take to do operation on String is 10122 
 */
package stringAndStringBuilder;

public class Program_To_Compare_Speed_Of_String_StringBuilder_StringBuffer {

	public static void main(String[] args) {
		System.out.println("Time is in Milli Second");
		long start = System.currentTimeMillis();
		doOperationSBR(100000);
		long end = System.currentTimeMillis();
		System.out.println("Time take to do operation on StringBuilder is "+(end-start));
		start = System.currentTimeMillis();
		doOperationSBF(100000);
		end = System.currentTimeMillis();
		System.out.println("Time take to do operation on StringBuffer is "+(end-start));
		start = System.currentTimeMillis();
		doOperationString(100000);
		end = System.currentTimeMillis();
		System.out.println("Time take to do operation on String is "+(end-start));
		
	}

	private static void doOperationString(int i) {
		String str = "";
		for (int j = 0; j < i; j++) {
			str=str+j;
		}
		
	}

	private static void doOperationSBF(int i) {
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < i; j++) {
			sb.append(j);
		}
		
	}

	private static void doOperationSBR(int i) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < i; j++) {
			sb.append(j);
		}
		
	}

}

/* https://github.com/shahiddhariwala */
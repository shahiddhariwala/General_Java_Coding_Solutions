/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stringAndStringBuilder;

public class Program_Playing_With_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb1); //
		System.out.println(sb2); // Hello

		sb1.append(sb2);
		System.out.println(sb1);// Hello

		System.out.println(sb1.length());// 5
		System.out.println(sb1.charAt(2));// l
		sb1.setCharAt(2,'W');
		System.out.println(sb1); // HeWlo
		sb1.insert(2, "Sha");
		System.out.println(sb1); // HeShaWlo
		System.out.println(sb1.length());
		System.out.println(sb1.insert(sb1.length(),"Dhariwala"));// till string.length
		// 8
		// HeShaWloDhariwala
		sb1.append('A');
		System.out.println(sb1); // HeShaWloDhariwalaA
		sb1.append("Decoder");
		System.out.println(sb1);// HeShaWloDhariwalaADecoder
		sb1.deleteCharAt(0);
		System.out.println(sb1);// eShaWloDhariwalaADecoder
		sb1.delete(0, 6);
		System.out.println(sb1);// oDhariwalaADecoder
		sb1.replace(0, 1, "Shahid");
		System.out.println(sb1);// ShahidDhariwalaADecoder
		int index = sb1.lastIndexOf("A");
		sb1.replace(index, index+1, "The");
		System.out.println(sb1); // ShahidDhariwalaTheDecoder
		sb1.reverse();
		String str = sb1.toString();
		System.out.println(str); //redoceDehTalawirahDdihahS
		sb1.reverse();
		System.out.println(sb1.substring(0,15)); // ShahidDhariwala
		System.out.println(sb1.substring(15)); // TheDecoder
	}

}

/* https://github.com/shahiddhariwala */
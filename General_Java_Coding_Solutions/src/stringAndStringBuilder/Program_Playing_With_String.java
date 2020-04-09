/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stringAndStringBuilder;

public class Program_Playing_With_String {

	public static void main(String[] args) {
		String str = "Hello";
		// Hello is stored in intern pool
		String s1 = "Hello";
		// jvm check if hello is present or not , if present in intern pool
		// return the address of it i.e reference to it
		// str and s1 now points to sam eaddress

		str = "bye";
		// new "bye" string is added to intern pool and str is given address to it
		System.out.println(s1);
		System.out.println(str);
//		Hello
//		bye
		System.out.println("String Length");
		System.out.println(s1.length());
		System.out.println(str.length());
//		String Length
//		5
//		3
		System.out.println("Printing String by Char");
		for (int i = 0; i < str.length(); i++) {
			System.out.println("at " + i + " char is " + str.charAt(i));
		}
//		Printing String Char by Char
//		at 0 char is b
//		at 1 char is y
//		at 2 char is e
		str = "Hello";
		System.out.println("Using Substring");
		System.out.println("String \""+str+"\" of length "+str.length());
		System.out.println("\t2 paramater substring method");
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.printf("start = %d, end = %d => %s\n",i,j,str.substring(i, j));
			}

		}
		System.out.println("\t1 Paramter substring method");
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("start = %d => %s\n",i,str.substring(i));
		}
//		Using Substring
//		String "Hello" of length 5
//		2 paramater substring method
//		start = 0, end = 1 => H
//		start = 0, end = 2 => He
//		start = 0, end = 3 => Hel
//		start = 0, end = 4 => Hell
//		start = 0, end = 5 => Hello
//		start = 1, end = 2 => e
//		start = 1, end = 3 => el
//		start = 1, end = 4 => ell
//		start = 1, end = 5 => ello
//		start = 2, end = 3 => l
//		start = 2, end = 4 => ll
//		start = 2, end = 5 => llo
//		start = 3, end = 4 => l
//		start = 3, end = 5 => lo
//		start = 4, end = 5 => o
//		1 Paramter substring method
//		start = 0 => Hello
//		start = 1 => ello
//		start = 2 => llo
//		start = 3 => lo
//		start = 4 => o
		
		System.out.println("\tConcatenating 2 String");
		String str1 = "Hi";
		String str2 = "Bye";
		String str3 = str1+str2;
		System.out.println(str3);
		String str4 = str1.concat(str2);
		System.out.println(str4);
//		Concatenating 2 String
//		HiBye
//		HiBye
		
		System.out.println("\n\t Comparing two String");
		String str5 = "abcd";
		String str6 = "abcd";
		String str7 = "Hello";
		String str8 = str7;
		String str9 = new String("Hello");
		//new String("Hello");
		// will create new object to Hello outside the intern pool on heap
		System.out.println(str5==str6);
		System.out.println(str6==str7);
		System.out.println(str7==str8);
		System.out.println("\tComparing Hello's New Object and Hello from InternPool");
		System.out.println(str8==str9);//comparing references from stack
		System.out.println(str8.equals(str9));//comparing char by char
		// ==  comparse content kept at Internal Stack here address or reference
		// s1.equals(s2) compares char by char content
//		 Comparing two String
//		 true
//		 false
//		 true
//		 Comparing Hello's New Object and Hello from InternPool
//		 false
//		 true
		System.out.println("\tFinding Index of substring");
		System.out.println(str9);
		System.out.println(str9.indexOf("ll"));
		System.out.println(str9.lastIndexOf("l"));
		System.out.println(str9.indexOf("l"));
		System.out.println(str9.indexOf("by"));
		//if found return starting index else -1
//		Finding Index of substring
//		Hello
//		2
//		3
//		2
//		-1
		System.out.println("\tStarts With");
		System.out.println(str9.startsWith("He"));
		System.out.println(str9.startsWith("he"));
//		Starts With
//		true
//		false
	}

}

/* https://github.com/shahiddhariwala */
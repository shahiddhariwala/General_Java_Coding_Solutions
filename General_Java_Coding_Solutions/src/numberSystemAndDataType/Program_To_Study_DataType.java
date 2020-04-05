package numberSystemAndDataType;

public class Program_To_Study_DataType {

	public static void main(String[] args) {
		byte b = 10;
		// 1 byte
		short sh = 20;
		// short is 2 byte
		int in = 30;
		// int is of 4 byte
		long ln = 40;
		// long is of 8 byte

		/*
		 * not possible b=in; b=ln,b=sh;;
		 */
		// byte<short<int<long
		// byte is smallest so we cant assign int,long,or short

		// short
		sh = b;
		System.out.println(sh);
		// Not possible for short
//		sh=in;
//		sh=lm;

		// int
		in = b;
		in = sh;
		// in=ln; not possible;

		// long
		ln = b;
		ln = sh;
		ln = in;
		// all above possible for long

		// whatever is assigned on right side it will check if it belongs in range of
		// particular data type
		// compiler does implicit conversion like b=(byte) 10;

		System.out.println("smallest value for byte " + Byte.MIN_VALUE);

		System.out.println("largest value for byte " + Byte.MAX_VALUE);
		// lets force assign larger value i.e out of range value for byte to byte
		// variable
		b = (byte) -128;
		System.out.println("Forced value is " + b);
		// Forced value is -128

		// Part 3 Integer
		in = 1000000000;// 10^9
		// in =10000000000;// val > 10^9;
		// ln = 10000000000; not allowed as its of type Integer so we have to add L at end to show its long 
		ln = 10000000000L;
		System.out.println(ln);
		
		//Part 4 Storing Decimal Number
		//By Default decimal number are of type double
		// float fn = 5.5; its not allowed we have to explicitly tell to compiler that its of type float by adding 'f' at end of decimal
		// number i,e
		System.out.println("Float");
		float fn = 5.5f;
		System.out.println(fn);
		System.out.println("Max value: "+Float.MAX_VALUE);
		System.out.println("Min value: "+Float.MIN_VALUE);
		System.out.println("Double");
		double dn = 6.5;
		System.out.println(dn);
		System.out.println("Max value: "+Double.MAX_VALUE);
		System.out.println("Min value: "+Double.MIN_VALUE);
		
		
		System.out.println("\n\nPart 5 assigning float to int and int to float");
		//Part 5 assigning float to int and int to float
		float f5 = 5.5f;
		int i5 = 12;
		System.out.println("Float\t"+f5);
		System.out.println("Int\t"+i5);
		// i5=f5; Not allowed 
		i5=(int)f5; //allowed
		System.out.println("With type cast i5=(int)f5 ;; "+i5);
		i5=12;
		f5=i5;
		System.out.println("New f5\t"+f5);
		
		
		//Part 5 Boolean
		System.out.println("\n\n\nPart 6 :  Boolean DataType");
		boolean bit = false;
		System.out.println(bit);
		//bit =1 or bit =1  not allowed in java
		if(bit)
		{
			System.out.println("Bit is true");
		}
		else
		{
			System.out.println("Bit is false");
		}
		bit = true;
		System.out.println("bit set to true\n");
		if(bit)
		{
			System.out.println("Bit is true");
		}
		else
		{
			System.out.println("Bit is false");
		}
		
		System.out.println("Checking "+(10>0));
		bit = 10<0;
		System.out.println("Checking bit "+bit);
		
		//Part 6 Charcater Datatype
		System.out.println("\n\nPart 6: Charcater Datatype");
		char ch = 'A';
		System.out.println("Printing Character "+ch);
		ch=67;
		System.out.println("Unicode char at 67 is "+ch);
		ch = 2345;
		System.out.println("Unicode char at 2345 is "+ch);
		// ch = ch+2 not allowed
		ch=67;
		ch = (char)(ch + 2);
		System.out.println("new ch "+ch);
		ch = 'a';
		in=ch;
		System.out.println("int vaLUE OF a is "+in);
		ch = (char) 64057;
		System.out.println(ch);
		
		//Part 7
		System.out.println("\n\nPart 7 : Sout tweaks");
		System.out.println(10+20+"Hello"+10+20);
		System.out.println(2+' '+5);
		System.out.println(2+" "+5);
		System.out.println("Hello"+'\t'+"World");
		System.out.println("Hello"+"\t"+"World");
		
		
	}

}

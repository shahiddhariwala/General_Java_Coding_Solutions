/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

public class Program_Playing_With_Function {

	public static void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void addition(int a, int b) {

		System.out.println(a + b);
	}

	public static int getAdditionVal(int a, int b) {

		return a + b;
	}

	private static int demoScope(int one, int two) {

		int sum = one + two;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("====Part 1=====");
		System.out.println("Before Calling Function");
		// call function
		addition();
		System.out.println("After Function Call");
		// Please debug to see the stack
		System.out.println("====Part 2=====");
		System.out.println("Function with Paramter");
		addition(10, 20);
		addition(22, 33);
		System.out.println("====Part 3=====");
		System.out.println("Function with Return type");
		System.out.println(getAdditionVal(111, 444));
		System.out.println("====Part 4=====");
		System.out.println("variable Scope");
		int one = 20;
		int two = 30;
		int res = demoScope(one, two);
		System.out.println(res);

	}

}

/* https://github.com/shahiddhariwala */
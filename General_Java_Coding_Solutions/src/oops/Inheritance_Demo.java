/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops;

class Parenti
{
	int d = 10;
	int d1 = 20;

	public void fun()
	{
		System.out.println("I am a Parent fun");
	}

	public void fun1()
	{
		System.out.println("I am a Parent fun1");
	}
}

class Childi extends Parenti
{
	int d = 11;
	int d2 = 31;

	public void fun()
	{
		System.out.println("I am a Child fun");
	}

	public void fun2()
	{
		System.out.println("I am a Child fun2");
	}

}

public class Inheritance_Demo
{

	public static void main(String[] args)
	{
		System.out.println("---Case 1---");
		Parenti p1 = new Parenti();
		System.out.println(p1.d);
		System.out.println(p1.d1);
		p1.fun();
		p1.fun1();
		/*---Case 1---
		10
		20
		I am a Parent fun
		I am a Parent fun1
		*/
		System.out.println("---Case 2---");
		Parenti p2 = new Childi();
		System.out.println(p2.d);
		// Collision of varaibles are resolved on the basiis of reference used
		System.out.println(((Childi) (p2)).d);
		// by type casting we can force to use
		System.out.println(p2.d1);
		// System.out.println(p2.d2);
		// Compiler always look at LHS of Statement and JVM Looks at RHS of Stetement
		// JVM has created instance of child on heap with all properties
		// But compiler resolves the issue using references, in our case p2 is of type
		// Parenti() and space will be alloted during runtime for d2 when loader will
		// load the dependency
		// so we will have to type cast to silent the compiler
		System.out.println(((Childi) p2).d2);
		p2.fun();
		// Collision of functions are resolved by checking first by going to child if we
		// have same function then use it or else
		// use function of parent
		p2.fun1();
		((Childi) p2).fun2();
		// ---Case 2---
		// 10
		// 11
		// 20
		// 31
		// I am a Child fun
		// I am a Parent fun1
		// I am a Child fun2

		System.out.println("---Case 3---");
		// Childi c1 = new Parenti(); // Compile time error are better than runtime
		// error, this is not allowed
		// System.out.println(c1.d);
		// System.out.println(c1.d1);
		// System.out.println(c1.d2); // this will throw RunTime error as JVM didnt
		// create space for it in heap as we had Parenti Insstance

		System.out.println("---Case 4---");
		Childi c2 = new Childi();
		System.out.println(c2.d); // Collision of Variable are resolved on the basis of reference used, c2 is of
									 // Childi
		System.out.println(((Parenti) (c2)).d);
		// by type casting we can force to use
		System.out.println(c2.d1);
		System.out.println(c2.d2);
		c2.fun(); // JVM checks the new class first if present then use it or else use of parent
		((Parenti) (c2)).fun(); // this will still execute function of Child class as , JVM found the fun() in
								 // Childs blueprint and it wiill
								// directly return fun without checking parent, i.e it Override
		c2.fun1();
		c2.fun2();
		/*
		 * ---Case 3---
		 * ---Case 4---
		 * 11
		 * 10
		 * 20
		 * 31
		 * I am a Child fun
		 * I am a Child fun
		 * I am a Parent fun1
		 * I am a Child fun2
		 */

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops;

class ParentMO
{
	void fun(int i)
	{
		System.out.println("I am Parent MO " + i);
	}
}

class ChildMO extends ParentMO
{
	// This will Override ParentMO.fun()
	@Override // Anottation helps us to check if we are overriding parent not creating new
				 // function
	void fun(int i)
	{
		System.out.println("I am Child Bro " + (i * 10));
	}
}

public class Method_Overriding_Demo
{

	public static void main(String[] args)
	{
		// Overriding is a feature that allows a Child class to Provide a specific
		// Implementation of A Method
		// that is already provided by its parent class
		// MO Rule : 1) Has Same Signature of Method as that of Parent's Method and 2)
		// Has the same name as of Parent's Method
		// By Same Signature means same Name,Return Type and Parameters

		//
		ParentMO p1 = new ParentMO();
		p1.fun(2);

		ParentMO p2 = new ChildMO();
		// Here ChildMO function will exceute as it has Override it;
		p2.fun(10);

		ChildMO c1 = new ChildMO();
		// Here ChildMO function will exceute, as hier is no collision
		c1.fun(11);

		/*
		 * I am Parent MO 2
		 * I am Child Bro 100
		 * I am Child Bro 110
		 * 
		 */
	}

}

/* https://github.com/shahiddhariwala */
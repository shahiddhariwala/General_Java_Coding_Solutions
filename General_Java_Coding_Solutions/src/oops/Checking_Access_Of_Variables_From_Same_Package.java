/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package oops;

public class Checking_Access_Of_Variables_From_Same_Package extends Access_Specifiers_Demo
{

	public void fun()
	{
		System.out.println(defaultValue);
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		11
//		12
//		13
		//We are in smae package except private everythinh is visible
//		System.out.println(privateValue);
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The field Access_Specifiers_Demo.privateValue is not visible
		
		
		//If this class was not in same package and was a derived class
		// we can only access public and protected
		// protected are only visible when we have class extending to the class which contains the protected variable
		
		
		
		
	}
	public static void main(String[] args)
	{
		Checking_Access_Of_Variables_From_Same_Package obj = new Checking_Access_Of_Variables_From_Same_Package();
		obj.fun();
		Without_Extending_Access_Specifiers_Demo.fun();
	}

}

class Without_Extending_Access_Specifiers_Demo
{
	public static void fun()
	{
		System.out.println("Without_Extending_Access_Specifiers_Demo");
		Access_Specifiers_Demo asd = new Access_Specifiers_Demo();
		System.out.println(asd.defaultValue);
		System.out.println(asd.publicValue);
		System.out.println(asd.protectedValue);
		
		//private wont be visible
		// System.out.println(asd.privateValue);
		
		//if this class was outside the package or in some package
		// we could have only accessed the public varaibles
	}
}

/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops;

class PersonC
{
	private String name;
	private int age;

	public PersonC()
	{
		// this is constructor
		// constructor does not have any return type
		// they are of the same name as of the class
		System.out.println("I am the default Constructor");
		this.name = "DefaultName";
		this.age = 0;
		// Constructor looks like a functions
	}

	public PersonC(String name)
	{
		System.out.println("I am Parameterised Constructor with 1 Parameter");
		this.name = name;
	}

	public PersonC(int age)
	{
		System.out.println("I am Parameterised Constructor with 1 Parameter");
		this.age = age;
	}

	public PersonC(String name, int age)
	{
		System.out.println("I am Parameterised Constructor 2 parameter");
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "PersonC [name=" + name + ", age=" + age + "]";
	}

}

public class Constructor_Demo
{

	public static void main(String[] args)
	{
		// Use of constructor is to initialse the object, i.e property of it
		PersonC p1 = new PersonC();
		PersonC p2 = new PersonC();

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1);// uses toString of object class,. we have Override it with our custom return
								// type

		System.out.println(p2);

		p2.setAge(22);
		p2.setName("Luffy");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2);
		// I am the default Constructor
		// I am the default Constructor
		// DefaultName
		// 0
		// PersonC [name=DefaultName, age=0]
		// PersonC [name=DefaultName, age=0]
		// Luffy
		// 22
		// PersonC [name=Luffy, age=22]
		PersonC p3 = new PersonC("Zoiro");
		System.out.println(p3.getName());
		p3.setAge(29);
		System.out.println(p3.getAge());
		System.out.println(p3);
		// I am Parameterised Constructor with 1 Parameter
		// Zoiro
		// 29
		// PersonC [name=Zoiro, age=29]

		PersonC p31 = new PersonC(29);
		System.out.println(p31.getName());
		System.out.println(p31.getAge());
		System.out.println(p31);
		// I am Parameterised Constructor with 1 Parameter
		// null
		// 29
		// PersonC [name=null, age=29]

		PersonC p4 = new PersonC("Shahid", 22);
		System.out.println(p4);
		// I am Parameterised Constructor 2 parameter
		// PersonC [name=Shahid, age=22]

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops;

public class Person_Client
{

	public static void main(String[] args)
	{
		Person p1 = new Person();
		// Objects are created in Heap Region
		// p1 refernce is stored in stack i.e in activation record of main
		System.out.println(p1);
		// We have not assigned any values
		// Name : null& Age : 0
		p1.Name = "Shahid Dhariwala";
		p1.age = 22;
		// p1 contains to object created of Person on heap we are then assigning value
		// to it
		System.out.println(p1);
		//Name : Shahid Dhariwala & Age : 22
		
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		// We can make as many objects as we want

		// We can even create Array of References holder of some particular class
		Person building[] = new Person[2];
		//We have created Person object's reference holder in building array 
		
		//Now we need to create object of that class
		building[0] = new Person();
		//This is requeired toi make new Person(); object, else it will throw NullPointer Exception
		// While assigning the value
		building[0].Name = "Luffy";
		building[0].age = 22;
		
		building[1] = new Person();
		building[1].Name = "Zoro";
		building[1].age = 26;

		for (Person s : building)
		{
			System.out.println(s);
		}

		// Name : Luffy & Age : 22
		// Name : Zoro & Age : 26

	}

}

/* https://github.com/shahiddhariwala */
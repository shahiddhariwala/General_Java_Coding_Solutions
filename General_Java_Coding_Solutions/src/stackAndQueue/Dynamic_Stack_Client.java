/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package stackAndQueue;

public class Dynamic_Stack_Client
{

	public static void main(String[] args) throws Exception
	{
		StackA ds = new Dynamic_Stack(5);
		for (int i = 1; i <= 5 ; i++)
		{
			ds.push(i*11);
		}
		ds.display();
		ds.push(111111);
		ds.display();

	}

}



/*https://github.com/shahiddhariwala*/
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Program_To_Reverse_A_Stack
{

	public static void main(String[] args) throws Exception
	{
		StackA s1 = new StackA();
		// SatckA class is inside Stack_Using_Array
		StackA helper = new StackA();
		for (int i = 0; i < 10; i++)
		{
			s1.push((i + 1) * 10);
		}
		s1.display();
		reverseStack(s1, helper, 0);
		s1.display();
		/*
		 * Stack contains
		 * 100
		 * 90
		 * 80
		 * 70
		 * 60
		 * 50
		 * 40
		 * 30
		 * 20
		 * 10
		 * Stack contains
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 * 60
		 * 70
		 * 80
		 * 90
		 * 100
		 * 
		 */
	}

	private static void reverseStack(StackA s1, StackA helper, int index) throws Exception
	{
		if (s1.isEmpty())
		{
			return;
		}

		int item = s1.pop();

		reverseStack(s1, helper, index + 1);
		helper.push(item);
		if (index == 0)
		{
			while (!helper.isEmpty())
			{
				s1.push(helper.pop());
			}
		}

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Dynamic_Stack extends StackA
{

	public Dynamic_Stack() throws Exception
	{
		this(DEFAULT_CAPACITY);
		// Will call our Paramterised constructor with DEFAULT_CAPACITY

	}

	public Dynamic_Stack(int capacity) throws Exception
	{
		super(capacity);
		// Super will call the constructor of our parents Class
		// here it is our StackA and Will initialised the all stuff
	}

	//This is Runtime Polymorphism
	@Override
	void push(int val)
	{
		if (this.size() == this.stackArray.length)
		{
			//if we are at full capacity of our stack
			//Just double the size 
			//
			int tempArray[] = new int[this.size()*2];
			int index=0;
			for(int i : this.stackArray)
			{
				tempArray[index]=i;
				index++;
			}
			this.stackArray=tempArray;
		}
		super.push(val);
		return;
		
	}

}

/* https://github.com/shahiddhariwala */
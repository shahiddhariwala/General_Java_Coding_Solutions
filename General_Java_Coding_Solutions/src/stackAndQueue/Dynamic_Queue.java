/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package stackAndQueue;

public class Dynamic_Queue extends QueueA
{

	public Dynamic_Queue()
	{
		this(DEFAULT_CAPACITY);
	}

	public Dynamic_Queue(int capacity)
	{
		super(capacity);
		
	}
	
	void enqueue(int val) throws Exception
	{
		if(this.size()==this.dataArray.length)
		{
			int tempArray[] = new int[this.size()*2];
			
			for(int i=0;i<=this.size();i++)
			{
				int ai = (i+this.front)%this.size();
				tempArray[i]=this.dataArray[ai];
			}
			this.dataArray=tempArray;
			this.front=0;
		}
		super.enqueue(val);
		
	}
}

/* https://github.com/shahiddhariwala */
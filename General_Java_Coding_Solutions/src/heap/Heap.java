/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package heap;

import java.util.LinkedList;

public class Heap<T extends Comparable<T>>
{

	private LinkedList<T> dataList;

	Heap()
	{
		this.dataList = new LinkedList<T>();
	}

	public void add(T data)
	{
		this.dataList.addLast(data);
		this.upheapify(dataList.size() - 1);

	}

	private void upheapify(int index)
	{
		int parentIndex = (index - 1) / 2;

		T parentData = this.dataList.get(parentIndex);
		T ChildData = this.dataList.get(index);
		if (ChildData.compareTo(parentData) < 0)
		{
			swap(parentIndex, index);
			this.upheapify(parentIndex);
		}
	}

	private void swap(int parentIndex, int index)
	{
		T parentData = this.dataList.get(parentIndex);
		T ChildData = this.dataList.get(index);
		this.dataList.set(index, parentData);
		this.dataList.set(parentIndex, ChildData);
	}

	public T remove()
	{
		T reovedElemnent = this.dataList.getFirst();
		this.swap(0, this.dataList.size() - 1);
		this.dataList.remove(this.dataList.size() - 1);
		this.downHeapify(0);
		return reovedElemnent;
	}

	private void downHeapify(int parentIndex)
	{

		int minIndex = parentIndex;
		int leftChildIndex = (parentIndex * 2) + 1;
		int rightChildIndex = (parentIndex * 2) + 2;

		if (leftChildIndex < this.size()
				&& this.dataList.get(leftChildIndex).compareTo(this.dataList.get(minIndex)) < 0)
		{
			minIndex = leftChildIndex;
		}
		if (rightChildIndex < this.size()
				&& this.dataList.get(rightChildIndex).compareTo(this.dataList.get(minIndex)) < 0)
		{
			minIndex = rightChildIndex;
		}

		if (minIndex != parentIndex)
		{
			swap(minIndex, parentIndex);
			this.downHeapify(minIndex);
		}
	}

	public T peek()
	{
		return this.dataList.getFirst();
	}

	public void display()
	{
		for (T data : this.dataList)
		{
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public int size()
	{
		return this.dataList.size();
	}

}

/* https://github.com/shahiddhariwala */
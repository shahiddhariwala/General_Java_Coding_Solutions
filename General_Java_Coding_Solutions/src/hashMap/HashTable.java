/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package hashMap;

import java.util.LinkedList;

public class HashTable<K, V>
{
	private class HTPair
	{
		K key;
		V value;

		HTPair(K key, V value)
		{
			this.key = key;
			this.value = value;
		}

		// We override the Objects equal method, which earlier use to compare them on
		// the basis of
		// address of object, now we are comparing it with key;
		public boolean equals(Object other)
		{
			HTPair op = (HTPair) other;
			return this.key.equals(op.key);
		}

		public String toString()
		{
			return "{" + this.key + "," + this.value + "}";
		}
	}

	private final static int DEFAULT_CAPACITY = 10;
	private LinkedList<HTPair>[] bucketArray;
	private int size;

	public HashTable()
	{
		this(DEFAULT_CAPACITY);
	}

	public HashTable(int capacity)
	{
		this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
		this.size = 0;
	}

	public void put(K key, V value)
	{
		int bestIndex = getHash(key);
		LinkedList<HTPair> bucket = this.bucketArray[bestIndex];
		HTPair pta = new HTPair(key, value);
		if (bucket == null)
		{
			bucket = new LinkedList<HTPair>();
			bucket.addLast(pta);
			this.bucketArray[bestIndex] = bucket;
			this.size++;
		} else
		{
			// we will use direct chanining
			if(bucket.contains(pta))
			{
				bucket.remove(pta);
				bucket.addLast(pta);
			}else
			{
				bucket.addLast(pta);
				this.size++;
			}
		}
	}
	public void display()
	{
		for(LinkedList<HTPair> bucket : this.bucketArray)
		{
			for(HTPair mapEntry : bucket)
			{
				System.out.print(mapEntry+" ");
			}
		}
		System.out.println();
	}
	

	private int getHash(K key)
	{

		return Math.abs(key.hashCode()) % this.size;
	}
}

/* https://github.com/shahiddhariwala */
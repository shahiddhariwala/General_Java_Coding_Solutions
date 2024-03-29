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
			return "{" + this.key + "=" + this.value + "}";
		}
	}

	private final static int DEFAULT_CAPACITY = 5;
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
			if (bucket.contains(pta))
			{
				bucket.remove(pta);
				bucket.addLast(pta);
			} else
			{
				bucket.addLast(pta);
				this.size++;
			}
		}

		double loadFactor = (this.size * 1.0) / this.bucketArray.length;
		if (loadFactor > 0.75)
		{
			this.rehash();
		}
	}

	private void rehash()
	{
		LinkedList<HTPair>[] oba = this.bucketArray;

		this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[2 * oba.length];

		for (LinkedList<HTPair> list : oba)
		{
			while (list != null && !list.isEmpty())
			{
				HTPair entry = list.removeFirst();
				this.put(entry.key, entry.value);

			}
		}

	}

	public V get(K key)
	{
		int getIndex = getHash(key);
		LinkedList<HTPair> bucket = this.bucketArray[getIndex];
		if (bucket != null && !bucket.isEmpty())
		{

			for (HTPair pair : bucket)
			{
				if (pair.key == key)
				{
					return pair.value;
				}
			}
		}
		return null;
	}

	public V remove(K key)
	{
		int getIndex = getHash(key);
		LinkedList<HTPair> bucket = this.bucketArray[getIndex];
		if (bucket != null && !bucket.isEmpty())
		{

			int count = -1;
			for (HTPair pair : bucket)
			{
				count++;
				if (pair.key == key)
				{
					bucket.remove(count);
					this.size--;
					return pair.value;
				}

			}
		}
		return null;
	}

	public int size()
	{
		return this.size;
	}

	public void display()
	{
		for (LinkedList<HTPair> bucket : this.bucketArray)
		{
			if (bucket != null && !bucket.isEmpty())
			{
				for (HTPair mapEntry : bucket)
				{
					System.out.print(mapEntry + "=>");
				}
				System.out.println("END");
			} else
			{
				System.out.println("NULL");
			}
		}
		System.out.println();
	}

	private int getHash(K key)
	{

		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		return bi;
	}
}

/* https://github.com/shahiddhariwala */
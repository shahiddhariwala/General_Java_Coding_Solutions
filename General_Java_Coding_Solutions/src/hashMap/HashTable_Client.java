/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package hashMap;

public class HashTable_Client
{

	public static void main(String[] args)
	{
		HashTable<String, Integer> ht = new HashTable<String, Integer>();
		ht.put("India", 1);
		ht.put("China", 2);
		ht.put("UAE", 3);
		ht.put("KSA", 4);
		ht.put("UAE", 21);
		ht.put("Africa", 14);
		ht.put("Prague", 32);
		ht.put("Germany", 43);
		ht.display();
		
		
		System.out.println(ht.size());
		System.out.println("----------------------Collision-------------------------");
		ht.put("KSA", 5);
		ht.put("UAE", 7);
		System.out.println(ht.size());
		ht.display();
		
		System.out.println("----------------------Get--------------------------");
		System.out.println(ht.get("KSA"));
		System.out.println(ht.get("India"));
		System.out.println(ht.get("Britain"));
		System.out.println(ht.get("China"));
		System.out.println(ht.get("UAE"));
		
		System.out.println("----------------------Remove--------------------------");
		System.out.println(ht.size());
		System.out.println("Removed "+ht.remove("Germany"));
		System.out.println("Removed "+ht.remove("Japan"));
		System.out.println("Removed "+ht.remove("Germany"));
		System.out.println(ht.size());
		ht.display();

	}

}

/* https://github.com/shahiddhariwala */
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
		HashTable<String, Integer> ht = new HashTable<String, Integer>(4);
		ht.put("India", 1);
		ht.put("China", 2);
		ht.put("UAE", 3);
		ht.display();
		ht.put("KSA", 4);
		ht.display();
		ht.put("UAE", 21);
		ht.put("Africa", 14);
		ht.put("Prague", 32);
		ht.put("Germany", 43);
		ht.put("Sudan", 21);
		ht.put("Argentina", 14);
		ht.put("Peru", 32);
		ht.put("UN", 43);
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
		System.out.println("Removed " + ht.remove("Germany"));
		System.out.println("Removed " + ht.remove("Japan"));
		System.out.println("Removed " + ht.remove("Germany"));
		System.out.println(ht.size());
		ht.display();
		/*
		 * {UAE=3}=>END
		 * NULL
		 * {India=1}=>{China=2}=>END
		 * NULL
		 * 
		 * NULL
		 * NULL
		 * {India=1}=>{China=2}=>END
		 * NULL
		 * {UAE=3}=>{KSA=4}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * 
		 * NULL
		 * NULL
		 * NULL
		 * {Prague=32}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * {Sudan=21}=>END
		 * NULL
		 * NULL
		 * NULL
		 * {Germany=43}=>END
		 * NULL
		 * NULL
		 * NULL
		 * {India=1}=>{China=2}=>END
		 * {Peru=32}=>END
		 * {KSA=4}=>{UAE=21}=>{Argentina=14}=>{UN=43}=>END
		 * {Africa=14}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * 
		 * 24
		 * ----------------------Collision-------------------------
		 * 24
		 * NULL
		 * NULL
		 * NULL
		 * {Prague=32}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * {Sudan=21}=>END
		 * NULL
		 * NULL
		 * NULL
		 * {Germany=43}=>END
		 * NULL
		 * NULL
		 * NULL
		 * {India=1}=>{China=2}=>END
		 * {Peru=32}=>END
		 * {Argentina=14}=>{UN=43}=>{KSA=5}=>{UAE=7}=>END
		 * {Africa=14}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * 
		 * ----------------------Get--------------------------
		 * 5
		 * 1
		 * null
		 * 2
		 * 7
		 * ----------------------Remove--------------------------
		 * 24
		 * Removed 43
		 * Removed null
		 * Removed null
		 * 23
		 * NULL
		 * NULL
		 * NULL
		 * {Prague=32}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * {Sudan=21}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * {India=1}=>{China=2}=>END
		 * {Peru=32}=>END
		 * {Argentina=14}=>{UN=43}=>{KSA=5}=>{UAE=7}=>END
		 * {Africa=14}=>END
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * NULL
		 * 
		 * 
		 */

	}

}

/* https://github.com/shahiddhariwala */
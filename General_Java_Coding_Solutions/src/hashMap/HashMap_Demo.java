/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo
{

	public static void main(String[] args)
	{

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// O(1)
		hm.put("USA", 99);
		hm.put("India", 1);
		hm.put("China", 2);
		hm.put("KSA", 0);
		System.out.println(hm);
		// O(1)
		System.out.println(hm.get("India"));
		System.out.println(hm.get("China"));
		System.out.println(hm.get("IndiaN"));
		hm.put("India", 2);
		System.out.println(hm.get("India"));

		System.out.println(hm);
		System.out.println(hm.containsKey("China"));
		// O(1)
		hm.remove("China");
		System.out.println(hm);
		System.out.println(hm.containsKey("China"));
		System.out.println(hm.containsKey("KSA"));
		System.out.println(hm.size());
		System.out.println(hm.containsValue(1));
		hm.put("UAE", 1);
		System.out.println(hm.containsValue(1));

		System.out.println("*******Keys***********");
		Set<String> set = hm.keySet();
		for (String key : set)
		{
			System.out.println(key);
		}
		/*
		 * {USA=99, China=2, KSA=0, India=1}
		 * 1
		 * 2
		 * null
		 * 2
		 * {USA=99, China=2, KSA=0, India=2}
		 * true
		 * {USA=99, KSA=0, India=2}
		 * false
		 * true
		 * 3
		 * false
		 * true
		 * USA = 99
		 * KSA = 0
		 * UAE = 1
		 * India = 2
		 */

		System.out.println("*******Values***********");
		Collection<Integer> values = hm.values();
		for (Integer v : values)
		{
			System.out.println(v);
		}
		System.out.println("*******EntrySet***********");
		Set<Map.Entry<String, Integer>> entries = hm.entrySet();
		for (Map.Entry<String, Integer> entry : entries)
		{
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		/*
		 * *******Keys***********
		 * USA
		 * KSA
		 * UAE
		 * India
		 ******* Values***********
		 * 99
		 * 0
		 * 1
		 * 2
		 ******* EntrySet***********
		 * USA=>99
		 * KSA=>0
		 * UAE=>1
		 * India=>2
		 */
	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package textProcessing;

public class TriesClient
{

	public static void main(String[] args)
	{
		Tries trie = new Tries();
		trie.add("arts");
		trie.add("art");
		trie.add("bug");
		trie.add("boy");
		trie.add("sea");
		trie.add("seen");
		trie.add("see");
		trie.add("amit");
		trie.display();
		System.out.println(trie.numWords());
		System.out.println("********************************");
		trie.add("art");// checking for duplicates
		trie.display();
		System.out.println(trie.numWords());

		System.out.println("********************************");
		System.out.println(trie.search("art"));
		System.out.println(trie.search("arts"));
		System.out.println(trie.search("arpit"));
		System.out.println(trie.search("artsy"));

		System.out.println("*********************");

		trie.remove("arts");
		trie.remove("art");
		trie.remove("am");
		trie.remove("artse");
		trie.display();

		System.out.println(trie.numWords());

	}

}

/* https://github.com/shahiddhariwala */
/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package functions_1D_2D_Array;

import java.util.ArrayList;

public class Program_Playing_With_ArrayList {

	public static void main(String[] args) {
		// Initialising the ArrayList
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<>();
		// both Allowed
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
//		[]
//		0
//		true
		System.out.println("Adding Value");
		a1.add(22);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
//		Adding Value
//		[22]
//		1
//		false
		a1.add(782);
		a1.add(11);

		System.out.println(a1);
		System.out.println(a1.size());

//      [22, 782, 11]
//      3

		a2.addAll(a1);
		System.out.println(a2);
		a1.add(313);
		System.out.println(a1);
		System.out.println(a2);
//				[22, 782, 11]
//				[22, 782, 11, 313]
//				[22, 782, 11]		
		System.out.println(a1.get(3));
		// 313
		// System.out.println(a2.get(3));
		/*
		 * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out
		 * of bounds for length 3 at
		 * java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
		 * at
		 * java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions
		 * .java:70) at
		 * java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
		 * at java.base/java.util.Objects.checkIndex(Objects.java:372) at
		 * java.base/java.util.ArrayList.get(ArrayList.java:458) at
		 * functions_1D_2D_Array.Program_Playing_With_ArrayList.main(
		 * Program_Playing_With_ArrayList.java:52)
		 * 
		 */
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);

//[22, 782, 11, 313]
//[22, 782, 11]
	}

}

/* https://github.com/shahiddhariwala */
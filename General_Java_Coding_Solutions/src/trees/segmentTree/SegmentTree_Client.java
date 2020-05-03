/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/


package trees.segmentTree;

public class SegmentTree_Client
{

	public static void main(String[] args)
	{
		int arr[] = new int[] {3,8,7,6,-2,-8,4,9};
		SegmentTree st = new SegmentTree(arr);
		st.display();
//				Interval [0,3], data = 24 => 	Interval [0,7], data = 27	 <= Interval [4,7], data = 3
//				Interval [0,1], data = 11 => 	Interval [0,3], data = 24	 <= Interval [2,3], data = 13
//				Interval [0,0], data = 3 => 	Interval [0,1], data = 11	 <= Interval [1,1], data = 8
//				NULL => 						Interval [0,0], data = 3	 <= NULL 
//				NULL => 						Interval [1,1], data = 8	 <= NULL 
//				Interval [2,2], data = 7 => 	Interval [2,3], data = 13	 <= Interval [3,3], data = 6
//				NULL => 						Interval [2,2], data = 7	 <= NULL 
//				NULL => 						Interval [3,3], data = 6	 <= NULL 
//				Interval [4,5], data = -10 => 	Interval [4,7], data = 3	 <= Interval [6,7], data = 13
//				Interval [4,4], data = -2 => 	Interval [4,5], data = -10	 <= Interval [5,5], data = -8
//				NULL => 						Interval [4,4], data = -2	 <= NULL 
//				NULL => 						Interval [5,5], data = -8	 <= NULL 
//				Interval [6,6], data = 4 => 	Interval [6,7], data = 13	 <= Interval [7,7], data = 9
//				NULL => 						Interval [6,6], data = 4	 <= NULL 
//				NULL => 						Interval [7,7], data = 9	 <= NULL 

		System.out.println("Sum of element [2-6] Interval "+st.query(2, 6));
		System.out.println("Sum of element [1-5] Interval "+st.query(1, 5));
	}

}



/*https://github.com/shahiddhariwala*/
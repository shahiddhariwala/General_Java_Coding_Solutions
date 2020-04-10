/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*A religious king wants to build the largest Mosque in his kingdom .
 *  To build the largest Mosque he needs to find the area of the largest suitable land . 
 *  Given co-ordinates which denotes rivers flowing through the point horizontally as well as vertically ,
 *   find the largest area possible to make the grand Mosque.
pic

Input Format
An integer n denoting number of co-ordinates followed by n co-ordinates

Constraints
1 <= N <= 10^5 | Ai | <= 10^9

Output Format
Largest possible area to build the grand Mosque

Sample Input
3
1 1
2 4
5 2
Sample Output
2
Explanation
Area between (2,2), (2,4), (5,2), (5,4)
(For the largest possible region found the area will be calculated from the 
edge next to the left edge, the edge above the bottom edge,
 the topmost edge and the rightmost edge i.e 
 for the region (2,2) , (2,4) , (5,2) , (5,4) 
 the actual area will be considered from (3,2), (3,4), (5,2), (5,4) respectively. Try to draw the diagram and you will realize the modified picture of the area)
*/
package challenging_Programs_On_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program_To_Build_Grand_Mosque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int xArr[] = new int[num];
		int yArr[] = new int[num];
		for (int i = 0; i < num; i++) {
			xArr[i]= sc.nextInt();
			yArr[i]= sc.nextInt();
			
		}
		Arrays.sort(xArr);
		Arrays.sort(yArr);
		int maxDiffX=0;
		int maxDiffY=0;
		for (int i = 0; i < xArr.length-1; i++) {
			if((xArr[i+1]-xArr[i])>maxDiffX)
			{
				maxDiffX = xArr[i+1]-xArr[i];
			}
		}
		for (int i = 0; i < yArr.length-1; i++) {
			if((yArr[i+1]-yArr[i])>maxDiffY)
			{
				maxDiffY = yArr[i+1]-yArr[i];
			}
		}
		System.out.println((maxDiffX-1)*(maxDiffY-1));
		sc.close();

	}

}



/*https://github.com/shahiddhariwala*/
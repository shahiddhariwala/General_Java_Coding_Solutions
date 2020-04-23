/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*Google Tower of Hanoi.

a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.

b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.

Let T1 be the Source Tower, T2 be the Destination Tower and T3 be the Auxillary Tower.

Input Format
Enter the number of discs

Constraints
None

Output Format
Display the steps required to solve the tower and also print the total number of steps required

Sample Input
2
Sample Output
Move 1th disc from T1 to T3
Move 2th disc from T1 to T2
Move 1th disc from T3 to T2
3
*/
package recursion.challenging_Programs_On_Recursion;

import java.util.Scanner;

public class Program_To_Solve_Tower_Hanoi
{
	/*
	 * Approach Discussion
	 * The key to solving a problem recursively is to recognize that it can be
	 * broken down into a collection of smaller sub-problems, to each of which that
	 * same general solving procedure that we are seeking applies, and the total
	 * solution is then found in some simple way from those sub-problems' solutions.
	 * Each of thus created sub-problems being "smaller" guarantees that the base
	 * case(s) will eventually be reached. Thence, for the Towers of Hanoi:
	 * Label the towers A, B, C.
	 * Let n be the total number of disks, number the disks from 1 (smallest,
	 * topmost) to n (largest, bottom-most). Assuming all n disks are distributed in
	 * valid arrangements among the towers; assuming there are m top disks on a
	 * source
	 * tower, and all the rest of the disks are larger than m, so they can be safely
	 * ignored; to move m disks from a source tower to a target tower using a spare
	 * tower,
	 * without violating the rules:
	 * Move m − 1 disks from the source to the spare tower, by the same general
	 * solving procedure. Rules are not violated, by assumption. This leaves the
	 * disk m as a top disk on the source tower. Move the disk m from the source to
	 * the target tower, which is guaranteed to be a valid move, by the assumptions
	 * —
	 * a simple step. Move the m − 1 disks that we have just placed on the spare,
	 * from the spare to the target tower by the same general solving procedure, so
	 * they are placed on top of the disk m without violating the rules. The base
	 * case being to move 0 disks (in steps 1 and 3), that is, do nothing – which
	 * obviously doesn't violate the rules.
	 */
	public static int count = 0;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numDiscs = sc.nextInt();
		// Way1
		solveTowerOfHanoi(numDiscs, 1, 3, 2);
		System.out.println(count);
		// Way 2
		towersOfHanoi(numDiscs, 'A', 'B');
		sc.close();
		/*
		 * 3
		 * Move 1 disc from T1 to T2
		 * Move 2 disc from T1 to T3
		 * Move 1 disc from T2 to T3
		 * Move 3 disc from T1 to T2
		 * Move 1 disc from T3 to T1
		 * Move 2 disc from T3 to T2
		 * Move 1 disc from T1 to T2
		 * 7
		 */

	}

	// Way 1
	private static void solveTowerOfHanoi(int numDiscs, int sourceTower, int auxillaryTower, int destinationTower)
	{

		if (numDiscs > 0)
		{
			count++;
			solveTowerOfHanoi(numDiscs - 1, sourceTower, destinationTower, auxillaryTower);
			System.out.printf("Move %d disc from T%d to T%d\n", numDiscs, sourceTower, destinationTower);
			solveTowerOfHanoi(numDiscs - 1, auxillaryTower, sourceTower, destinationTower);

		}
	}

	// way 2
	static void towersOfHanoi(int n, char source, char dest)
	{
		if (n == 0)
			return;

		char temp = (char) ('A' + 'B' + 'C' - source - dest);

		// Move N-1 disks from source to temp
		towersOfHanoi(n - 1, source, temp);

		// Move Nth disk from source to dest
		System.out.println("Moving ring " + n + " from " + source + " to " + dest);

		// Move N-1 disks from temp to dest
		towersOfHanoi(n - 1, temp, dest);
	}

}

/* https://github.com/shahiddhariwala */
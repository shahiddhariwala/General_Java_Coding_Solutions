/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

/*We are given a circular array, print the next greater number for every element. If it is not found print -1 for that number. To find the next greater number for element Ai , start from index i + 1 and go uptil the last index after which we start looking for the greater number from the starting index of the array since array is circular.

Input Format
First line contains the length of the array n. Second line contains the n space separated integers.

Constraints
1 <= n <= 10^6
-10^8 <= Ai <= 10^8 , 0<= i< n

Output Format
Print n space separated integers each representing the next greater element.

Sample Input
3
1 2 3
Sample Output
2 3 -1
Explanation
Next greater element for 1 is 2,
for 2 is 3 but not present for 3 therefore -1
*/
package challenging_Programs_On_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Program_To_Find_Next_Greater_Element
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		printNextGreaterElements(arr);
		sc.close();
	}

	/*
	 * This approach makes use of a stack. This stack stores the indices of the
	 * appropriate elements from nums array. The top of the stack refers to the
	 * index of the Next Greater Element found so far. We store the indices instead
	 * of the elements since there could be duplicates in the nums array. The
	 * description of the method will make the above statement clearer.
	 * 
	 * We start traversing the nums array from right towards the left. For an
	 * element nums[i] encountered, we pop all the elementsstack[top] from the stack
	 * such that nums[stack[top]] ≤ nums[i]. We continue the popping till we
	 * encounter a stack[top] satisfying nums[stack[top]]>nums[i]. Now, it is
	 * obvious that the current stack[top] only can act as the Next Greater Element
	 * for nums[i](right now, considering only the elements lying to the right of
	 * nums[i]).
	 * 
	 * If no element remains on the top of the stack, it means no larger element
	 * than nums[i] exists to its right. Along with this, we also push the index of
	 * the element just encountered(nums[i]), i.e. ii over the top of the stack, so
	 * that nums[i](or stack[topstack[top) now acts as the Next Greater Element for
	 * the elements lying to its left.
	 * 
	 * We go through two such passes over the complete nums array. This is done so
	 * as to complete a circular traversal over the nums array. The first pass could
	 * make some wrong entries in the res array since it considers only the elements
	 * lying to the right of nums[i], without a circular traversal. But, these
	 * entries are corrected in the second pass
	 */
	private static void printNextGreaterElements(int[] arr)
	{
		Stack<Integer> stack = new Stack<Integer>();

		int ans[] = new int[arr.length];
		for (int i = arr.length-1 ; i >=0;i--)
		{

			if(!stack.isEmpty() && arr[stack.peek()]>arr[i])
			{
				ans[i]=arr[stack.peek()];
			}
			else if(!stack.isEmpty())
			{
				while(arr[stack.peek()]<=arr[i])
				{
					stack.pop();
				}
			}
			else
			{
				ans[i]=-1;
			}
			stack.push(i);
		}

		for (int i = arr.length-1 ; i >=0;i--)
		{

			if(!stack.isEmpty() && arr[stack.peek()]>arr[i])
			{
				ans[i]=arr[stack.peek()];
			}
			else if(!stack.isEmpty())
			{
				while(arr[stack.peek()]<=arr[i])
				{
					stack.pop();
				}
			}
			else
			{
				ans[i]=-1;
			}
			stack.push(i);
		}
		
		
		for (int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i]+" ");
			
		}

	}

}

/* https://github.com/shahiddhariwala */
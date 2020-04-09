/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/
/*
Sanju needs your help! He gets a list of employees with their salary. The maximum salary is 100.

Sanju is supposed to arrange the list in such a manner that the list is sorted in decreasing order of salary. And if two employees have the same salary, they should be arranged in lexicographical manner such that the list contains only names of those employees having salary greater than or equal to a given number x.

Help Sanju prepare the same!

Input Format
On the first line of the standard input, there is an integer x. The next line contans integer N, denoting the number of employees. N lines follow, which contain a string and an integer, denoting the name of the employee and his salary.

Constraints
1 <= N <= 10^5 1 <= | Length of the name | <= 100 1 <= x, salary <= 100

Output Format
You must print the required list.

Sample Input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86
Sample Output
Bob 99
Alice 86
Suzy 86
*/
package challenging_Programs_On_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Employee implements Comparable<Employee>
{
	int salary;
	String name;
	public Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return name+" "+salary;
		
	}
	@Override
	public int compareTo(Employee o) {
		
		if(this.salary>o.salary)
		{
			return -1;
		}
		else if(this.salary<o.salary)
		{
			return 1;
		}
		else
		{
			return this.name.compareTo(o.name);
		}
	}
}
public class Program_On_Sort_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int numCases = sc.nextInt();sc.nextLine();
		ArrayList<Employee> emp = new ArrayList<Employee>();
		for (int i = 1; i <= numCases; i++) {
			String temp[] = sc.nextLine().split(" ");
			String name = temp[0];
			int salary = Integer.parseInt(temp[1]);
			emp.add(new Employee(name,salary));
		}
		Collections.sort(emp);
		for(Employee e : emp)
		{
			if(e.salary >= x)
			{
				System.out.println(e);
			}
		}
		sc.close();
		

	}

}



/*https://github.com/shahiddhariwala*/
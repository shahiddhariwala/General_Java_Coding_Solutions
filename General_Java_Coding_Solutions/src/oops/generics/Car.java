/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
*/

package oops.generics;

public class Car implements Comparable<Car>
{

	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color)
	{
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString()
	{
		return "{ S:" + this.speed + ", P:" + this.price + ", C:" + this.color + "}";
	}

	@Override
	public int compareTo(Car other)
	{
		
		return other.price-this.price;
	}
}

/* https://github.com/shahiddhariwala */
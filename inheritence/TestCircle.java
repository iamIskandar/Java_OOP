import java.io.*;
import java.util.*;

class Circle
{
	private double radius;
	public Circle(double _radius)
	{
		radius=_radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
}
class B extends Circle
{
	private double length;

	public B(double radius, double _length)
	{
		super(radius);
		length=_length;
	}
	public double getArea()
	{
		return super.getArea()*length;
	}
}
public class TestCircle
{
	public static void main(String[] args)
	{
		Circle bulatan=new Circle(4.5);
		System.out.printf("Area of circle :%.3f",bulatan.getArea());
		System.out.println();

		B objB=new B(2.0,4.2);
		System.out.printf("Area of B :%.3f",objB.getArea());
		System.out.println();
	}
}
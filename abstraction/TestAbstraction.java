abstract class Shape
{
	Shape()
	{
		System.out.println("default constructor shape");
	}
	abstract void draw();
}

class Rectangle extends Shape{

	void draw()
	{
	  System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class TestAbstraction
{
	public static void main(String[] args)
	{
		Shape s=new Circle();
		Shape s1=new Rectangle();
		s.draw();
		s1.draw();
	}
}
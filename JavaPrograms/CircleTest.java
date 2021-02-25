class Circle
{
	private double radius;
	private String color;


public Circle()
	{
		radius=1.0;
		color="red";
	}

	public Circle(double r)
	{
		radius=r;
		color="red";

	}

	public Circle(double r, String c)
	{
		radius=r;
		color=c;
	}


	public double getRadius()
	{
		return radius;
	}

	public String getColor()
	{
		return color;
	}

	public double getArea()
	{
		return 3.142*radius*radius;
	}


}

public class CircleTest
{
	public static void main(String[] args)
	{
		Circle c1=new Circle(2.0,"blue");
		Circle c2=new Circle(2.0);
		Circle c3=new Circle();


		System.out.println("//c1");
		System.out.println("The radius is : "+c1.getRadius());
		System.out.println("The color is : "+c1.getColor());
		System.out.printf("The area is   : "+String.format("%.2f",c1.getArea()));

 			System.out.println("\n\n");
		System.out.println("//c2");
		System.out.println("The radius is : "+c2.getRadius());
		System.out.println("The color is : "+c2.getColor());
		System.out.println("The area is : "+String.format("%.2f",c2.getArea()));


		 System.out.println("\n\n");
        System.out.println("//c3");
		System.out.println("The radius is : "+c3.getRadius());
		System.out.println("The color is : "+c3.getColor());
		System.out.println("The area is : "+String.format("%.2f",c3.getArea()));



	}
}

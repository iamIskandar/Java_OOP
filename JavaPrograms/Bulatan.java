class circle
{
	private double radius;
	private String color;


	public circle()
	{
		radius=1.0;
		color="red";

	}

	public circle(double r)
	{
		radius=r;
		color="red";
	}

	public circle(double r,String c )
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

public class Bulatan
{
	public static void main(String[] args)
	{
		circle c1=new circle(2.0,"blue");
		circle c2=new circle(2.0);
		circle c3=new circle();


		System.out.print("//c1");
		System.out.println("The radius is : "+c1.getRadius());
		System.out.println("The color is : "+c1.getColor());
		System.out.printf("The area is : " +String.format("%.2f",c1.getArea()));



		System.out.print("\n\n");
		System.out.print("//c2");
		System.out.println("The radius is : "+c2.getRadius());
		System.out.println("The color is : "+c2.getColor());
		System.out.printf("The area is : " +String.format("%.2f",c2.getArea()));



		System.out.print("\n\n");
		System.out.print("//c3");
		System.out.println("The radius is : "+c3.getRadius());
		System.out.println("The color is : "+c3.getColor());
		System.out.printf("The area is :  "+String.format("%.2f",c3.getArea()));


	}

	
}



class shape
{
	private double area;

	public void setArea(double a)
	{
		area=a;
	}
	protected double getArea()
	{
		return area;
	}
}

class circle extends shape
{
	private double radius;

	public void setRadius(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
}

public class TestShape
{
	public static void main(String[] args)
	{
		shape s=new shape();
		circle c=new circle();

		c.setRadius(10.0);
		//s.setRadius(10.0);
		System.out.println(c.getArea());
		System.out.println(s.getArea());
		//System.out.println(s.getRadius());
		c.setRadius(10.0);
	}
}

class Rectangle
{
	private double width;
	private double length;

	Rectangle(double _w, double _i)
	{
		width=_w;
		length=_i;
	}
	protected double calculateArea()
	{
		return width*length;
	}
	public void display()
	{
		System.out.println("Width  : "+width);
		System.out.println("Length : "+length);
	}
}

class Square extends Rectangle
{
	 double height;
	public Square()
	{
	   super(10.0,15.0);
		height=10;
	}

	public double calculateVolume()
	{
		return height*super.calculateArea();
	}
	public void display()
	{
		super.display();
		System.out.println("height : "+height);
		System.out.println("volume : "+calculateVolume());
	}
}
public class TestShape2
{
	public static void main(String[] args)
	{
		Square squarebox=new Square();
		Rectangle rect=new Rectangle(20.5,15.7);
		rect.display();
		squarebox.display();
	}
}


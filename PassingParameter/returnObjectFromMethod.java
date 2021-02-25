class cube
{
	private double side;
	private double volume;


	cube(double s)
	{
		side=s;
	}

	public cube getObject()
	{
		cube obj=new cube(side);
		volume=side*side*side;

		//obj.volume=volume;
		return obj;
	} 

	public double getVolume()
	{
		return this.side*this.side*this.side;
	}

	public double getSide()
	{
		return this.side;
	}
}

public class returnObjectFromMethod
{
	public static void main(String[] args)
	{
		cube obj1=new cube(10);
		cube obj2;

		obj2=obj1.getObject();


		System.out.println("# Object 1");
		System.out.println("Volume : "+obj1.getVolume());


		System.out.println();
		System.out.println("# Object 2");
		System.out.println("Volume : "+obj2.getVolume());

	}
}





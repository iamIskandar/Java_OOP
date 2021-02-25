class Box
{
	double width, height, depth;

	 Box(Box b)
	{
		width=b.width;
		height=b.height;
		depth=b.depth;
	}


	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}

	double getVolume()
	{
		return height*width*depth;
	}

}

public class passingParameterObject2
{
	public static void main(String[] args)
	{
		Box mybox=new Box(10,20,15);

		Box myclone=new Box(mybox);

		double vol;

		vol=mybox.getVolume();
		System.out.println("Volume of my box is "+vol);

		vol=myclone.getVolume();
		System.out.println("Volume of my myclone is "+vol);
	}
}

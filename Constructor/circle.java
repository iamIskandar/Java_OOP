class circle
{
	double radius;
	String color;
	final double PI=3.142;


	circle()
	{
		radius=1.0;
		color="red";
	}

	circle(double r)
	{
		radius=r;
		color="red";
	}

	circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
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
		return (PI*radius*radius);
	}

	public static void main(String[] args) {

		circle c1=new circle(2.0,"Blue");
		circle c2=new circle(2.0);
		circle c3=new circle();


		System.out.println("//c1");
		System.out.println("The radius is : "+c1.getRadius());
		System.out.println("The color is : "+c1.getColor()+"\n\n");

		System.out.println("//c2");
		System.out.println("The radius is : "+c2.getRadius());
		System.out.println("The color is : "+c2.getColor()+"\n\n");



		System.out.println("//c3");
		System.out.println("The radius is : "+c3.getRadius());
		System.out.println("The color is : "+c3.getColor()+"\n\n");



	}
}
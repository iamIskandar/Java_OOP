class outer
{
	static String name ="Iskandar";

	static class nested
	{
		public void print()
		{
			System.out.println("From static class => "+name);
		}
	}

	class inner
	{
		public void display()
		{
			System.out.println("From non static class => "+name);
		}
	}
}

public class Final
{
	public static void main(String[] args)
	{
		outer.nested obj=new outer.nested();
		obj.print();

		outer.inner obj1=new outer().new inner();
		obj1.display();

		
	}
}
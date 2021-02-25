class Outer
{
	static String name="Iskandar";

	static class Nested
	{
		public void disp()
		{
			System.out.println("From static => "+name);
		}
	}


	class innner
	{
		public void disp()
		{
			System.out.println("From  non-static => "+name);
		}
	}
}


public class Main
{
	public static void main(String[] args)
	{
		Outer.Nested obj=new Outer.Nested();
		obj.disp();

		//Outer.innner obj2=new Outer(). new innner();
		//Outer.innner obj2=new Outer().new innner();
		Outer.innner obj2=new Outer().new innner();
		obj2.disp();
	}
}
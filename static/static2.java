class staticMethod
{
	static int x=0;

	staticMethod()
	{
		x++;
	}
}


public class static2{
	public static void main(String[] args)
	{
		//x++;
		staticMethod obj=new staticMethod();
		System.out.println("x is now is "+staticMethod.x);
	}
}

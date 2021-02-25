class A
{

	public A()
	{
		System.out.println("Default Constructor A is invoked");
	}
	public A(String x)
	{
		System.out.println(x);
		//System.out.println();
	}

}

class B extends A
{

	public B()
	{
		this("Another constructor of B is invoked");
		System.out.println("Default Constructor of B is invoked\n");
	}

	public B (String s)
	{
		System.out.println(s);
		//System.out.println();
	}
	public B(String x, String s)
	{
		super(x);
		System.out.println(s);
	}
}
public class Test1
{
	public static void main(String[] args)
	{
		System.out.println("Object b1 is created");
		System.out.println("--------------------");
		B b1=new B();

		System.out.println("object a1 is created");
		System.out.println("--------------------");
		A a1=new A();

		System.out.println("\nobject b2 is created");
		System.out.println("--------------------");
		B b2=new B("Thank You");

		System.out.println("\nobject b3 is created");
		System.out.println("--------------------");
		B b3=new B("Thank you","come again");
		//A a2=new A("Thank You");
	}
}



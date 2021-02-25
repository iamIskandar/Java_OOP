class B
{
	public void p(int i)
	{
		System.out.println(i+" in class B");
	}
}

class A extends B
{
	public void p(double i)
	{
		System.out.println(i+ " in class A");
	}
}
public class TestClass2
{
	public static void main(String[] args)
	{
		A a=new A();
		a.p(10);
		//a.p(5.5);
	}
}
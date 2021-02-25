class SuperClass3
{
	public void showValue(int a)
	{
		System.out.println(a);
	}
	public void showValue(String a)
	{
		System.out.println(a);
	}
}

class Subclass3 extends SuperClass3
{
	public void showValue(int ar)
	{
		System.out.println("The subclass : "+ar);
	}
	public void showValue(double a)
	{
		System.out.println(a);
	}
}
public class ShowValueDemo
{
	public static void main(String[] args)
	{
		Subclass3 obj=new Subclass3();
		obj.showValue(8);
		obj.showValue(6.5);
		obj.showValue("Test");
	}
}

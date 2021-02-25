
class ClassA
{
	public ClassA()
	{
		System.out.println("A says HI!!!");
	}

	public void method1(int a)
	{
		System.out.println(a);
	}
	public void method2()
		{
			System.out.println("it works");
	    }
}


class ClassB extends ClassA
{
	public ClassB()
	{
		System.out.println("B Says HI!!!");
	}

	public void method1(int b)
	{
		System.out.println("Class B Method 1  b:"+b);
	}
}
class ClassC extends ClassB
{
	 public ClassC()
	 {
	 	System.out.println("C Says HI!!!");
	 }
	
	public void method1(){System.out.println("Class C Method 1!!");}
}

public class TestMethod
{
	public static void main(String[] args)
	{
		//ClassA a=new ClassB();
		//a.method1(5);

		ClassB b=new ClassC();
		b.method1(5);

	}
}

interface inf1
{
	public void method1();
}
interface inf2 
{
	public void method2();
}
 class Demo implements inf1,inf2{

	public void method1(){System.out.println("method1");}
	public void method2(){System.out.println("method2");}
}

public class interfaceAndInheritance
{
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		obj.method1();
		obj.method2();
	}
}
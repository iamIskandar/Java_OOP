
class ClassA
{
	public ClassA(){}
	public void method1(){System.out.println("A says hi!!!");}
}
class ClassB extends ClassA
{
	public ClassB(){}
	public void method1(int a){System.out.println(a);}
}
class ClassC extends ClassB
{
	public ClassC(){}

	public void method1(){System.out.println("C says hi!!!");}
}
public class TestMethod2
{
	public static void main(String[] args)
	{
		ClassA item1=new ClassC();
		//item1.method1();

		ClassB item2=new ClassC();
		item2.method1();

		ClassB item3=new ClassC();
		item3.method1(5);
	}
}
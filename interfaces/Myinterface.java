interface MyinterfaceDemo
{
	public void method1();
	public void method2();
}
class Demo implements MyinterfaceDemo{

	public void method1(){
		System.out.println("implementation of method1");
	}

	public void method2(){
		System.out.println("implementation of metohd2");
	}
}
public class Myinterface
{
	public static void main(String[] args) {

		MyinterfaceDemo obj=new Demo();
		obj.method1();
		obj.method2();
	}
}

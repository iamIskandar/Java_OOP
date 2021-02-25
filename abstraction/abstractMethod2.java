abstract class Sum
{
	Sum()
	{
	 System.out.println("default constructor");
	}
	public abstract int SumofTwo(int n1, int n2);
	public abstract int SumofThree(int n1, int n2, int n3);

	public void disp()
	{
		System.out.println("Method of class Sum");
	}
}
class Demo extends Sum
{
	public int SumofTwo(int num1, int num2)
	{
		return num1+num2;
	}
	public int SumofThree(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
}

public class abstractMethod2
{
	public static void main(String[] args)
	{
		Sum obj=new Demo();
		System.out.println(obj.SumofTwo(3,7));
		System.out.println(obj.SumofThree(3,7,10));
	}
}



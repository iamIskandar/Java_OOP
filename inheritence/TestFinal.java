class Final
{
	int a=60;

	public void sum()
	{
		int total=a+80;
		System.out.println("total in class Final : "+total);
	}
}

class Final1 extends Final
{
	int a=70;

	public void sum()
	{
		int total =a+super.a+80;
		System.out.println("total in class Final1 : "+total);
	}
}

public class TestFinal
{
	public static void main(String[] args)
	{
		Final obj=new Final();
		Final1 obj1=new Final1();
		obj.sum();
		obj1.sum();
	}
}
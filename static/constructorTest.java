class Test
{
	private int x;
	String name;


	Test()
	{
		x=5;
		name="iskay";
	}

	Test(int x, String n)
	{
		this.x=x;
		this.name=n;
	}

	Test(int x)
	{
		this.x=x;
		name="Mahmud";
	}



	Test(String n)
	{
		x=100;
		this.name=n;

	}



	public void print()
	{
		System.out.println("Name => "+name);
		System.out.println("Age => "+x);
		System.out.println();
	}
}

public class constructorTest
{
	public static void main(String[] args) {

		Test t1=new Test();
		Test t2=new Test(22,"hilman");
		Test t3=new Test(10);
		Test t4=new Test("Anak cina");
		//Test t5=new Test();


		t1.print();
		t2.print();
		t3.print();
		t4.print();
		//t5.print();
	}
}
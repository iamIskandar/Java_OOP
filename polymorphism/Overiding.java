class Parent
{
	void print()
	{
		System.out.println("Parent class");
	}
}

class subclass1 extends Parent
{
	void print()
	{
		System.out.println("Subclass1");
	}
}

class subclass2 extends Parent
{
	void print()
	{
		System.out.println("subclass2");
	}
}
public class Overiding
{
	public static void main(String[] args)
	{
			Parent obj=new subclass1();
			obj.print();

			Parent obj1=new subclass2();
			obj1.print();
			

			//Parent obj=new Parent();
			//obj.print();
	}
}
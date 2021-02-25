class Parent
{
	void display()
	{
		System.out.println("Parent class");
	}
}
class child1 extends Parent
{
	void display()
	{
		System.out.println("Child 1 - subclass1");
	}
}
class child2 extends Parent
{
	void display()
	{
		System.out.println("Child 2 - subclass2");
	}
}
public class MethodOverriding
{
	public static void main(String[] args)
	{
		Parent a;
		a=new child1();
		a.display();

		a=new child2();
		a.display();
	}
}
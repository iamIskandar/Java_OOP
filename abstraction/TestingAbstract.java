abstract class Car
{
	public abstract void speed();

}

abstract class Motor
{
	abstract void speed();
}

public class TestingAbstract extends Car
{
	public static void main(String[] args)
	{
		TestingAbstract t=new TestingAbstract();
		t.speed();
	}
}


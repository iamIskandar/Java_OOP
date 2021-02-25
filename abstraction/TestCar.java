abstract class Car
{
	abstract void run();
}

class Honda extends Car
{
	void run()
	{
		System.out.println("Running safely");
	}
}

class Viva extends Car
{
	void run()
	{
		System.out.println("Running smoothly");
	}
}

public class TestCar
{
	public static void main(String[] args) 
	{
		Honda h=new Honda();
		h.run();
	}
}
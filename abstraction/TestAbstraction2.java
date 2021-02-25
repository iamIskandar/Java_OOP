//example of an abstract class that has abstract and non abstract methods

abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is created");
	}

	abstract void run();
	
	void changeGear()
	{
		System.out.println("Gear changed");
	}	 
}
//creating a child class whic inherits Abstract class

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running safely...");
	}
}
//creating a test class which calls abstract and non abstract methods

public class TestAbstraction2
{
	public static void main(String[] args) 
	{
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();	
	}
}
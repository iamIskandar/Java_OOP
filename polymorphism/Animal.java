class AnimalParent
{
	public void sound1()
	{
		System.out.println("Animal is making sound");
	}
}

class Horse extends AnimalParent
{
	public void sound()
	{
		System.out.println("Horse is making sound");
	}
}
class Pig extends AnimalParent
{
	public void sound()
	{
		System.out.println("Pig is making sound");
	}
}
public class Animal{
	public static void main(String[] args) {

		AnimalParent obj=new Horse();
		AnimalParent obj1=new AnimalParent();
		obj.sound1();
		obj.sound();
	}
}
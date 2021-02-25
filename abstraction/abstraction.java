abstract class Bike{

	public  abstract void run();
	public  static void print()
	{
		System.out.println("hola");
	}
}
class Honda extends Bike{

	public void run(){
		System.out.println("Running safely");
	}
}

class Test 
{
	public static  void pamer()
	{
		System.out.println("maira");
	}
}

public class abstraction{

	public static void main(String[] args) {
		Bike obj=new Honda();
		//Bike obj1=new Bike();
		obj.run();
		obj.print();
		Bike.print();
		Test.pamer();

	}
}


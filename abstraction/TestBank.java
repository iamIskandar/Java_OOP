abstract class Bank
{
	Bank()
	{
		System.out.println("Default");
	}

	Bank(int a, int b)
	{
		System.out.println(a+b);
	}
	abstract int getRateOfInterest();
}

class Cimb extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class Affin extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}

public class TestBank
{
	public static void main(String[] args)
	{
		//Bank b=new Bank(4,5);

		Bank b=new Cimb();
		System.out.println("Rate of Cimb Interest is "+b.getRateOfInterest()+" %");

		b=new Affin();
		System.out.println("Rate of Affin Interest is "+b.getRateOfInterest()+" %");
	}
}
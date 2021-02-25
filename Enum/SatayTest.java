
enum Satay
{
	MUTTON,OSTRICH,CHICKEN,BEEF;
}

public class SatayTest
{
	Satay satei;

	public SatayTest(Satay satei)
	{
		this.satei=satei;
	}

	public void Order()
	{
		switch(satei)
		{
			case MUTTON : System.out.println("Mutton satay - Fabulous");
						  System.out.println("Price is RM 0.60/each");
						  break;
		    case OSTRICH:System.out.println("Ostrich satay - Low cholestrol diet");
						  System.out.println("Price is RM 1.00/each");
						  break;
			case CHICKEN: System.out.println("Chicken satay - Family favourites");
						  System.out.println("Price is RM 0.70/each");
						  break;
			case BEEF  :  System.out.println("Beef satay - Grandma loves it");
						  System.out.println("Price is RM 0.80/each");
						  break;
			default    : System.out.println("Wrong choice");
			             break;
		}
	}

	public static void main(String[] args)
	{
		SatayTest obj=new SatayTest(Satay.CHICKEN);
		obj.Order();

	}
}
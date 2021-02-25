enum Hari
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

public class enum4
{
	Hari day;

	enum4(Hari day)
	{
		this.day=day;
	}

	public void print()
	{
		switch(day)
		{
			case MONDAY: System.out.println("Mondays are bad.");
			             break;
			case FRIDAY: System.out.println("Fridays are better.");
			             break;
		  case SATURDAY:
		   case SUNDAY : System.out.println("Weekends are best.");
			             break;
			   default : System.out.println("Midweek days are so-so.");
                         break;

		}
	}

	public static void main(String[] args)
	{
		//String str="MONDAY";
		enum4 t=new enum4(Hari.MONDAY);
		t.print();
	}
}

enum Day
{
	MONDAY,WEDNESDAY,FRIDAY;
}

public class enum{

	public static void main(String[] args) {
		
		Day obj=Day.FRIDAY;


		switch(obj)
		{
			case MONDAY:System.out.println("Argh shit here we go again");
			            break;

			case WEDNESDAY:System.out.println("Hari koko sedunia");
			               break;

			case FRIDAY:System.out.println("Orang islam sembahyang jumaat");
			               break;

			 default:System.out.println("Anak indonesia");
			               break;


		}
	}
}
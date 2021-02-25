import java.util.*;
enum Day
{
	MONDAY,WEDNESDAY,FRIDAY;
}

public class enum1{

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		System.out.print("Chhose a day (MONDAY,WEDNESDAY,FRIDAY) => ");
		String answer=input.nextLine().toUpperCase();

		Day obj=Enum.valueOf(Day.class,answer);




		switch(obj)
		{
			case MONDAY:System.out.println("\nYou have Choosen => "+answer+"\n"+"Description is Argh shit here we go again");
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
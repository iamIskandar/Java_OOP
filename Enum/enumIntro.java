import java.util.*;

enum day
{
	MONDAY,WEDNESDAY,FRIDAY;
}

public class enumIntro
{
	public static void main(String[] args)
	{
		day hari=day.WEDNESDAY;
		System.out.println(hari);
		System.out.println();
		System.out.println();
		System.out.println();

		for(day hari1:day.values())
		{
			System.out.println(hari1);
		}
	}
}
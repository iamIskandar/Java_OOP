import java.util.*;


enum Size
{
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL"),
	EXTRALARGE("NOT FOUND ");


	private String abbv;

	private Size(String abbv)
	{
		this.abbv=abbv;
	}

	public String getAbbv()
	{
		return abbv;
	}
}

public class EnumTest
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter a size : (SMALL,MEDIUM,LARGE,EXTRA_LARGE) => ");

		String input=read.nextLine().toUpperCase();

		Size saiz=Enum.valueOf(Size.class,input);

		System.out.println("\n\n"+"Size => "+saiz);
		System.out.println("Abbreviation => "+saiz.getAbbv());

		if(saiz==Size.EXTRA_LARGE)
		{
			System.out.println("Good job-- you paid attention to the '_' Symbol");
		}
		else if(saiz==Size.EXTRALARGE)
		{
			System.out.println("You skip the '_' symbol");
		}
	}
}
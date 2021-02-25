
enum Levels
{
	TOP,MEDIUM("Beshe beshe"),BOTTOM("Gila","Noob");

	String i,j;


	Levels(String i)
	{
		this.i=i;
	}

	Levels(String i, String j)
	{
		this.i=i;
		this.j=j;
	}

	Levels(){}

}

public class enum2
{
	public static void main(String[] args)
	{
		System.out.println("Levels.TOP.i => "+Levels.TOP.i);
		System.out.println("Levels.TOP.j => "+Levels.TOP.j+"\n\n");

		System.out.println("Levels.MEDIUM.i => "+Levels.MEDIUM.i);
		System.out.println("Levels.TOP.j => "+Levels.TOP.j+"\n\n");

		System.out.println("Levels.BOTTOM.i => "+Levels.BOTTOM.i);
		System.out.println("Levels.BOTTOM.j => "+Levels.BOTTOM.j);


	}
}
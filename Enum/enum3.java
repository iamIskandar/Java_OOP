
enum Design
{
	HTML("basic"),CSS("graphic"),JAVASCRIPT("advanced"),BOOTSTRAP("Framework");


	String desc;

	Design(String desc)
	{
		this.desc=desc;
	}
}

public class enum3
{

	public static void main(String[] args)
	{

		System.out.println("HTML => "+Design.HTML.desc);

		System.out.println("CSS => "+Design.CSS.desc+"\n\n");

		System.out.println("Javascript=> "+Design.JAVASCRIPT.desc);

		System.out.println("Bootstrap => "+Design.BOOTSTRAP.desc+"\n\n");



	}
}
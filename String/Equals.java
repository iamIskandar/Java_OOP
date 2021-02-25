
class Equals
{
	public static void main(String[] args)
	{
		String s1=new String("Selamat");
		String s2=new String("Selamat");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		if(s1.equals(s2))
		{
			System.out.println("Same la");
		}

	}
}
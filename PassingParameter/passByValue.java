class passByValue
{

	public  static void change(int x)
	{
		x+=x;
	}



	public static void main(String[] args)
	{
		int x=5;
		change(x);
		System.out.println(x);

	}
}
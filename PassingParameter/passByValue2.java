class passByValue2
{
	int x;
	passByValue2(int i)
	{
		this.x=i;
	}



	public static void change(passByValue2 t)
	{
		t.x+=t.x;
	}

	public static void main(String[] args)
	{
		passByValue2 t=new passByValue2(5);
		System.out.println("X before change => "+t.x);
		change(t);

		System.out.println("X after change => "+t.x);
	}
}
class T
{
	static int i=0;
	int j=5;

	T()

	{
		i++;
		//j++;
	}



	public static void main(String[] args)
	{
		T t1=new T();
		System.out.println("t1's static i = "+i);
		System.out.println("\ninstance j = "+j);
	}
}


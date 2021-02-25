class Demo
{
	int a;

	Demo(int i)
	{
		this.a=i;
	}

	public  void incrementBy10(Demo obj)
	{
		this.a+=10;
	}


	public static void main(String[] args)
	{
		Demo obj=new Demo(10);
		System.out.println(obj.a);

		obj.incrementBy10(obj);
		obj.incrementBy10(obj);

		System.out.println(obj.a);

	}
}
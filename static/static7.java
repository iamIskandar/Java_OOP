class static7
{
	static int i=100;
	static String nama="Irfan Iskandar";


	//static method
	static void disp()
	{
		System.out.println("i : "+i);
		System.out.println("nama : "+nama+"\n\n");

	}

	//non static method

	void func()
	{
		disp();
	}

	public static void main(String[] args) {
		
		static7 obj=new static7();

		obj.func();

		disp();

	}

}
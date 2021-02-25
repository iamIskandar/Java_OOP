class static4
{
	static int num1,num2;
	static String mystr1,mystr2;

	static
	{
		System.out.println("hi static");
		 num1=50;
		mystr1="First static";
	}

	static
	{
		System.out.println("hi static 2");
		 num2=100;
		mystr2="second static";
	}

	public static void main(String[] args)
	{

		System.out.println("Value of num is "+num1);
		System.out.println("Value of string is "+mystr1);


		System.out.println("Value of num is "+num2);
		System.out.println("Value of string is "+mystr2);
	}
}
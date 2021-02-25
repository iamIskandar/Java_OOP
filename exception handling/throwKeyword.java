class throwKeyword
{
	static void checkEligibility(int age, int weight)
	{
		if(age<21&&weight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else
		{
			 System.out.println("Student Entry is Valid!!");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Registration process!!");
		checkEligibility(10, 39);
		System.out.println("Have a nice day..");
	}
}
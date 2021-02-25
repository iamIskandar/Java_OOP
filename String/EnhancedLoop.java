class EnhancedLoop
{
	public static void main(String[] args)

	{
		int numbers[]={10,20,30,40};
		int total=0;

		for(int num:numbers)
		{
			System.out.print(" "+num);
			 total+=num ;
		}
		System.out.println();
		System.out.println("Total : "+total);
	}

}
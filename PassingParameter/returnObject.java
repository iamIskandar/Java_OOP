class object
{
	int a;

	object(){}
	object(int i)
	{
		this.a=i;
	}

	  object  returnObjectmultiple5()
	  {
		  object obj=new object(a*5);
		  return obj;
	  }



	public static void main(String[] args)
	{
		object ob1=new object(2);
		object ob2;
		System.out.println("Before => "+ob1.a);


		ob2=ob1.returnObjectmultiple5();


		//returnobjectmultiple5();
		System.out.println("After => "+ob2.a);



	}
}
class returnObject
{
	int a;

	returnObject(int i)
	{
		this.a=i;
	}

	returnObject returnObjectmultiple5(returnObject obj)

	{
		//returnObject obj=new returnObject(a*5);
		obj.a*=5;
		return obj;
	}
}

class Main{
	public static void main(String[] args)
	{
		returnObject ob1=new returnObject(2);
		returnObject ob2;
		System.out.println("Before => "+ob1.a);


		ob1.returnObjectmultiple5(ob1);
		System.out.println("After => "+ob1.a);



	}
}
class objectpassDemo
{
	int a,b;

	objectpassDemo(int i, int j)
	{
		a=i;
		b=j;
	}

	boolean equalTo(objectpassDemo obj)
	{
		return (obj.a==a&&obj.b==b);
	}

}

public class passingParameterObject
{
	public static void main(String[] args)

	{
		objectpassDemo obj1=new objectpassDemo(200,50);
		objectpassDemo obj2=new objectpassDemo(200,50);
		objectpassDemo obj3=new objectpassDemo(14,50);

		System.out.println("ob1 == ob2 : "+obj1.equalTo(obj2));
		System.out.println("ob1 == ob3 : "+obj1.equalTo(obj3));



	}
}
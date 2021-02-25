
class OperatorOveridden
{
	void Operator(String s1,String s2)
	{
		String s3=s1+" "+s2;
		System.out.println(s3);
	}

	void Operator(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class operatorOverloading
{
	public static void main(String[] args) {
		
		OperatorOveridden obj=new OperatorOveridden();

		obj.Operator("Irfan","Iskandar");
		obj.Operator(2,5);
	}
}


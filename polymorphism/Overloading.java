class MultiplyFun
{
	static int Multiply(int a, int b)
	{
		return a*b;
	}

	static double Multiply(double a, double b)
	{
		return a*b;
	}
}

public class Overloading
{
	public static void main(String[] args) {
		
		System.out.println(MultiplyFun.Multiply(2,4));
		System.out.println(MultiplyFun.Multiply(3.2,6.5));
	}
}
class staticcalc
{
	int x;

	static int calc(int x)

	{
		return (x*x*x);
	}


	public static void main(String[] args) {

		System.out.println("vol is => "+staticcalc.calc(5));
	}
}
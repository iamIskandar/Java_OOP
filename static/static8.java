class static8
{
	private static String str="Irfan Iskandar";

	static class NestedClass
	{
		public void disp()
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		static8.NestedClass obj=new static8.NestedClass();
		//disp();
		obj.disp();

	}
}
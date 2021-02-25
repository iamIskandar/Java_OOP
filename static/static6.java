class static6

{
	static int var1=77;

	static String var2="I am string";

	public static void main(String[] args)
	{
		static5 obj1=new static5();
		static5 obj2=new static5();

		obj1.var1=88;
		obj1.var1=10;
		obj2.var1=99;



		System.out.println("obj 1 integer : "+obj1.var1);
		System.out.println("obj 1 string : "+var2);


		System.out.println("obj 2 integer : "+obj2.var1);
		System.out.println("obj 2 integer : "+var2);
	}
}
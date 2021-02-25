class parameterizedConstructor
{
		parameterizedConstructor()
		{
			System.out.println("Default Constructor");
		}


		parameterizedConstructor(int i, int j)
		{
			  System.out.println("constructor with Two parameters");
		}

		parameterizedConstructor(int i, String name)
		{
			   System.out.println("constructor with int and String param");
		}

		public static void main(String[] args) {

			 parameterizedConstructor obj=new parameterizedConstructor();
			 parameterizedConstructor obj1=new parameterizedConstructor(12,12);
			 //parameterizedConstructor obj2=new parameterizedConstructor(29,12,99);
			 parameterizedConstructor obj3=new parameterizedConstructor(40,"Messi");




		}
}
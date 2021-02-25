class passByReference
{
	 String name;

	passByReference()
	{
		this.name="iskandar";
	}

	public  void changeObject(passByReference obj)
	{
		this.name="Anis humaira";
	}


	public static void main(String[] args)
	 {
		passByReference obj=new passByReference();
		System.out.println("Before Change....name is "+obj.name);

		obj.changeObject(obj);

		System.out.println("After Change....name is "+obj.name);
	}

}


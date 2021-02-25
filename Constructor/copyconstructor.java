class copyconstructor
{
	String name;
	int age;


	copyconstructor(String name, int age)
	{
		this.name=name;
		this.age=age;

	}

	copyconstructor(copyconstructor c)
	{
		name=c.name;
		age=c.age;
	}

	void print(){
		System.out.println("Name => "+name+" Age => "+age);
	}


	public static void main(String[] args) {

		System.out.printf("The original constructor\n");
		copyconstructor c=new copyconstructor("Irfan Iskandar",21);
		c.print();

		System.out.printf("\nThe copied constructor\n");
		copyconstructor c1=new copyconstructor(c);
		c1.print();

	}
}
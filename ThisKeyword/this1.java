class this1
{
	String name;
	int id;
	String course;
	boolean handsome;


	this1(String name, int id, String course)
	{
		this.name=name;
		this.id=id;
		this.course=course;
	}

//reusing constructor
	/*Student(String name, int id, String course,boolean handsome)
	{
		this(name,id,course,handsome);
		this.handsome=handsome;
	}*/


	public void disp()
	{
		System.out.println("Name => "+name);
		System.out.println("id => "+id);
		System.out.println("course => "+course);
		// System.out.println("handsome => "+handsome);

	}



	public static void main(String[] args)
	{
		this1 p=new this1("Adam",123456,"Band");
		this1 p1=new this1("Adam",7891011,"Data Engineering");

		p.disp();
		p1.disp();
	}
}
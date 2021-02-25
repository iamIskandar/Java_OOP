class Doctor
{
	public String name;
	public int age;
	public double salary;


	public Doctor()
	{
		name="Kim Ong";
		age=28;
		salary=5500;
	}


	public Doctor(String n, int a, double s)
	{
		name=n;
		age=a;
		salary=s;
	}

	/*public void setName(String n)
	{
		name=n;
	}

	public void setAge(int a)
	{
		age=a;
	}

	public void setSalary(double s)
	{
		salary=s;
	}




	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}*/

	public static double  countSalary(Doctor obj1, Doctor obj2)
	{
		//System.out.println("Sum of salary : "+(obj1.salary+ obj2.salary));

		return (obj1.salary+ obj2.salary);
	}



	public static void main(String[] args)
	{
		Doctor obj1=new Doctor();
		Doctor obj2=new Doctor("Osman Ali",30,7500);
		Doctor obj3=new Doctor();
		double  result;

		System.out.print("Name : "+obj1.name);
		System.out.print(", Age : "+obj1.age);
		System.out.printf(", Salary : %.0f",obj1.salary);
		System.out.println();

		System.out.print("Name : "+obj2.name);
		System.out.print(", Age : "+obj2.age);
		System.out.printf(", Salary : %.0f",obj2.salary);
		System.out.println();

		result=countSalary(obj1,obj2);
		System.out.println("The sum of the salary is : "+result);


	}
}


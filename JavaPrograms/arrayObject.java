import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private int age;
	private double salary;


	Employee(int id, String n,int a,double s)
	{
		this.id=id;
		this.name=n;
		this.age=a;
		this.salary=s;
	}

	public void print(Employee object[] )
	{
		for(int i=0;i<3;i++)
		{

		System.out.println("ID => "+object[i].id);
		System.out.println("Name => "+object[i].name);
		System.out.println("Age => "+object[i].age);
		System.out.println("Salary => "+object[i].salary);
	  }
	}







	public static void main(String[] args)
	{
		System.out.println("Creating Employee Data");
		Scanner input=new Scanner(System.in);

		Employee object[]=new Employee[3];

		for(int i=1;i<4;i++)
		{

			System.out.println();
			System.out.println("Employee "+i);
			System.out.println("id "+i);
			int  id=input.nextInt();


			System.out.println("name :  ");
			String nama=input.nextLine();


			System.out.print("age : ");
			int umur=input.nextInt();

			System.out.println("Salary : ");
			double gaji=input.nextDouble();

			object[i] = new Employee(id, nama, umur, gaji);
		}

		print(obj);

	}
}






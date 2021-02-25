class Employee
{
	public String empName;
	public int empNumber;

	Employee(String name, int number)
	{
		empName=name;
		empNumber=number;
	}

	public String getName()
	{
		return empName;
	}
	public int getNumber()
	{
		return empNumber;
	}
	public void displayInfo()
	{
		System.out.println("Employee Name   : "+empName);
		System.out.println("Employee Number : "+empNumber);
	}
}

class ProductionWorker extends Employee
{
	private int shift;
	private double hourPayRate;

	ProductionWorker(int s, double pr)
	{
		 super(empName,empNumber);
		 shift=s;
		 hourPayRate=pr;
	}
	public void ProductionWorkerInfo()
	{
		System.out.println("<-----Production Worker----->");
		super.displayInfo();
		System.out.println("Employee Shift  :"+shift);
		System.out.println("Pay Rate        :"+hourPayRate);
	}

}
public class pekerjaTest
{
	public static void main(String[] agrs)
	{
		ProductionWorker pw=new ProductionWorker("Ismail Sabri",1234546,1,2.50);
		pw.ProductionWorkerInfo();
	}
}
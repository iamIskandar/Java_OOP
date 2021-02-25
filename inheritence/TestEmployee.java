 class Employee
{
	private String empName;
	private int empNumber;
	private String hiredDate;

	Employee(String name, int number, String date)
	{
		empName=name;
		empNumber=number;
		hiredDate=date;
	}
	public String getName()
	{
		return empName;
	}
	public int getNumber()
	{
		return empNumber;
	}
	public String getDate()
	{
		return hiredDate;
	}
	public void displayInfo()
	{
		System.out.println("Employee Name   : "+empName);
		System.out.println("Employee Number : "+empNumber);
		System.out.println("Hired Date      : "+hiredDate);
	}
}
class ProductionWorker extends Employee
{
	private int shift;
	private double hourPayRate;

	ProductionWorker(String na, int n, String d, int s, double pr)
	{
		 super(na,n,d);
		 shift=s;
		 hourPayRate=pr;
	}
	public void ProductionWorkerInfo()
	{
		System.out.println("\n<-----Production Worker----->");
		super.displayInfo();
		System.out.println("Employee Shift  :"+shift);
		System.out.println("Pay Rate        :RM "+hourPayRate+"/Hour");
	}
}
class ShiftSuperVisor extends Employee
{
	private float annualSalary;
	private float annualProductionBonus;

	ShiftSuperVisor(String na, int n, String d, float as, float apb )
	{
		super(na,n,d);
		annualSalary=as;
		annualProductionBonus=apb;
	}
	public void ShiftSuperVisorInfo()
	{
		System.out.println("\n<-----Shift Supervisor----->");
		super.displayInfo();
		System.out.println("Annual Salary   : RM "+annualSalary);
		System.out.println("Annual Production Bonus : RM "+annualProductionBonus);
	}
}
class TeamLeader extends Employee
{
	private double monthlyBonus;
	private double requiredTrainingHours;
	private double trainingHoursAttended;

	TeamLeader(String na, int n, String d,double monthlyBonus, double requiredTrainingHours, double trainingHoursAttended )
	{
		super(na,n,d);
		this.monthlyBonus=monthlyBonus;
		this.requiredTrainingHours=requiredTrainingHours;
		this.trainingHoursAttended=trainingHoursAttended;
	}
	public void TeamLeaderInfo()
	{
		System.out.println("\n<-----Team Leader----->");
		super.displayInfo();
		System.out.println("monthly Bonus   : RM "+monthlyBonus);
		System.out.println("Training hours required : "+requiredTrainingHours+" Hours");
		System.out.println("Training hours attended : "+trainingHoursAttended+" Hours");
		System.out.println("\n\n\n");
	}
}
public class TestEmployee
{
	public static void main(String[] agrs)
	{
		System.out.println(" Factory Employee Information System");
		System.out.println("------------------------------------");
		ProductionWorker pw=new ProductionWorker("Fariz Adryan",1234546,"4 April 2020",1,10.50);
		pw.ProductionWorkerInfo();

		ShiftSuperVisor ss=new ShiftSuperVisor("Zainuddin Rahim",7891011,"3 September 2010",27000,35000);
		ss.ShiftSuperVisorInfo();

		TeamLeader tl=new TeamLeader("Irfan Iskandar",1213141516,"15 August 2015",2500,20.5,18.5);
		tl.TeamLeaderInfo();
	}
}
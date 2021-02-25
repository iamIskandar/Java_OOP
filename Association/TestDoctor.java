class Doctor
{
	private String name;
	private Patient[] p;
	private int numPatient;

	Doctor(String name)
	{
		this.name=name;
		p=new Patient[5];
	}
	public void addPatient(Patient ps)
	{
		p[numPatient]=ps;
		numPatient++;
	}
	public void print()
	{
		System.out.println("List of patient");

		for(int i=0;p[i]!=null;i++)
		{
			//Patient pesakit=(Patient)p[i];
			System.out.println(p[i].getName());
		}
	}

}
class Patient
{
	private String patientName;

	Patient(String patientName)
	{
		this.patientName=patientName;
	}
	public String getName()
	{
		return patientName;
	}
}

public class TestDoctor
{
	public static void main(String[] args)
	{
		Doctor doc=new Doctor("Kassim Baba");

		Patient pesakit1=new Patient("iskandar");
		Patient pesakit2=new Patient("maira");
		Patient pesakit3=new Patient("messi");

		doc.addPatient(pesakit1);
		doc.addPatient(pesakit2);
		doc.addPatient(pesakit3);
		doc.print();
	}
}




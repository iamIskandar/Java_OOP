class Address
{
	private String street;
	private String city;
	private String state;
	private String zip;

	Address(String s, String c, String st, String z)
	{
		this.street=s;
		this.city=c;
		this.state=st;
		this.zip=z;
	}
	public String toString()
	{
		return street+" "+city+" "+state+" "+zip;
	}
}
class Student
{
	private String firstName;
	private String lastName;
	private Address homeAddress;
	private Address collegeAddress;

	Student(String firstName, String lastName,Address addhome, Address addcol)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		homeAddress=addhome;
		collegeAddress=addcol;
	}
	public String toString()
	{
		return "\t"+firstName+" "+lastName+" \n"+homeAddress+" \n"+collegeAddress;
	}
}
public class StudentTest
{
	public static void main(String[] args)
	{
		System.out.println();
		Address college=new Address("jalan Resak","Skudai","Johor Bahru","10470");
		Address home=new Address("jalan Tanjung Tokong","Georgetown","Penang","10470");

		Student obj=new Student("Mira","Filzah",college,home);

		System.out.println(obj);
		System.out.println();
		System.out.println();
	}
}
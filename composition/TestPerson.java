class Address
{
	private String street,city,state,zip;

	Address(String a, String b, String c, String d)
	{
		street=a;
		city=b;
		state=c;
		zip=d;
	}
	public String getFullAddress()
	{
		return street+" "+city+" "+state+" "+zip;
	}
}
class Name
{
	private String firstName,lastName;

	Name(String f, String l)
	{
		firstName=f;
		lastName=l;
	}
	public String getFullName()
	{
		return firstName+" "+lastName;
	}
}
class Person
{
	private Name name;
	private Address address;

	Person(Address address)
	{
		this.address=address;
		name=new Name("irfan iskandar","Zainuddin");
	}
	public String getName()
	{
		return name.getFullName();
	}
	public String toString()
	{
		return getName()+"\n"+address.getFullAddress();
	}
}
public class TestPerson
{
	public static void main(String[] args) {

		Address alamat=new Address("jalan Resak","Skudai","Johor Bahru","81310");
		Person p1=new Person(alamat);
		System.out.println(p1);
	}
}
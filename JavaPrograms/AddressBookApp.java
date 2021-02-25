class Person
{
	private String name;
	private String phone;
	private Address address;

	Person(){}
	Person(String n, String p, Address address)
	{
		name=n;
		phone=p;
		this.address=address;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setPhone(String p)
	{
		phone=p;
	}
	public String getName()
	{
		return name;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getAddress()
	{
		return address.getFullAddress();
	}
}
class AddressBook
{
	private Person[] entry;
	private BusinessAssociate[] business;
	private PersonalFriend[] personal;
	private int count1, count2, count3;

	AddressBook()
	{
		entry=new Person[5];
		business=new BusinessAssociate[5];
		personal=new PersonalFriend[5];
	}
	public void add(Person p)
	{
		entry[count1]=p;
		count1++;
	}
	public void add(BusinessAssociate b)
	{
		business[count2]=b;
		count2++;
	}
	public void add(PersonalFriend pf)
	{
		personal[count3]=pf;
		count3++;
	}

	public void displayAddressBook()
	{
		for(int i=0;entry[i]!=null;i++)
		{
			System.out.println("Name        : "+entry[i].getName());
			System.out.println("Phone       : "+entry[i].getPhone());
			System.out.println("Address     : "+entry[i].getAddress());
		}

		for(int j=0;business[j]!=null;j++)
		{
			System.out.println();
			System.out.println("Name        : "+business[j].getName());
			System.out.println("Phone       : "+business[j].getPhone());
			business[j].dispBusinessAssociates();
			System.out.println("Address     : "+business[j].getAddress());
		}

		for(int k=0;personal[k]!=null;k++)
		{
			System.out.println();
			System.out.println("Name        : "+personal[k].getName());
			System.out.println("Phone       : "+personal[k].getPhone());
			System.out.println("Address     : "+personal[k].getAddress());
			personal[k].dispPersonalFriend();
		}
			System.out.println();
	}
}
class Address
{
	private String street,city,state;
	Address(){}

	Address(String street, String city, String state)
	{
		this.street=street;
		this.city=city;
		this.state=state;
	}
	public String getFullAddress()
	{
		return street+", "+city+", "+state;
	}
}
class BusinessAssociate extends Person
{
	private String jobTitle;
	private String companyName;

	BusinessAssociate(){}

	BusinessAssociate(String n, String p, Address address,String j, String c)
	{
		super(n,p,address);
		jobTitle=p;
		companyName=c;
	}
	public String getJobTitle()
	{
		return jobTitle;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public void dispBusinessAssociates()
	{
		System.out.println("Job Title   : "+jobTitle);
		System.out.println("Company     : "+companyName);
	}
}
class PersonalFriend extends Person
{
	private String message;

	PersonalFriend(){}

	PersonalFriend(String n, String p, Address address,String m)
	{


		super(n,p,address);
		message=m;
	}
	public String getMessage()
	{
		return message;
	}
	public void dispPersonalFriend       ()
	{
		System.out.println("Message     : "+message);
	           }
}
public class AddressBookApp
{
	public static void main(String[] args)
	{
		AddressBook book1=new AddressBook();
		Address add1=new Address("No 2 Jalan Mawar","Skudai","Johor Bahru");
		Address add2=new Address("Block 1-7","Cheras","Kuala Lumpur");
		Address add3=new Address("202-2 Jalan Bendahara","Muar","Johor");


		Person newfriend1=new Person("Ms.X","555-1212",add1);
		book1.add(newfriend1);

		BusinessAssociate b1=new BusinessAssociate("Mr. Yeo","019-2342",add2,"General Manager","Motorola");
		book1.add(b1);

		PersonalFriend f1=new PersonalFriend("Mrs.Zyda","012-8278",add3,"My School mate");
		book1.add(f1);

		book1.displayAddressBook();
	}
}
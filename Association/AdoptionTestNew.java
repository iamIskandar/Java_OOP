import java.util.ArrayList;
class Cat
{
	private String name;
	private int age;
	private int yearAdopt;

	Cat(String n, int a, int y)
	{
		name=n;
		age=a;
		yearAdopt=y;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int calcnumOfYear()
	{
		return 2020-yearAdopt;
	}
}
class Person
{
	private String name;
	private String address;
	private ArrayList<Cat> mycat;

	Person(String name, String address)
	{
		this.name=name;
		this.address=address;
		mycat=new ArrayList<Cat>();
	}
	public void adopt(Cat c)
	{
		mycat.add(c);
	}
	public void print()
	{
		System.out.println("Owner Name    : "+name);
		System.out.println("Owner address : "+address);
		System.out.println();

		for(int i=0;i<mycat.size();i++)
		{
			System.out.println("#Cat "+(i+1));
			System.out.println("Cat Name    : "+((Cat)mycat.get(i)).getName());
			System.out.println("Cat Age     : "+((Cat)mycat.get(i)).getAge());
			System.out.println("num of year : "+((Cat)mycat.get(i)).calcnumOfYear());
			System.out.println();
		}
	}
}
public class AdoptionTestNew
{
	public static void main(String[] args)
	{
		Cat kucing=new Cat("Oyen",5,2015);
		Cat kucing1=new Cat("hitam",2,2018);

		ArrayList<Cat> cList=new ArrayList<Cat>();
		Person owner=new Person("Iskandar","Tanjung Tokong");
		owner.adopt(kucing);
		owner.adopt(kucing1);
		owner.print();

	}
}
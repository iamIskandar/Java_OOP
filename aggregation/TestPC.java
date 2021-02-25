class Ram
{
	private String productName,serialNumber,brand,speed;

	public Ram(String a, String b, String c, String d)
	{
		productName=a;
		serialNumber=b;
		brand=c;
		speed=d;
	}
	public String getProductName()
	{
		return productName;
	}
	public String getSerialNumber()
	{
		return serialNumber;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getSpeed()
	{
		return speed;
	}
}
class Mouse
{
	private String productName,serialNumber,brand;

	public Mouse(String a, String b, String c)
	{
		productName=a;
		serialNumber=b;
		brand=c;
	}
	public String getProductName()
	{
		return productName;
	}
	public String getSerialNumber()
	{
		return serialNumber;
	}
	public String getBrand()
	{
		return brand;
	}
}
class CPU
{
	private String brand;
	private int core;
	private boolean multithread;

	public CPU(String a, int b, boolean c)
	{
		brand=a;
		core=b;
		multithread=c;
	}
	public String getBrand()
	{
		return brand;
	}
	public int getCore()
	{
		return core;
	}
	public boolean getMultithread()
	{
		return multithread;
	}

}
class Pc
{
	private Ram r;
	private Mouse m;
	private CPU c;

	Pc(Ram r, Mouse m, CPU c)
	{
		this.r=r;
		this.m=m;
		this.c=c;
	}
	public void print()
	{
		System.out.println("Information about this PC's RAM");
		System.out.println("Brand         : "+r.getProductName());
		System.out.println("Serial Number : "+r.getSerialNumber());
		System.out.println("Manufacturer  : "+r.getBrand());
		System.out.println("Speed         : "+r.getSpeed());
		System.out.println();
		System.out.println("Information about this PC's Mouse");
		System.out.println("Brand         : "+m.getProductName());
		System.out.println("Serial Number : "+m.getSerialNumber());
		System.out.println("Manufacturer  : "+m.getBrand());
		System.out.println();
		System.out.println("Information about this PC's CPU");
		System.out.println("Brand         : "+c.getBrand());
		System.out.println("Num of Core   : "+c.getCore());
		System.out.println("Multithread   : "+c.getMultithread());
	}
}
public class TestPC
{
	public static void main(String[] args)
	{
		Ram r1=new Ram("Vengeance LPX","123456","Corsair","2400 Mhz");
		Mouse m1=new Mouse("Logitech G900","7891011","Logitech");
		CPU c1=new CPU("Intel",8,true);
		Pc com=new Pc(r1,m1,c1);
		com.print();
	}
}
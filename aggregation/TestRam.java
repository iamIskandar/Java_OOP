class Ram
{
	private String productName,serialNumber,brand,speed;

	public Ram(Stirng a, String b, String c, String d)
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

	public Mouse(String a, String b, String c,)
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
class Pc
{
	private Ram r;
	private Mouse m;

	Pc(Ram r, Mouse m)
	{
		this.r=r;
		this.m=m;
	}
}
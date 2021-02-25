public class Car
{

	String brand;
	String country;
	int price;
	String color;


	public Car(String brand, String country,
				int price, String color)
	{
		this.brand = brand;
		this.country = country;
		this.price = price;
		this.color = color;
	}


	public String getBrand()
	{
		return brand;
	}


	public String getCountry()
	{
		return country;
	}


	public double getPrice()
	{
		return price;
	}


	public String getColor()
	{
		return color;
	}


	public void display()
	{
		System.out.println("Car brand is "+brand);
		System.out.println("\nFrom " +country+ " Price " +price+ " and color is " +color);
		System.out.println("\n\n");
	}

	public static void main(String[] args)
	{
      Car obj=new Car("Toyota","Japan",16900,"Black");
      obj.display();

	}
} //class Car

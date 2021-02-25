import java.util.Scanner;
public class Car2
{

	String brand;
	String country;
	int price;
	String color;


	public void setBrand(String b)
	{
		brand=b;
	}


	public void setCountry(String c)
	{
		country=c;
	}

	public void setPrice(int p)
	{
		price=p;
	}

	public void setColor(String cl)
	{
		color=cl;
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
		System.out.println("\n\n");
		System.out.println("Car brand is "+brand);
		System.out.println("\nFrom " +country+ " Price " +price+ " and color is " +color);
		System.out.println("\n\n");
	}

	public static void main(String[] args)
	{

	   Scanner input=new Scanner(System.in);
	  String jenama,negara,warna;
	  int harga;

      Car2 obj=new Car2();

      System.out.print("Car Brand => ");
      jenama=input.nextLine();
      obj.setBrand(jenama);


      System.out.print("Car Origin => ");
      negara=input.nextLine();
      obj.setCountry(negara);

      System.out.print("Car price => ");
      harga=input.nextInt();
      input.nextLine();
      obj.setPrice(harga);

      System.out.print("Color => ");
      warna=input.nextLine();
      obj.setColor(warna);

      obj.display();




	}
} //class Car

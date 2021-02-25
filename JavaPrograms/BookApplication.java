import java.util.Scanner;
class Book
{
		public String title;
		public String author;
		public String  isbn;
		public int yearPublished;
		public double price;

	   Book(String t, String a, String i,int year,double p)
	{
		title=t;
		author=a;
		isbn=i;
		yearPublished=year;
		price=p;
	}
}


public class BookApplication
{

	public static void displayBooks(Book[] o)
		{
			System.out.print("\n\n\n Displaying Book details\n\n");
			System.out.println("================================");
			for(int i=0;i<5;i++)
			{

				System.out.println("#Book "+(i+1));
				System.out.println("Title => "+o[i].title);
				System.out.println("Author => "+o[i].author);
				System.out.println("ISBN number => "+o[i].isbn);
				System.out.println("YearPublished => "+o[i].yearPublished);
				System.out.println("Price => "+o[i].price);
				System.out.println();
				System.out.println();

			}
		}

	 public static void calcTotalPrice(Book[] o)
		{
			int total=0;

			for(int i=0;i<5;i++)
			{
				total+=o[i].price;
			}

			System.out.println("Total Price of book is => "+total);
		}


	public static void main(String[] args)

		{
			Scanner input=new Scanner(System.in);
			Book book[]=new Book[5];

			System.out.println("Creating 5 Object Books");
			System.out.println("=============================");

				for(int i=0;i<5;i++)
			{


				System.out.println("\n\n#Book "+(i+1));
				System.out.println("*********\n");
				System.out.print("title =>");
				String  t=input.nextLine();



				System.out.print("Author =>  ");
				String a=input.nextLine();



				System.out.print("ISBN number =>");
				String k=input.nextLine();

				System.out.print("Year Published =>");
				int year=input.nextInt();

				System.out.print("Price =>");
				double p=input.nextDouble();
				input.nextLine();

				book[i] = new Book(t,a,k,year,p);
			}
			displayBooks(book);
			calcTotalPrice(book);
		}



}

































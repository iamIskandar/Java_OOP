class Books
{
	private int pages=1500;

	public void pageMessage()
	{
		System.out.println("Number of pages       : "+pages);
	}
	public int getPages()
	{
		return pages;
	}
}

class Dictionary extends Books
{
	private int definitions=5200;

	public void definitionMessage()
	{
		System.out.println("Number of definitions :"+definitions);
		System.out.println("Definition per page   : "+definitions/getPages());
	}
}

public class Words
{
	public static void main(String[] agrs)
	{
		Dictionary webster=new Dictionary();
		webster.pageMessage();
		webster.definitionMessage();
	}
}

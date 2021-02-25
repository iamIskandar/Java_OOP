import java.util.*;
import java.io.*;

public class baca
{
	public static void main(String[] args)
	{
		try
		{
			Scanner read=new Scanner(new File("output.txt"));

			while(read.hasNext())
			{


				String b=read.next();
				int a=read.nextInt();
				String c =read.next();

				System.out.print(b+" "+a+" "+c);
				System.out.println();
			}

			read.close();
		}
		catch(IOException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
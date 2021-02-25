import java.util.*;
enum Card
{
	SPADES,HEARTS,CLUBES,DIAMONDS;
}

public class EnumCard
{
	char option;	
	public static void main(String[] args)
	{

			
			Scanner input=new Scanner(System.in);

			
				System.out.println("Welcome to game of cards");
				System.out.println("**************************");
				System.out.print("Choose a category (SPADES,HEARTS,CLUBES,DIAMONDS).. => ");
				String answer=input.nextLine().toUpperCase();

				Card kad=Enum.valueOf(Card.class,answer);


			switch(kad)
			{
				case SPADES:System.out.println("\nYou chose SPADES");
							 break;
				 case HEARTS:System.out.println("\nYou chose HEARTS");
							 break;
				 case CLUBES:System.out.println("\nYou chose CLUBES");
							 break;
				 case DIAMONDS:System.out.println("\nYou chose DIAMONDS");
							 break;
				 default:System.out.println("\nCOULD NOT FIND");
							 break;
			}

			System.out.println("THANK YOU!!!");


	}



}
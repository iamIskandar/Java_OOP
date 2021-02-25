import java.util.*;

public class GetInteger
{
  public static int GetAnInteger()
  {
    while(true)
    {
      try{
        return sc.nextInt();
      }

      catch(Exception e)
      {
        sc.next();
        //e.printStackTrace();
        System.out.println("That's not an integer...Try Again!!!");
      }
    }
  }
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {  
    System.out.print("Enter an integer: ");
    int i=GetAnInteger();
    System.out.println("You entered "+i);
  }
}
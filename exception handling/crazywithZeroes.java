public class crazywithZeroes {

    public static int divideTheseNumbers(int a, int b) throws Exception
    {
      int c;
      try
      {
        c=a/b;
        System.out.println("it worked!");
      }
      catch(Exception e)
      {
        System.out.println("Did not work the first time");
        c=a/b;
        System.out.println("it worked the second time");
      }

      finally
      {
        System.out.println("Better clean up my mess");
      }
      System.out.println("it worked after all");
      return c;
    }
  public static void main(String[] args)
  {
    try
    {
      int answer=divideTheseNumbers(8,0);
    }
    catch(Exception e)
    {
      System.out.println("Tried twice, still did not work");
    }
  }


  
}
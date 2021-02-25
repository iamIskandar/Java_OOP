
abstract class Myclass
{
    public abstract  void disp2();

   public void disp3()
   {
	   System.out.println("Parent");
   }
}
class Demo extends Myclass
{
  public void disp2()
  {
    System.out.println("Overriding abstract Method");
  }
}
public class AbstractDemo
{
  public static void main(String[] args)
  {

      Demo obj=new Demo();
      obj.disp2();

      Myclass obj1=new Demo();

      Myclass obj2=new Demo();
      obj1.disp3();
      obj1.disp2();
    }
}
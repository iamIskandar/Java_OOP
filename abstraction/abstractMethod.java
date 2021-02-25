abstract class AbstractDemo
{
	AbstractDemo(){"Def const"};
  public void myMethod()
  {
    System.out.println("Hello");
  }
  abstract public void anotherMethod();
}
public class abstractMethod extends AbstractDemo
{
  public void anotherDemo()
  {
    System.out.println("Abstract Method");
  }

  public static void main(String[] args) {
    AbstractDemo obj=new abstractMethod();


  }
}
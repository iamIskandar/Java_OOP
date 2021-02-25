public enum Demo
{
  EAST ("E"),
  WEST ("W"),
  NORTH ("N"),
  SOUTH ("S");

  private final String shortCode;
  Directions arah;

  Demo(Directions arah, String code)
  {

      this.arah=arah;
      this.shortCode = code;
  }



}

public class EnumDemo
{
    public static void main(String[] args)
    {
    	System.out.println(Demo.SOUTH.ShortCode);

    }
}
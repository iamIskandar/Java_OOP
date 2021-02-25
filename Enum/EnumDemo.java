 enum Directions{
  EAST ("E"),
  WEST ("W"),
  NORTH ("N"),
  SOUTH ("S")
  ;
  /* Important Note: Must have semicolon at
   * the end when there is a enum field or method
   */
 String shortCode;

  Directions(String code) {
      this.shortCode = code;
  }

	public void disp()
	{
		System.out.println(code);
	}

}
public class EnumDemo
{
    public static void main(String[] args) {
    	Directions dir = Directions.EAST;

    	dir.disp();

    }
}
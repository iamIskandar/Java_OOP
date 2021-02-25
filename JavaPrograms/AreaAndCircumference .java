class circle
{
     double radius; //radius of circle
     void setData(double r)
     {
        radius = r;
     }
     void area ()

     {
             double circleArea = Math.PI * radius *radius;
             System.out.println("Area of circle is = " + circleArea);
      }

         void circumference()
          {
             double cir = 2 * Math.PI * radius ;
             System.out.println("circumference of circle is = " + cir);
          }

       }
       public class AreaAndCircumference
     {
          public static void main(String[] args)
          {

             circle obj = new circle();
             obj.setData(3.5 );  //call setData method
             obj.area( );  //call area method
             obj.circumference( );  //call circumference method
          }
     }


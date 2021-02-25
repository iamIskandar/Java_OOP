class Example2
{
      private int var;
      //default constructor
      public Example2()
      {
             this.var = 10;
             System.out.println("var is: "+this.var);

      }
      //parameterized constructor
      public Example2(int num)
      {
             this.var = num;
             System.out.println("var is: "+this.var);
      }

      public static void main(String args[])
      {
              Example2 obj = new Example2();
              Example2 obj2 = new Example2(100);
              //System.out.println("var is: "+obj.getValue());
              //System.out.println("var is: "+obj2.getValue());
      }
}
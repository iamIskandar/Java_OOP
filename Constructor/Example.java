class Example{

	Example(){System.out.println("Hello world");}
   Example(int i, int j){
      System.out.print("parameterized constructor");
   }
   Example(int i, int j, int k){
      System.out.print("parameterized constructor");
   }
   public static void main(String args[]){
      Example obj = new Example();
   }
}

public class ConstructorExample {
   String name;
   //Constructor
   ConstructorExample(){
      this.name = "BeginnersBook.com";
      this.name = "W3Schools";
   }
   public static void main(String[] args) {
       ConstructorExample obj = new ConstructorExample();
        ConstructorExample obj1 = new ConstructorExample();

      System.out.println(obj.name);
       System.out.println(obj.name);
   }
}
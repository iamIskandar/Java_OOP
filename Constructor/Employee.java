public class Employee {

    private int empId;
   private String empName;

   //parameterized constructor with two parameters
   Employee(int id, String name){
       this.empId = id;
       this.empName = name;
   }

   public void setID(int i)
   {
	   empId=i;
   }

   public void setName(String name)
   {
	   empName=name;
   }


      public int getID()
      {
   	   return empId;
      }

      public String getName()
      {
   	   return empName;
   }


   void info(){
        System.out.println("Id: "+getID()+" Name: "+getName());
   }

   public static void main(String args[]){
	Employee obj1 = new Employee(10245,"Chaitanya");
	//Employee obj2 = new Employee(92232,"Negan");
	System.out.println("Name is : "+obj1.empName);
	//obj2.info();
   }
}
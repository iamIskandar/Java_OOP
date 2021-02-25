  class toString
  {
     int rollno;
     String name;
     String city;

		 toString(int rollno, String name, String city)
		 {
			 this.rollno=rollno;
			 this.name=name;
			 this.city=city;
		 }

		 public String disp()
		 {
			  return rollno+" "+name+" "+city;
		 }


     public static void main(String args[])
		 {
		   toString s1=new toString(101,"Raj","lucknow");
		   //System.out.println(s1.name+" "+s1.city);

		   toString s2=new toString(102,"Vijay","ghaziabad");
		  //System.out.println(s2.name+" "+s2.city);

		   System.out.println(s1.disp());//compiler writes here s1.toString()
		   System.out.println(s2.disp());//compiler writes here s2.toString()
		 }
    }
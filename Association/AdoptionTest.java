import java.util.ArrayList;

class Cat {
	private String name;
	private int age;
	private int yearAdopt;

	Cat(String n, int a, int y) {
		name = n;
		age = a;
		yearAdopt = y;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int calcnumOfYear() {
		return (2020 - yearAdopt);
	}
}

class Person {
	private String name;
	private String address;
	private Cat[] mycat;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
		mycat = new Cat[7];
		//System.out.println(mycat.length);
	}
	public void adopt(Cat c) {
		int count = 0;
		while(mycat[count] !=null) {
			count++;
		}
		mycat[count] = c;
	}
	public void print() {
		System.out.println("Owner Name    : "+name);
		System.out.println("Owner address : "+address);
		System.out.println();

		for(int i = 0; mycat[i]!=null; i++) {
			//Cat ct = (Cat)mycat[i];
			System.out.println("#Cat "+(i+1));
			System.out.println("Cat Name    : "+mycat[i].getName());
			System.out.println("Cat Age     : "+mycat[i].getAge());
			System.out.println("Num of Year : "+mycat[i].calcnumOfYear());
			System.out.println();
		}
	}
}

public class AdoptionTest {
	public static void main(String[] args) {
		Cat kucing1 = new Cat("Oyen", 5, 2015);
		Cat kucing2 = new Cat("Itam", 2, 2018);

		//ArrayList<Cat> cList = new ArrayList<Cat>();
		Person owner = new Person("Iskandar", "Tanjung Tokong");
		owner.adopt(kucing1);
		owner.adopt(kucing2);
		owner.print();
	}
}
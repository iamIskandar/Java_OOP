class Section
{
	private String lectureName;
	private String sectionNum;

	Section(String l, String s)
	{
		lectureName=l;
		sectionNum=s;
	}
	public String getName()
	{
		return lectureName;
	}
	public String getSection()
	{
		return sectionNum;
	}
}
class Subject
{
	private Section[] section;
	private String subjName;
	private String subjCode;

	Subject(String subjName, String subjCode)
	{
		this.subjName=subjName;
		this.subjCode=subjCode;
		section=new Section[5];
	}
	public void addSection(Section s)
	{
		int count=0;
		while(section[count]!=null)
		{
			count++;
		}
		section[count]=s;
	}
	public void printInfo()
	{
		System.out.println("Subject Name  : "+subjName);
		System.out.println("Subject Code  : "+subjCode);

		for(int i=0;section[i]!=null;i++)
		{
		System.out.println("Lecturer Name : "+section[i].getName());
		System.out.println("Lecturer Code : "+section[i].getSection());
	  }
	}
}
public class SubjectTest
{
	public static void main(String[] args) 
	{
		Subject s=new Subject("REAL-TIME SOFTWARE ENGINEERING","SCSJ3253");
		Subject s1=new Subject("OOP","SCSJ2153");

		Section se1=new Section("Dr.Radziah","01");
		Section se2=new Section("Dr Radziah","04");
		Section se3=new Section("Assoc. Prof. Dr.  Norazah","02");
		Section se4=new Section("Dr Dayang Norhayati","01");

		s.addSection(se1);
		s.addSection(se2);
		s.addSection(se3);
		s.printInfo();
		System.out.println();
		System.out.println();
		s1.addSection(se4);
		s1.printInfo();


	}
}
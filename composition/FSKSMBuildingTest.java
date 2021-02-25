class FSKSMBuilding
{
	private Lab[] labs;
	private LectureRoom[] lect;

	FSKSMBuilding()
	{
		labs=new Lab[5];
		lect=new LectureRoom[5];

		labs[0]=new Lab("Makmal Kimia",50);
		labs[1]=new Lab("Makmal Biologi",70);

		lect[0]=new LectureRoom("Bilik kuliah 1","101",100);
		lect[1]=new LectureRoom("Bilik kuliah 2","202",200);
	}
	public void showAllLabs()
	{
		for(int i=0;labs[i]!=null;i++)
		{
			System.out.println("#Lab "+(i+1));
			System.out.println("Lab Name     : "+labs[i].getLabName());
			System.out.println("Lab capacity : "+labs[i].getLabCapacity());
			System.out.println();
		}

	}
	public void showAllRooms()
	{
		for(int i=0;lect[i]!=null;i++)
		{
			System.out.println("#LectureRoom "+(i+1));
			System.out.println("Room Name    : "+lect[i].getRoomName());
			System.out.println("Lab capacity : "+lect[i].getCapacity());
			System.out.println();
		}
	}
}

class Lab
{
	private String labName;
	private int capacity;

	Lab(String l, int c)
	{
		labName=l;
		capacity=c;
	}
	public void setLabName(String l)
	{
		labName=l;
	}
	public void setCapacity(int c)
	{
		capacity=c;
	}
	public String getLabName()
	{
		return labName;
	}
	public int getLabCapacity()
	{
		return capacity;
	}
}
class LectureRoom
{
	private String roomName,roomNo;
	private int capacity;

	LectureRoom(String n,String rn,int c)
	{
		roomName=n;
		roomNo=rn;
		capacity=c;
	}
	public void setRoomName(String n)
	{
		roomName=n;
	}
	public void setRoomNo(String rn)
	{
		roomNo=rn;
	}

	public void setCapacity(int c)
	{
		capacity=c;
	}

	public String getRoomName()
	{
		return roomName;
	}
	public String getRoomNo()
	{
		return roomNo;
	}

	public int getCapacity()
	{
		return capacity;
	}
}

public class FSKSMBuildingTest
{
	public static void main(String[] args)
	{
		FSKSMBuilding building=new FSKSMBuilding();
		building.showAllLabs();
		building.showAllRooms();
	}
}
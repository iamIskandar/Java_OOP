class Bill
{
	public int airtime=0;
	public int totalSms=0
	final double callRate=0.25;
	final double smsRate=0.05;


	public void CalculateTotal(Bill mum, Bill sister)
	{
		mum.airtime+mum.totalSms;
		sister.airtime+sister.totalsms;
	}	


	public void CalculateBill()
	{
		double answer;
		answer=(airtime*callRate) +(totalSms*smsRate);
		System.out.println("Bill "+answer);
	}
}


public class BillTest
{
	public static void main(String[] args)
	{
		Bill mum=new Bill(130,100);
		Bill sister=new Bill(200,50);
		Bill family=new Bill(0,0);

		family.calculateTotal(mum,sister);
		System.out.println("Total Bill")

	}
}
class Bill
{
	private int airtime;
	private int totalSms;
	final double callRate=0.25;
	final double smsRate=0.05;


	public Bill(int a, int t)
	{
		airtime=a;
		totalSms=t;
	}

	public void calculateTotal(Bill ibu, Bill kakak)
	{

		System.out.println("======Family Phone bill======");
		System.out.println("Call Rate  : 0.25" );
		System.out.println("Sms Rate : 0.05");


		airtime=ibu.airtime+kakak.airtime;
		totalSms=ibu.totalSms+kakak.totalSms;



		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Mum airtime: RM "+(ibu.airtime*callRate));
		System.out.println("Sister airtime : RM "+(kakak.airtime*callRate));
		System.out.println("Total airtime:  RM"+(airtime*callRate));


		System.out.println();
		System.out.println("Mum SMS:  RM "+(ibu.totalSms*smsRate));
		System.out.println("Sister SMS : RM "+(kakak.totalSms*smsRate));
		System.out.println("Total SMS : RM"+(totalSms*smsRate));


	}


	public void CalculateBill()
	{
		double jawapan;

		jawapan=(airtime*callRate)+(totalSms*smsRate);
		System.out.println();
		System.out.println();

		System.out.println("Total bill=total airtime + total SMS");
		System.out.println();
		System.out.println("Total bill is = "+jawapan);
		System.out.println();
		System.out.println();
		System.out.println();
	}

}



public class PassingParameterExercise
{
	public static void main(String[] args)
	{
		Bill mum=new Bill(130,100);
		Bill sister=new Bill(200,50);
		Bill family=new Bill(0,0);

		family.calculateTotal(mum,sister);
		family.CalculateBill();

	}
}
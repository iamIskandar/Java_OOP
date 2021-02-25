class Header
{
	private String title;

	public Header(String t)
	{
		title=t;
	}
	public String getTitle()
	{
		return title;
	}
}

class Body
{
	private String message;

	Body(String m)
	{
		message=m;
	}
	public String getMessage()
	{
		return message;
	}
}
class Attachment
{
	private String fileName;

	Attachment(String f)
	{
		fileName=f;
	}
	public String getFile()
	{
		return fileName;
	}
}

class MailMessage
{
	private Header header;
	private Body body;
	private Attachment attachment;
	MailMessage(Header header, Body body, Attachment attachment)
	{
		this.header=header;
		this.body=body;
		this.attachment=attachment;
	}
	public void print()
	{
		System.out.println("Header     : "+header.getTitle());
		System.out.println("Body       : "+body.getMessage());
		System.out.println("Attachment : "+attachment.getFile());
	}
}
public class MailMessageTest
{
	public static void main(String[] args)
	{
		Header h=new Header("Object-oriented Programming");
		Body b=new Body("Lab Exercise for Aggregation");
		Attachment a=new Attachment("Lab8.java");
		MailMessage m=new MailMessage(h,b,a);
		m.print();
	}
}
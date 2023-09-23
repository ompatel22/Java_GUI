package college.fac.it;

public class fystaff implements staff
{
	public void fy()
	{
		System.out.println("hello");
	}
	public static void main(String a[])
	{
		fystaff s1=new fystaff();
		s1.fy();
	}
}
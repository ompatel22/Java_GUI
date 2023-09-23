package college.fac.ce;
import college.fac.it.*;
public class fystaffce implements staff
{
	public void fy()
	{
		System.out.println("hello");
	}
	public static void main(String a[])
	{
		fystaffce s1=new fystaffce();
		s1.fy();
	}
}
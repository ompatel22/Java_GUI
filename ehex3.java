package exceptionhandling;
class negex extends Exception
{	
}
class posex extends Exception
{
}
class zeroex extends Exception
{
}
public class ehex3
{
	static void test(int x) throws negex,posex,zeroex
	{
		if(x==-1)
		{
			throw new negex();
		}
		if(x==1)
		{	
			throw new posex();
		}
		if(x==0)
		{
			throw new zeroex();
		}
	}
	public static void main(String args[])
	{
		try
		{
			test(1);
		}
		catch(negex e)
		{
			System.out.println("negex");
		}
		catch(posex e)
		{
			System.out.println("posex");
		}
		catch(zeroex e)
		{
			System.out.println("zeroex");
		}
	}
}
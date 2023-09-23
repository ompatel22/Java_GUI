package exceptionhandling;
public class Ehex2{
	
     public static void main(String []args){
        
		int ans;
		for(int b=2;b>=0;b--)
		{
			try
			{
				System.out.println(10/b);
			}
			catch(Exception e)
			{	
				System.out.println("catch");
				break;
			}
			finally
			{
				System.out.println("finally");
			}
		}
	}
}
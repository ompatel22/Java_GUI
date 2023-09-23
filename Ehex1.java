package exceptionhandling;
public class Ehex1{
	static int div(int x,int y) throws ArithmeticException,NullPointerException
   	{
        /*try
        {
            int c=x/y;
            return c;
        }
        catch(ArithmeticException e)
        {
            System.out.println("inner catch");
           throw new ArithmeticException();
        }
        finally
        {
            System.out.println("finally");
	
        }*/
       int c=x/y;
       return(c);
    }
     public static void main(String []args){
        
		/*try{
		int ans=div(5,0);
        	System.out.println(ans);
     		}
		catch(Exception e)
		{
			System.out.println("outer catch");
			System.out.println(e);
		}*/
		int ans=div(5,0);
		System.out.println(ans);
		System.out.println("end");
	}
}
public class TestThrow1 {   
   
   static void fun1() 
	{
	int a=10/0;
	}
 static void fun2() 
	{
	fun1();
	}
    public static void main(String args[]){  
        
       try
	{ 
		fun2();
       }
	catch(ArithmeticException e)
	{	
		System.out.println("caught");

	}
	System.out.println("rest of the code...");    
  }    
}    
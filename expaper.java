public class expaper
{
    public static void main(String args[])
    {
        int sum=10;
        try
        {  
            for(int i=-1;i<3;i++)
            {
                sum=sum/i;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("0");
        }
         System.out.println(sum);

    }
}
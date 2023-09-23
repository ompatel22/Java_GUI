package enque;
public class enn{
        /*public static void en(int arr[],int ele,int ind)
        {
            for(int i= arr.length;i>ind;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[ind]=ele;
        }*/
	public static void dis(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void en(int arr[],int ele,int ind)
        {
          	arr[ind]=ele;
        }
	
}

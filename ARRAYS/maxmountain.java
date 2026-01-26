package ARRAYS;
import java.util.*;
public class maxmountain {


	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int T=sc.nextInt();
	    
	    while(T-->0)
	    {
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		for (int i=0;i<N;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
		    if(arr[0]<arr[i])
		    {
		        arr[0]=arr[i];
		    }
		}
		System.out.println(arr[0]);
	    }
	}
}


    

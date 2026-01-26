package ARRAYS;
import java.util.*;
public class search {
  
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s =  new Scanner(System.in);
	   int N=s.nextInt();
	   int X=s.nextInt();
	   int A[]=new int[N];
	   for(int i=0;i<A.length;i++)
	   {
	       A[i]=s.nextInt();
	   }
	   int flag =0;
	   for(int i=0;i<A.length;i++)
	   {
	       if(X==A[i])
	       {
	           flag=1;
	       }
	   }
	   if(flag==1)
	   System.out.println("YES");
	   else
	   System.out.println("NO");
        
	}
}

    


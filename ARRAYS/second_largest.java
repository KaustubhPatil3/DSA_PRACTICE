/*WITH ARRAY SORTING
package ARRAYS;
import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 29, 8, 25, 15};

        Arrays.sort(arr);

        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}*/

package ARRAYS; 

public class second_largest
{
    public static void main(String s[])    
    {
        int arr[]={23,65,25,1,47};
        
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest =arr[i];                
            }
            else if (arr[i]>second && arr[i]!=largest)
            {
                second=arr[i];
            }
        }
        System.out.println("SECOND LARGEST NO. = "+second);
    }
}


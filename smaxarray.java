import java.util.*;
public class smaxarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        System.out.println("enter elements of array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(a[i]>max)
            max=a[i];   
        }
        for(int i=0;i<size;i++)
        {
         if(a[i]>smax && a[i]!=max)
            smax=a[i];
        }
        System.out.println("maximum element is :"+max);
        System.out.println("second maximum element is :"+smax);
    }
}

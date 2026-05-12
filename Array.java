//take an array input and fing a numbe x given and print the index at which it is found
import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt ();//taking size of array as input
        int num[]=new int[size];//defining array
        for(int i=0;i<size;i++)//input array element
        {
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();//input number to found
        for (int i=0;i<num.length;i++)//checking each element  of array(num.length=size of array)
        {
            if(num[i]==x)
            {
                System.out.println("x found at index :"+i);
            }
        }
    }
}
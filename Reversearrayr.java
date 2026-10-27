import java.util.*;
public class Reversearrayr{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int n[]=new int[size];
        int a=0;// using concept of swaping number using two variables
        int b=size-1;
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        while(a<b)//swapping array numbers using concept of swaping numbers 
        {
            int temp=n[a];
            n[a]=n[b];
            n[b]=temp;
            a++;
            b--;
        }
        for(int ele:n)// syntax of for each loop 
        System.out.println(ele+" ");// it is used to transverse data structure can't modify array
    }
}
import java.util.*;
class Arraybasics
{
    public static void main(String args[])
    {
//array aise define hota hai basically 1st way
        //int x[]={1,2,6,45,3};
        //System.out.println(x[5]);
        //array is mutable i.e it's elements can be changed
//{2nd way}
        //int arr[]=new int[4];
        //arr[0]=10;
        //arr[1]=20;
        //arr[2]=30;
        //arr[3]=40;
        //System.out.println(arr[3]);
// {taking output in array}
        //int x[]={1,2,6,45,3};
        //for (int i=0;i<x.length;i++)//x.length is length of array
        //{
        //     System.out.println(x[i]+" ");
        //}
// {taking input and printing output in array}
       // Scanner sc=new Scanner(System.in);
       // int size=sc.nextInt();//taking size of array as input
       // int num[]=new int[size];//utne size ka array bn gaya
       // for (int i=0;i<size;i++){
       //     num[i]=sc.nextInt();// taking array elements as input
       // }
       // for (int i=0;i<size;i++){
       //     System.out.println(num[i]+" ");//printing elkements of array
       // }// yaha pr (ye +" ") array ke elements ke bich me space dene ke liye use hota hai
//Q . given an array print negetive elements only
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();//taking size of array as input
        int num[]=new int[size];//utne size ka array bn gaya
        System.out.println("enter array elements:");
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();// taking array elements as input
       }
       for (int i=0;i<size;i++){
            if (num[i]<0)
            System.out.println(num[i]+ " ");
        }
    }
}
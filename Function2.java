import java.util.*;
public class Function{
    public static int calculateProduct(int a,int b)//declaring function
    {
        int p=a*b;
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();//taking input from user
        int b =sc.nextInt();
        System.out.println("first number is :"+a);
        System.out.println("second number is :"+b);
        int product=calculateProduct(a,b);//calling the function
        System.out.println(product);
    }
}
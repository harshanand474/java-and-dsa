import java.util.*;
public class Function{
    public static int calculateSum(int a,int b)//declaring function
    {
        int s=a+b;
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();//taking input from user
        int b =sc.nextInt();
        int sum=calculateSum(a,b);//calling the function
        System.out.println(sum);
    }
}
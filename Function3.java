import java.util.*;
public class Function{
    public static void printFactorial(int n)//declaring function
    {
        if(n<0)
        {
            System.out.println("invalid input");
        }
        int f=1;
        for(int i=n;i>=1;i--)
        {
            f=f*i;
        }
        System.out.println(f);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();//taking input from user
        printFactorial(n);
    }
}
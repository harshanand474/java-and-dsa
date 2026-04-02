import java.util.*;
public class Function{
    public static void printMyName(String name)//declaring function
    {//here function type is void because it only has to print name and no operation
        System.out.println(name);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();//taking input from user
        printMyName(name);//calling the function
    }
}
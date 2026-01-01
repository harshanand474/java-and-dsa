import java.util.*;
class even
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of n");
		int n=sc.nextInt();
	    for(int i=0;i<=n;i++)
	    {
	       if(i%2==0)
	       {
	            System.out.print("even numbers are:");
	            System.out.println(i);
	       }
	           
	       }
		}
	}

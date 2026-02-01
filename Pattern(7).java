 
public class Pattern
{
	public static void main(String[] args)
	{
	    int n=5;
	    for (int i=1;i<=n;i++ )
	    {
	        for(int j=1;j<=i;j++)
	        {
	            int s= i+j;
	            if (s%2==0)
	            {
	                System.out.print("1");
	            }
	            else{
	                System.out.print("0");
	            }
	        }
	        	System.out.println();
	    }     
	}
}
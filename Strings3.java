//counting number of constants in a sentence
import java.util.*;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++)
        {
            char ch= n.charAt(i);//checking every character of sentence
             // Check if alphabet
            if ((ch >= 'A' && ch <= 'Z') ||(ch >= 'a' && ch <= 'z'))
            {
                // Check if NOT vowel
                if (!(ch == 'A' || ch == 'E' || ch == 'I' ||
                      ch == 'O' || ch == 'U' ||
                      ch == 'a' || ch == 'e' ||
                      ch == 'i' || ch == 'o' ||
                      ch == 'u')) 
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
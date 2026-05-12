//find maximum and minimum number in array
import java.util.*;
public class Array
 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();//inut size of array
      int num[] = new int[size];//defining array
      //input of elements of array
      for(int i=0; i<size; i++) {
          num[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE;//maximum value
      int min = Integer.MAX_VALUE;//minimum value
     for(int i=0; i<num.length; i++)//checking each and ever element of array for finding max and min value
       {
           if(num[i] < min)
           {
               min = num[i];
           }
           if(num[i] > max) {
               max = num[i];
           }
       }
       System.out.println("max number is :"+max);
       System.out.println("min number is :"+min);
    }
}

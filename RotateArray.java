//ROTATE ARRAY (in this code we are rotating to left that is 1st element is moving to the last of array)
import java.util.*;
class RotateArray{
    static void rotatearray(int a[],int d){
        int n= a.length;
        d%=n;
        reverse(a,0,d-1);//reversing the d elements here in code its 3 so 1st 3 elements
        reverse(a,d,n-1);//reversing the remaining elements that is n-d elements
        reverse(a,0,n-1);//reversing the complete array
    }
    static void reverse(int a[],int i, int j){
        while(i<j){
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
         i++;
         j--;
        }
    }
    public static void main(String args[]){
        int a[]={6,8,3,5,9,3,0,2};
        int d=3;
        rotatearray(a ,d);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
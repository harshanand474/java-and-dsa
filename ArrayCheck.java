//checking weather array is in ascending order or not
import java.util.*;
public class ArrayCheck 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();//input size of array
        int numbers[] = new int[size];//define array
        // input array elements
        for(int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;//boolean data type which shows true or false
        //here we took true bcoz we think currently the array is sorted
        // checking ascending order
        for(int i = 0; i < numbers.length - 1; i++)//here it is number.length-1 bcoz
        {//suppose length of array is 4 so at index 3:numbers[i+1] becomes numbers[4] which doesn't exist
            if(numbers[i] > numbers[i + 1])//comparing current element with next element
            {
                isAscending = false;
                break;
            }
        }

        if(isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted in ascending order");
        }

        sc.close();
    }
}
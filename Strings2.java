//palindrome of string
import java.util.*;
public class Strings{
    public static void main(String args[]){
        String str = "madam";
        String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
}

if (str.equals(reversed)) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}
    }
}
// in reverse of string code from if part is removed and just sopln(reversed) is done
// 
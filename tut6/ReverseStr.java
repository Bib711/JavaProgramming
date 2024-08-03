import java.util.*;
public class ReverseStr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the string:");
        String str = obj.nextLine();
        String Revstr = new String();
        for (int i = str.length()-1; i >=0 ; i--) {
            Revstr += str.charAt(i);
        }
        System.out.println("Reversed string is :"+Revstr);
        obj.close();
    }
}

import java.util.*;
public class FirstLastchar {
    public static void main(String[] args) {
        //to remove a given character from string
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the string:");
        String str = obj.nextLine();
        if(str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("First and Last character are same");
            System.out.println(str.substring(1, str.length()-1));
        }else{
            System.out.println(str.substring(1, str.length()-1));
        }
        obj.close();
    }
}

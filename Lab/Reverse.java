import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        //check wheather the entered string is palindrome or not
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();
        int len = str.length();
        boolean flag = true;
        for (int i = 0; i < (len)/2; i++) {
            //(len-i-1) for backward iteration 
            if(str.charAt(i)!=str.charAt(len-i-1)){
                flag=false;
                break;
            }
        }
        System.out.println((flag)?str+" is palindrome.":str+" is not palindrome.");
        obj.close();
    }
}

import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();
        System.out.print("\nEnter a character: ");
        char chr = obj.next().charAt(0);
        int len = str.length();
        int count =0;
        for (int i = 0; i < (len); i++) {
            if(str.charAt(i)==chr){
                count++;
            }
        }
        System.out.println("No.of Occurance:"+count);
        obj.close();
    }
}

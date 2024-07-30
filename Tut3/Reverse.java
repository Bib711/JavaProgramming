//To reverse a given no.
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no,rev=0;
        System.out.print("Enter the no:");
        no = obj.nextInt();
        for(;no>0;){
            int rem = no%10;
            rev =rev*10+rem;
            no /= 10;
        }
        System.out.println("Reversed no is:"+rev);
    }
}

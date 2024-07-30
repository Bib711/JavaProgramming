//to print fabinochi nos upto a limit.
import java.util.*;
public class Fabi {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int limit,first=0,second=1,third;
        System.out.print("Enter the limit:");
        limit =obj.nextInt();
        while(first<=limit){
            System.out.println(first);
            third=first+second;
            first=second;
            second = third;  
        }
    }   
}

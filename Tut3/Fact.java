//Program to find factorial of a no
import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no,i=1,f=1;
        System.out.print("Enter a no:");
        no = obj.nextInt();//inputing the no from user
        while(i<no+1){
            f *= i;
            i++;
        }
        System.out.println(no+"! = "+f);
    }
}

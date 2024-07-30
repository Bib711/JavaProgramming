import java.util.*;
public class Leapyr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int year;
        System.out.print("Enter the year:");
        year = obj.nextInt();
        if((year%4==0 && year%100!=0||year%400==0)){
            System.out.println(year+" is a leap year.");
        }else{
            //System.out.printf("%d is not.\n",year);
            System.out.println(year+" is not a leap year. ");
        }
    }
}

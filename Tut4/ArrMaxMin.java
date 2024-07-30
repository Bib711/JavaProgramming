import java.util.*;
public class ArrMaxMin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = obj.nextInt();
        int[] Arr = new int[size];
        System.out.println("\nEnter elements to array:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Arr[%d]:",i);
            Arr[i] = obj.nextInt();
        }
        int max = Arr[0],min = Arr[0];
        for (int i = 1; i < size; i++) {
            if(Arr[i]>max){
                max = Arr[i];
            }
            if(Arr[i]<min){
                min = Arr[i];
            }
        }
        System.out.println("Maximum element of array is:"+max);
        System.out.println("Minimum element of array is:"+min);
    }
}

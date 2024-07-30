import java.util.*;
public class ArrSum {
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
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Arr[i];
        }
        System.out.println("Sum of elements of array is:"+sum);
    }
}

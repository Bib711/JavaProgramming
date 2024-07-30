import java.util.*;
public class Arr2DiaSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter order of square matrix(n for nxn):");
        int size = obj.nextInt();
        int[][] Mat = new int[size][size];
        System.out.println("\nEnter elements to matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Mat[%d][%d]:",i,j);
                Mat[i][j] = obj.nextInt();   
            }
        }
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(Mat[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j||(i+j==size-1)) {
                    sum += Mat[i][j];
                }
            }
        }

        System.out.println("Sum of diagonal elements of matrix is:"+sum);
    }
}

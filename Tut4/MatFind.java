import java.util.*;
public class MatFind {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of rows and columns for the matrix(rows columns):");
        int row = obj.nextInt();
        int clmn= obj.nextInt();
        int[][] Mat = new int[row][clmn];
        System.out.println("\nEnter elements to matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("Mat[%d][%d]:",i,j);
                Mat[i][j] = obj.nextInt();   
            }
        }
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Mat[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("Enter the element to search:");
        int ele = obj.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                if (Mat[i][j]==ele) {
                    System.out.printf("Element %d found at position Mat[%d][%d]\n",ele,i,j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.printf("Element %d not found in the matrix\n",ele);
        }
    }
}

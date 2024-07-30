import java.util.*;
public class MatAdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of rows and columns for both matrix(rows columns):");
        int row = obj.nextInt();
        int clmn= obj.nextInt();
        int[][] Mat = new int[row][clmn];
        int[][] Mat1 = new int[row][clmn];
        System.out.println("\nEnter elements to matrix1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("Mat[%d][%d]:",i,j);
                Mat[i][j] = obj.nextInt();   
            }
        }
        System.out.println("\nEnter elements to matrix2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("Mat[%d][%d]:",i,j);
                Mat1[i][j] = obj.nextInt();   
            }
        }
        System.out.println("\nMatrix1 is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Mat[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nMatrix2 is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Mat[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] Mat2 = new int[row][clmn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                Mat2[i][j] = Mat[i][j] + Mat1[i][j];
            }
        }
        System.out.println("\nMatrix1 + Matrix2 is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Mat2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

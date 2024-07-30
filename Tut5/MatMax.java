//Q1--> Tut 5
import java.util.Scanner;
public class MatMax {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int row,col;
        System.out.print("Enter the number of rows : ");
        row = obj.nextInt();
        System.out.print("\nEnter the number of columns : ");
        col = obj.nextInt();
        int[][] mat= new int[row][col];
        
        System.out.println("\nEnter the elements of the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("Matrix [%d][%d]: ",i,j);
                mat[i][j] = obj.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        
        int max;
        System.out.println("Maximum elemts in each row: ");
        for(int i=0;i<row;i++){
            System.out.print("Row "+i+": ");
            max = mat[i][0];
            for(int j=0;j<col;j++){
                if(mat[i][j]>max){
                    max = mat[i][j];
                }
            }
            System.out.println(max);
        }

	}
}


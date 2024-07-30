//Q2 ---> Tut 5
import java.util.*;

public class MatScalarMulti {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);	
		int cols,rows;
		System.out.print("Enter the number of rows : ");
		rows = obj.nextInt();	
		System.out.print("\nEnter the number of columns : ");
		cols = obj.nextInt();
		
		int [][] mat = new int[rows][cols];
		
		System.out.println("\nEnter the elements: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.printf("Matrix [%d][%d]: ",i,j);
				mat[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("The matrix is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("Enter the scalar value : ");
		int scalar = obj.nextInt();
		System.out.println("\nThe resulting matrix after scalar multiplication is: ");
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(mat[i][j]*scalar+"\t");
			}
			System.out.print("\n");
		}
		
	}

}


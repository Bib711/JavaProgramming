//Q4 ---> Tut 5
import java.util.*;

public class SymmetricMat {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the size of the square matrix (n for nxn ): ");
		int n = obj.nextInt();
		
		System.out.println("\nEnter the elements of the matrix: ");
		
		int[][] mat= new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("Matrix [%d][%d]: ",i,j);
				mat[i][j] = obj.nextInt();
			}
		}
		System.out.println("\nThe matrix is: ");
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		boolean isSymmetric = true;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] != mat[j][i]) {
					isSymmetric = false;
					break;
				}
			}
		}
		
		System.out.println(isSymmetric?"The matrix is symmetric.":"The matrix is not symmetric.");
	}

}


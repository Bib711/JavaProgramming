//Q3 ---> Tut 5
import java.util.*;
public class IdentityMat {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the size of the identity matrix (n for nxn): ");
		int n = obj.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					mat[i][j] = 1;
				}else {
					mat[i][j] = 0;
				}
			}
		}
		System.out.println("\nThe identity matrix is: ");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}


import java.util.*;
public class MatTrans {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter rows and columns for the matrix(r c):");
        int r1 = obj.nextInt();
        int c1 = obj.nextInt();
        int[][] Mat= new int[r1][c1]; 
        int[][] Trans= new int[c1][r1]; 
        System.out.println("Enter matrix values:");
        for(int i=0; i<r1 ;i++){
            for(int j=0; j<c1 ; j++){
                System.out.print("Mat ["+i+"]["+j+"]: ");
                Mat[i][j]= obj.nextInt();
                //transposing
                Trans[j][i]=Mat[i][j];
            }
        }
        //Original matrix
        System.out.println("Original Matrix:");
        for(int i=0; i<r1 ;i++){
            for(int j=0; j<c1 ;j++){
                System.out.print(Mat[i][j]+" ");
            }
            System.out.print("\n");
        }
        //transposed matrix
        System.out.println("Transposed Matrix:");
        for(int i=0; i<c1 ;i++){
            for(int j=0; j<r1 ;j++){
                System.out.print(Trans[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}

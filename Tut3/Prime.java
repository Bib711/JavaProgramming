/**
 * Prime nos btw 1-100
 */
public class Prime {
    public static void main(String[] args) {
        int p;
        System.out.print("Prime nos between 1-100 are: ");
        for (int i = 2; i < 100; i++) {
            p=0;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                    p=1;
                    break;
                }
            }
            if (p==0) {
                System.out.print(i+" ");
            }
        }
        
    }
}
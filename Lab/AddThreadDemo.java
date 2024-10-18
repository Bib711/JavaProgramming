package lab1;
import java.util.*;
class thread1 extends Thread{
		int num;
		thread1(int num ){
			this.num = num;
		}
		public void run() {
			synchronized (thread1.class) {
				for(int i=1;i<=5;i++) {
					System.out.println(num+"+"+i+"="+(num+i));
				}	
			}
		}
}
public class AddThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want to run by Thread1:");
		int n1 = sc.nextInt();
		System.out.println("Enter the table you want to run by Thread2:");
		int n2 = sc.nextInt();
		System.out.println("Enter the table you want to run by Thread3:");
		int n3 = sc.nextInt();
		
		thread1 t1 = new thread1(n1);
		thread1 t2 = new thread1(n2);
		thread1 t3 = new thread1(n3);
		t1.start();
		t2.start();
		t3.start();
	}

}

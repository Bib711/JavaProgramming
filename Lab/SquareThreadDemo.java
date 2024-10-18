package lab1;
import java.util.*;
class SquareThread extends Thread{
		int num;
		SquareThread(int num ){
			this.num = num;
		}
		public void run() {
				System.out.println("Square of "+num+" = "+num*num);
		}
}

class CubeThread extends Thread{
	int num;
	CubeThread(int num ){
		this.num = num;
	}
	public void run() {
			System.out.println("Cube of "+num+" = "+num*num*num);
	}
}

class Randomt extends Thread{

	Random robj = new Random();
	
	public void run() {
	for(int i=1;i<=10;i++) {
		int randNum = robj.nextInt(100);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		if(randNum%2==0) {
			SquareThread t = new SquareThread(randNum);
			t.start();
			
		}else {
			CubeThread t1 = new CubeThread(randNum);
			t1.start();
			}
		}
	}
}
public class SquareThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Randomt ran = new Randomt();
		ran.start();
		
		
	}

}

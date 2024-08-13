package LabPractice;
import java.util.*;
abstract class Marks{
	abstract void getPercentage();
}

class A extends Marks{
	int m1,m2,m3;
	A(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void getPercentage() {
		//System.out.printf("\n%d %d %d",m1,m2,m3);
		float perc = ((m1+m2+m3)/300.0f)*100;
		System.out.printf("\nMark Percentage of student A in 3 sub is:%.2f",perc);
	}
}

class B extends Marks{
	int m1,m2,m3,m4;
	B(int m1,int m2,int m3,int m4){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	void getPercentage() {
		float perc = ((m1+m2+m3+m4)/400.0f)*100;
		System.out.printf("\nMark Percentage of student B in 4 sub is:%.2f",perc);
	}
}

public class Abstracthw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter 3 subjects marks of stud A(out of 100 m1 m2 m3):");
		int Am1=sc.nextInt();int Am2=sc.nextInt();int Am3=sc.nextInt();
		System.out.printf("\nEnter 4 subjects marks of stud B(out of 100 m1 m2 m3 m4):");
		int Bm1=sc.nextInt();int Bm2=sc.nextInt();int Bm3=sc.nextInt();int Bm4=sc.nextInt();
		A a = new A(Am1,Am2,Am3);
		a.getPercentage();
		B b = new B(Bm1,Bm2,Bm3,Bm4);
		b.getPercentage();
		sc.close();
		
	}

}

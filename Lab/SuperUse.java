package Lab1;
import java.util.*;
class Employee1{
	float B_pay,DA,HRA,GP;
	Employee1(float B_pay,float DA,float HRA){
		this.B_pay= B_pay;
		this.DA=DA;
		this.HRA= HRA;
	}
	void display() {
		System.out.println("\n....EMPLOYEE....");
	}
	void calcSalary() {
		GP= B_pay+(DA/100)*B_pay+(HRA/100)*B_pay;
		System.out.printf("The Gross Salary of EMPLOYEE is:%.2f%n",GP);
	}
}

class Engineer extends Employee1{ 
	float Gp;
	Engineer(float B_pay,float DA,float HRA){
		super(B_pay,DA,HRA);
		super.display();super.calcSalary();
		Gp=GP*2;
	}
	void display() {
		System.out.println("\n....ENGINEER....");
	}
	void calcSalary() {
		System.out.printf("The Gross Salary of ENGINEER is:%.2f%n",Gp);
	}
	
}
public class SuperUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary of Employee:");
		float bs = sc.nextFloat();
		System.out.println("Enter the DA% of the Employee:");
		float da = sc.nextFloat();
		System.out.println("Enter the HRA% of the Employee:");
		float hra = sc.nextFloat();
		Engineer eg = new Engineer(bs,da,hra);
		eg.display();
		eg.calcSalary();
	}

}

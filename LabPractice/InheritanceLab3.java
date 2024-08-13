package LabPractice;
import java.util.*;

class Emp{
	String Name = new String();
	int Age;
	long phno;
	String Adrs = new String();
	void display() {
		System.out.printf("Name is:"+Name);
		System.out.printf("\nAge is: %d%n",Age);
		System.out.printf("Address is:"+Adrs+"\n");
	}
}
class FullTimeEmp extends Emp{
	float annualSal ;
	void print_annSal(){
		display();
		System.out.print("\nAnnual Salary is:"+annualSal);
	}
	
	
}
class PartTimeEmp extends Emp{
	float hourlyRate;
	void print_hrlyRat(){
		display();
		System.out.print("\nHourly Rate is:"+hourlyRate);
	}
}
public class InheritanceLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FullTimeEmp ft = new FullTimeEmp();
		PartTimeEmp pt = new PartTimeEmp();
		
		System.out.println("Enter FullTime employee Details:\n");
		System.out.print("Enter Employee name:");
		ft.Name = sc.nextLine();
		System.out.print("Enter Employee age:");
		ft.Age = sc.nextInt();
		System.out.print("Enter Employee phno:");
		ft.phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Address:");
		ft.Adrs = sc.nextLine();
		System.out.print("Enter Employee annual salary:");
		ft.annualSal = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter PartTime employee Details:\n");
		System.out.print("Enter Employee name:");
		pt.Name = sc.nextLine();
		System.out.print("Enter Employee age:");
		pt.Age = sc.nextInt();
		System.out.print("Enter Employee phno:");
		pt.phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Address:");
		pt.Adrs = sc.nextLine();
		System.out.print("Enter Employee's hourly rate:");
		pt.hourlyRate = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("\n\nFullTime Employee Details:\n");
		ft.display();
		ft.print_annSal();
		
		System.out.println("\n\nPartTime Employee Details:\n");
		pt.display();
		pt.print_hrlyRat();
		
		sc.close();
	}

}

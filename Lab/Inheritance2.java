package Lab1;
import java.util.*;
class Employee{
	String Name = new String();
	int Age;
	int phno;
	String Adrs = new String();
	float Salary;
	void Slry(){
		System.out.print("Salary is:"+Salary);
	}
	void display() {
		System.out.printf("Name is:"+Name);
		System.out.printf("\nAge is: %d%n",Age);
		System.out.printf("Address is:"+Adrs+"\n");
	}
}
class Officer extends Employee{
	String spz = new String();
	void print_Specil(){
		System.out.print("\nSpecilization is:"+spz);
	}
	
	
}
class Manager extends Employee{
	String dpt = new String();
	void print_dpt(){
		System.out.print("\nDepartment is:"+dpt);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Officer off = new Officer();
		Manager mn = new Manager();
		
		System.out.println("Enter officer Details:\n");
		System.out.print("Enter officer name:");
		off.Name = sc.nextLine();
		System.out.print("Enter officer age:");
		off.Age = sc.nextInt();
		System.out.print("Enter officer phno:");
		off.phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter officer Address:");
		off.Adrs = sc.nextLine();
		System.out.print("Enter officer salary:");
		off.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter officer Specilization:");
		off.spz = sc.nextLine();
		
		System.out.println("\n\nEnter Manager Details:\n");
		System.out.print("Enter manager name:");
		mn.Name = sc.nextLine();
		System.out.print("Enter manager age:");
		mn.Age = sc.nextInt();
		System.out.print("Enter manager phno:");
		mn.phno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter manager Address:");
		mn.Adrs = sc.nextLine();
		System.out.print("Enter manager salary:");
		mn.Salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter manager Department:");
		mn.dpt = sc.nextLine();
		
		System.out.println("Officer Details:\n");
		off.display();
		off.Slry();
		off.print_Specil();
		
		System.out.println("\n\nManager Details:\n");
		mn.display();
		mn.Slry();
		mn.print_dpt();
		
	}

}


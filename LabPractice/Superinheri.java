package LabPractice;

class Person{
	int age;
	String name;
	Person(int age, String name){
		this.age = age;
		this.name= name;
	}
	void display() {
		System.out.print("\nName: "+name+" Age:"+age);
	}
}

class Man extends Person{
	int salary;
	Man(int age, String name,int salary) {
		super(age, name);
		super.display();//this will be exectued ryt after the assignig value to the man class
		this.salary=salary;
	}
	void salary()
	{	
		System.out.print(" Salary: "+salary);
	}
}

public class Superinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(23,"Athul");
		Man mn = new Man(21,"Sunil",230000);
		
		p.display();
		mn.display();
		mn.salary();
	}

}

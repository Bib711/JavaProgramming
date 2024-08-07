//Practice Question lab3
class Employee{
    void display(){
        System.out.println("Name of class is Employee.");
    }
    void calcSalary(){
    System.out.println("Salary of Employee is 10000");
    }
}
class Engineer extends Employee {
    void display(){
        System.out.println("Name of class is Engineer.");
    }
    void calcSalary(){
        System.out.println("Salary of Employee is 20000");
    }
}

public class inheritanceLab {
    public static void main(String[] args) {
        Engineer eng = new Engineer();

        eng.display();
        eng.calcSalary();
        
    }
}

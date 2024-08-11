package Lab;

class Emp1 {
    String Name = new String();
    int eID;
}

class Manager extends Emp1 {
    String department;

    void display() {
        System.out.println("\nManager Details:");
        System.out.println("Name: " + Name);
        System.out.println("Employee ID: " + eID);
        System.out.println("Department: " + department);
    }
}

public class InheritanceLab1 {

    public static void main(String[] args) {
        Emp1 employee = new Emp1();
        Manager manager = new Manager();

        employee.Name = "John Doe";
        employee.eID = 101;

        manager.Name = "Jane Smith";
        manager.eID = 102;
        manager.department = "Human Resources";

        // Displaying employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.Name);
        System.out.println("Employee ID: " + employee.eID);
        //Displaying manager details
        manager.display();
    }
}

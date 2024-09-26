package Tut9;

import java.util.Scanner;

abstract class Employee {
    String name;
    String type;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract double calculateMonthlySalary();

    String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    double salary;
    double HRA;

    FullTimeEmployee(String name, double salary) {
        super(name, "FullTime");
        this.salary = salary;
    }

    double calculateMonthlySalary() {
    	this.HRA = 1000;
        return salary + HRA;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorkedPerDay;
    final int WORKING_DAYS = 25;

    PartTimeEmployee(String name, double hourlyWage, int hoursWorkedPerDay) {
        super(name, "PartTime");
        this.hourlyWage = hourlyWage;
        this.hoursWorkedPerDay = hoursWorkedPerDay;
    }

    double calculateMonthlySalary() {
        return hourlyWage * hoursWorkedPerDay * WORKING_DAYS;
    }
}

class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) {
        super(name, "Intern");
        this.stipend = stipend;
    }
    double calculateMonthlySalary() {
        return stipend;
    }
}

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continueInput = "YES";

        do {
            System.out.print("Enter employee's name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee's job type (full-time, part-time, intern): ");
            String jobType = sc.nextLine();

            Employee employee;

            if (jobType.equalsIgnoreCase("full-time")) {
                System.out.print("Enter the monthly salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); 
                employee = new FullTimeEmployee(name, salary);
            } else if (jobType.equalsIgnoreCase("part-time")) {
                System.out.print("Enter hourly wage: ");
                double hourlyWage = sc.nextDouble();
                System.out.print("Enter number of hours worked/day: ");
                int hoursWorked = sc.nextInt();
                sc.nextLine(); 
                employee = new PartTimeEmployee(name, hourlyWage, hoursWorked);
            } else if (jobType.equalsIgnoreCase("intern")) {
                System.out.print("Enter the stipend amount: ");
                double stipend = sc.nextDouble();
                sc.nextLine(); 
                employee = new Intern(name, stipend);
            } else {
                System.out.println("Invalid job type entered.");
                continue;
            }

            System.out.println(employee.getName() + "'s Salary: Rs" + employee.calculateMonthlySalary());

            System.out.print("Do you want to continue? (yes/no): ");
            continueInput = sc.nextLine();

        } while (continueInput.equalsIgnoreCase("yes"));

        sc.close();
    }
}


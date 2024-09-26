package Tut9;

import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


class Hostler extends Student {
    String hostelName;

    Hostler(String name, int rollNo, String hostelName) {
        super(name, rollNo);
        this.hostelName = hostelName;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Hostel Name: " + hostelName);
    }
}


class Dayscholar extends Student {
    String busRoute;

    Dayscholar(String name, int rollNo, String busRoute) {
        super(name, rollNo);
        this.busRoute = busRoute;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bus Route: " + busRoute);
    }
}


public class College {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter type of student (Hostler/Dayscholar): ");
        String type = scanner.nextLine();

        Student student;
        if (type.equalsIgnoreCase("Hostler")) {
            System.out.print("Enter hostel name: ");
            String hostelName = scanner.nextLine();
            student = new Hostler(name, rollNo, hostelName);
        } else if (type.equalsIgnoreCase("Dayscholar")) {
            System.out.print("Enter bus route: ");
            String busRoute = scanner.nextLine();
            student = new Dayscholar(name, rollNo, busRoute);
        } else {
            System.out.println("Invalid student type.");
            scanner.close();
            return;
        }

        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}


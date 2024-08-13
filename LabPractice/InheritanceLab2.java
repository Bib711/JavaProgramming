package LabPractice;
import java.util.Scanner;

class Vehicle {
    String model;
    int year;

    void displayVehicleDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
    }
}

class Car extends Vehicle {
    int noOfDoors;

    void displayCarDetails() {
        displayVehicleDetails(); // Display vehicle details
        System.out.println("Number of Doors: " + noOfDoors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    void displayElectricCarDetails() {
        displayCarDetails(); // Display car details
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class InheritanceLab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricCar ec = new ElectricCar();

        // Input details 
        System.out.print("Enter Vehicle Model: ");
        ec.model = sc.nextLine();
        System.out.print("Enter Vehicle Year: ");
        ec.year = sc.nextInt();
        System.out.print("Enter Number of Doors: ");
        ec.noOfDoors = sc.nextInt();
        System.out.print("Enter Battery Capacity (in kWh): ");
        ec.batteryCapacity = sc.nextInt();

        // Display the details of the electric car
        System.out.println("\nElectric Car Details:");
        ec.displayElectricCarDetails();

        sc.close();
    }
}

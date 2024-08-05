import java.util.*;

public class Overloadeg {
    // Creating a method to compute area of triangle, rectangle, and circle
    public double TriAr(double base, double height) {
        return (0.5 * base * height);
    }

    public double RecAr(double width, double height) {
        return (width * height);
    }

    public double CirAr(double r) {
        return (3.14 * r * r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloadeg exa = new Overloadeg(); // Creating an object to access or invoke methods from the class

        System.out.print("Enter the Base of the Triangle: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the Height of the Triangle: ");
        double n2 = sc.nextDouble();
        // Triangle area
        double tArea = exa.TriAr(n1, n2);

        System.out.print("Enter the Width of the Rectangle: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter the Length of the Rectangle: ");
        double r2 = sc.nextDouble();
        // Rectangle area
        double rArea = exa.RecAr(r1, r2);

        System.out.print("Enter the Radius of the Circle: ");
        double r = sc.nextDouble();
        // Circle area
        double cArea = exa.CirAr(r);

        System.out.printf("Area of Triangle with base: %.2f and height: %.2f is: %.2f%n", n1, n2, tArea);
        System.out.printf("Area of Rectangle with width: %.2f and length: %.2f is: %.2f%n", r1, r2, rArea);
        System.out.printf("Area of Circle with radius: %.2f is: %.2f%n", r, cArea);

        sc.close();
    }
}
import java.util.*;

public class Overloadeg {
    // Creating a method to compute area of triangle, rectangle, and circle
    public double Area(double base, double height) {
        return (0.5 * base * height);
    }

    public int Area(int width, int height) {
        return (width * height);
    }

    public double Area(double r) {
        return (3.14 * r * r);
    }

    public double Area(double side1, double side2, double height) {
        return (0.5 * (side1+side2) * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloadeg exa = new Overloadeg(); // Creating an object to access or invoke methods from the class

        System.out.print("Enter the Base of the Triangle: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the Height of the Triangle: ");
        double n2 = sc.nextDouble();
        // Triangle area
        double tArea = exa.Area(n1, n2);

        System.out.print("Enter the Width of the Rectangle: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the Length of the Rectangle: ");
        int r2 = sc.nextInt();
        // Rectangle area
        int rArea = exa.Area(r1, r2);

        System.out.print("Enter the Radius of the Circle: ");
        double r = sc.nextDouble();
        // Circle area
        double cArea = exa.Area(r);

        System.out.print("Enter the lengths of Parallel sides, height  of the Trapezium(s1 s2 h): ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double h = sc.nextDouble();
        // Trapezium area
        double trapArea = exa.Area(s1,s2,h);

        System.out.printf("Area of Triangle with base: %.1f and height: %.1f is: %.3f%n", n1, n2, tArea);
        System.out.printf("Area of Rectangle with width: %d and length: %d is: %d%n", r1, r2, rArea);
        System.out.printf("Area of Circle with radius: %.1f is: %.3f%n", r, cArea);
        System.out.printf("Area of Trapezium is: %.1f%n",trapArea);

        sc.close();
    }
}
package lab1;

import java.util.*;

public class BuiltInExceptionDemo {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        boolean run = true;

	        while (run) {
	            System.out.println("Menu:");
	            System.out.println("1. Division by Zero");
	            System.out.println("2. Array Index Out of Bounds");
	            System.out.println("3. Exit");
	            System.out.print("Choose: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    handleArithmetic();
	                    break;
	                case 2:
	                    handleArray();
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    run = false;
	                    break;
	                default:
	                    System.out.println("Invalid option.");
	                    break;
	            }
	        }

	        sc.close();
	    }
	
private static void handleArithmetic() {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Numerator: ");
        int num = sc.nextInt();
        System.out.print("Denominator: ");
        int denom = sc.nextInt();
        int res = divide(num, denom);
        System.out.println("Result: " + res);
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        System.out.println("Exiting Arithmetic handler.");
    }
}

private static int divide(int num, int denom) throws ArithmeticException {
    if (denom == 0) {
        throw new ArithmeticException("Cannot divide by zero.");
    }
    return num / denom;
	}


	private static void handleArray() {
	    Scanner sc = new Scanner(System.in);
	    int i, n;
	    System.out.println("Enter the no. of elements:");
	    n=sc.nextInt();
	    try {
	    	System.out.println("Enter the elements:");
	        int arr[] = new int[n];
	        for(i=0; i<n; i++) {
	        	arr[i]=sc.nextInt();
	        }
	        int val = accessElement(arr, n);
	        System.out.println("Value: " + val);
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Error: " + e.getMessage());
	    } finally {
	        System.out.println("Exiting Array handler.");
	    }
	}
	
	private static int accessElement(int[] arr, int idx) throws ArrayIndexOutOfBoundsException {
	    if (idx < 0 || idx >= arr.length) {
	        throw new ArrayIndexOutOfBoundsException("Index " + idx + " is out of bounds.");
	    }
	    return arr[idx];
	}
}	


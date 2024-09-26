package Tut8;
import java.util.*;
public class Stackimple{
	public int top =-1;
	static int size;
	private int[] stack;
	int item;
	static Scanner sc = new Scanner(System.in);
	public void push() {	
		if(top==size-1) {
			System.out.println("Overflow");
		}
		else{
            System.out.println("Enter element to push:");
			int element = sc.nextInt();
			stack[++top]=element;	
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Undderflow");
		}
		else {
			item = stack[top--];
			System.out.println("The popped element is:"+item);
		}
	}
	
	public void isEmpty() {
		System.out.println((top==-1) ? "Stack is empty" : "Stack is not empty");
	}
	
	public int size() {
		return top+1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackimple stk = new Stackimple();
		System.out.printf("Enter the size of the stack:");
		size =  sc.nextInt();
		stk.stack = new int[size];
		
		while (true) {
			System.out.println("\t\tMENU\n");
            System.out.println("1: Push element");
            System.out.println("2: Pop element");
            System.out.println("3: Check if stack is empty");
            System.out.println("4: Print size of stack");
            System.out.println("5: Exit MENU");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                stk.push();
            } else if (choice == 2) {
                stk.pop();
            } else if (choice == 3) {
                stk.isEmpty();
            } else if (choice == 4) {
                System.out.println("Stack size: " + stk.size());
            } else if (choice == 5) {
            	System.out.println("Exiting...");
                break;
            }
		}
		sc.close();
	}

}

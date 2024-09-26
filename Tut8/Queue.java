package Tut8;
import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int front, rear, size;
    static Scanner sc = new Scanner(System.in);
    public Queue() {
        size = 5;
        queue = new int[size];
        front = rear = -1;
    }

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue() {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0;
            System.out.printf("Enter element to enqueue:");
            int element = sc.nextInt();
            queue[++rear] = element;
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            int item =queue[front++];
            System.out.println("The popped element is:"+item);
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter max size of queue: ");
        int size = sc.nextInt();
        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\t\tMENU\n");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Display");
            System.out.println("4: Exit MENU");
            int choice = sc.nextInt();

            if (choice == 1) {
                queue.enqueue();
            } else if (choice == 2) {
                queue.dequeue();
            } else if (choice == 3) {
                queue.display();
            } else if (choice == 4) {
            	System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}


package Tut10;
import java.util.*;


class InvalidNumberException extends Exception{
	private String message;
	public InvalidNumberException(String msg) {
		message = msg;
	}
	
	public String getMessage() {
		return message;
	}
}

public class Average{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int positiveNum = 0;
		int sum = 0;
		int arr[] = new int[5];
		System.out.println("Enter 5 Numbers:");
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			try {
				if(arr[i] <= 0)
					throw new InvalidNumberException("invalid Number "+arr[i]);
				else {
					System.out.println(arr[i]);
					positiveNum++;
					sum = sum + arr[i];
						
				}
					
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nsum of positive integers are: "+sum);
		
		System.out.println("Average of these numbers: "+(double)sum/positiveNum);
		sc.close();
	}
}

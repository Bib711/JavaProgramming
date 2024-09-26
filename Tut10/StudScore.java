package Tut10;

import java.util.*;

class InvalidScoreException extends Exception{
	private String message;
	public InvalidScoreException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

public class StudScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score of the student:");
		
		int score = sc.nextInt();
		try {
			if(score<0 || score>100) {
				throw new InvalidScoreException("Score must be between 0 and 100.");
			}
			else {
				System.out.println("The score of the student "+score);
			}
		}catch(InvalidScoreException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}


package Tut10;
import java.util.*;
	
	class InvalidReservationException extends Exception {
		private String message;
	    public InvalidReservationException(String message) {
	        this.message = message;
	    }
	    public String getMessage() {
	    	return message;
	    }
}
	
	public class HotelRoom {
		
		public static void main(String[] arrgs) {
			 Scanner scanner = new Scanner(System.in);
			 
			 int availableSlots = 10;
		     System.out.print("Enter the number of slots to be reserved: ");
		     int Slots = scanner.nextInt();
		     
		     try {
		    	 if(Slots <= 0) {
		    		 throw new InvalidReservationException("Invalid slot number.");
		    	 }else if(Slots > availableSlots) {
		    		 throw new InvalidReservationException("Invalid reservation: Not enough available slots.");
		    	 }else {
		    		 System.out.println("Slots reserved");
		    	 }
		     }catch(InvalidReservationException e) {
		    	 System.out.println(e.getMessage());
		     }
		     
		}
	}


package lab1;
import java.util.*;

public class InvalidAmountException extends Exception {
	private String message;
	InvalidAmountException(String msg){
		message = msg;
	}
    public String getMessage(){
        return message;
    }
}


package lab1;

public class InsufficientFundsException extends Exception {
    private String message;

    public InsufficientFundsException(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message; 
    }
}

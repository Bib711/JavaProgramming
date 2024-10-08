package lab1;
import java.util.*;

class MyAcc{
	static Scanner sc = new Scanner(System.in);
	int Accno;
	long balance;
	String AccName;
	String AccType;
	
	void OpenAcc() {
		System.out.print("Enter Account No: ");
		Accno= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Type: ");
		AccType= sc.nextLine();
		System.out.print("Enter Name: ");
		AccName= sc.nextLine();
		System.out.print("Enter Initial Balance: ");
		balance = sc.nextLong();
		System.out.println("Account created successfully!\n");
	}
	
	public int getAccNo() {
        return Accno;
    }

	void DisplayAcc() {
		 System.out.println("Name of Account Holder: " + AccName);
		 System.out.println("Account No.: " + Accno);
	     System.out.println("Account Type: " + AccType);
	     System.out.println("Balance: " + balance);
		
	}
	
	void DepositAmt(long amount) {
	    try {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Invalid amount; must be greater than 0.");
	        }
	        
	        balance += amount; 
	        System.out.println("Deposit successful! New balance: " + balance);
	        
	    } catch (InvalidAmountException e) {
	        System.out.println(e.getMessage());
	    }
	}

	
	void WithdrawAmt(long amount) {
	    try {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
	        } else if (amount <= 0) {
	            throw new InvalidAmountException("Invalid amount; must be greater than 0.");
	        }
	        
	        balance -= amount;
	        System.out.println("Withdrawal successful! New balance: " + balance);
	        
	    } catch (InvalidAmountException e) {
	        System.out.println(e.getMessage());
	    } catch (InsufficientFundsException e) {
	        System.out.println(e.getMessage());
	    }
	}

	void SearchAcc(int accno) {
		if(accno == Accno) {
			DisplayAcc();
		}
		else {
			System.out.println("Account not found.");
		}
	}
	
	
}


public class MyCustomBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAcc ac = new MyAcc();
		
		boolean run = true;

	    while (run) {
	        System.out.println("\n*** BANKING SYSTEM APPLICATION ***:");
	        System.out.println("1. Open New Account\n2. Display Account Details\n3. Deposit Amount\n4. Withdraw Account\n5. Search Account\n6. Exit");
	        System.out.print("Enter your choice: ");

	        int choice = ac.sc.nextInt();

	        switch (choice) {
	            case 1:
	                ac.OpenAcc();
	                break;
	            case 2:
	                ac.DisplayAcc();
	                break;
	            case 3:
	            	System.out.print("Enter amount to deposit: ");
	            	long damt = ac.sc.nextLong();
	                ac.DepositAmt(damt);
	                break;
	            case 4:
	            	System.out.print("Enter amount to withdraw: ");
	            	long wamt = ac.sc.nextInt();
	                ac.WithdrawAmt(wamt);
	                break;
	            case 5:
	            	System.out.print("Enter amount to withdraw: ");
	            	int accno = ac.sc.nextInt();
	                ac.SearchAcc(accno);
	                break;
	            case 6:
	                System.out.println("Exiting...");
	                run = false;
	                break;
	            default:
	                System.out.println("Invalid option.");
	                break;
	        }
	    }
		
	}

}

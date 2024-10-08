package lab1;

import java.util.*;

class BankAccount{
	 private int accNo;
	    private String accType;
	    private String accHolder;
	    private long balance;

	    public BankAccount(int accNo, String accType, String accHolder, long balance) {
	        this.accNo = accNo;
	        this.accType = accType;
	        this.accHolder = accHolder;
	        this.balance = balance;
	    }
	    public int getAccNo() {
	        return accNo;
	    }

	    public void deposit(long amt) {
	        if (amt > 0) {
	            balance += amt;
	            System.out.println("Deposit successful! New balance: " + balance);
	        } else {
	            System.out.println("Invalid amount; must be greater than 0.");
	        }
	    }

	    public void withdraw(long amt) {
	        if (amt > balance) {
	            System.out.println("Insufficient balance for withdrawal.");
	        } else if (amt > 0) {
	            balance -= amt;
	            System.out.println("Withdrawal successful! New balance: " + balance);
	        } else {
	            System.out.println("Invalid amount; must be greater than 0.");
	        }
	    }

	    public void displayDetails() {
	        System.out.println("Name of Account Holder: " + accHolder);
	        System.out.println("Account No.: " + accNo);
	        System.out.println("Account Type: " + accType);
	        System.out.println("Balance: " + balance);
	    }
	    
}

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        BankAccount acc = null;
		
		while(true) {
            System.out.println("\n*** Banking System Application ***");
            System.out.println("1. Open New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int no = sc.nextInt();
                    System.out.print("Enter Account Type: ");
                    String type = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    long bal = sc.nextLong();
                    acc = new BankAccount(no, type, name, bal);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (acc != null) {
                        acc.displayDetails();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 3:
                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        long depAmt = sc.nextLong();
                        acc.deposit(depAmt);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 4:
                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        long withAmt = sc.nextLong();
                        acc.withdraw(withAmt);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 5:
                    if (acc != null) {
                        System.out.print("Enter Account No to search: ");
                        int searchNo = sc.nextInt();
                        if (searchNo == acc.getAccNo()) {
                            acc.displayDetails();
                        } else {
                            System.out.println("Account not found.");
                        }
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the banking system. See you soon!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
		

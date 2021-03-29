/* Nur Syifa' Aina bt Zahaimi
 * 1817794
 * username = cnc
 * password = cnc123
 * OTP = 1000
 * account balance = 2034.80
 */

import java.util.Scanner;

public class MoneyTransfer {
	public static void main(String[] args) {
		
		String username = new String("cnc");
		String password = new String("cnc123");
		
		authorize();
	}

	static void authorize() {
		String username = new String("cnc");
		String password = new String("cnc123");
		
		Scanner myUN = new Scanner(System.in); //Scanner Object (username)
		System.out.println("\n"+"Enter your username");
		String myusername = myUN.nextLine();  // Read user input (username)
		
		Scanner myPW = new Scanner(System.in); //Scanner Object (password)
		System.out.println("Enter your password");
		String mypassword = myPW.nextLine();  // Read user input (password)
		
		if(myusername.equals(username) && mypassword.equals(password)) {
			System.out.println("Your username and password is correct!");
			System.out.println("Welcome to our system");
			checkOTP();
		}else {
			System.out.println("Sorry your username and password did not match");
			authorize();
		}
	  }

	static void checkOTP() {
		int OTP = 1000;
		
		Scanner myOTP_ = new Scanner(System.in); //Scanner Object (OTP)
		System.out.println("\n"+"Enter the OTP");
		int myOTP = myOTP_.nextInt();  // Read user input (OTP)
		
		if(OTP == myOTP) {
			System.out.println("Correct OTP!");
			checkBalance();
		}else {
			System.out.println("Wrong OTP");
			checkOTP();
		}
	}
	
	static void checkBalance() {
		float balance = 2034.80f;
		
		Scanner mytransfer_ = new Scanner(System.in); //Scanner Object (transfer)
		System.out.println("\n"+"Enter the amount to transfer");
		float mytransfer = mytransfer_.nextFloat();  // Read user input (transfer)
		
		if(mytransfer < balance) {
			balance = balance - mytransfer;
			System.out.println("Transaction successful!" + "\n" + "Your account balance now is RM" + balance);
			System.out.println("\n"+"Thank you for choosing us!" + "\n" + "Have a nice day!");
		}else {
			System.out.println("Insufficient balance. Balance in your account is RM" + balance);
			continuetransaction(balance);
		}
		
	}
	
	static void continuetransaction(float balance) {
		
		Scanner mycont = new Scanner(System.in); //Scanner Object (continue transaction)
		System.out.println("\n"+"Do you want to continue your transcation?");
		System.out.println("\n"+"Press 1 to continue or 0 to exit");
		int mycontinue = mycont.nextInt();  // Read user input (continue transaction)
		
		if(mycontinue == 1) {
			System.out.println("\n" + "Balance in you account is RM" + balance);
			checkBalance();
		}else {
			System.out.println("\n"+"Thank you for choosing us!" + "\n" + "Have a nice day!");
		}
	}
}

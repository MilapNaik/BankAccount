
import java.util.Scanner;

public class ManageAccount{
  
 //private static String name;   //stores the name of the account
 //private static double balance;  //stores the balance
 public static int numDep = 0;  //tot num of dep
 public static int numWithdraw = 0; //tot num of withdraw
 final static int MAXWITHDRAW = 6; //max withdraw allowed
  
  public static void main(String[] args){
    
    
    Scanner input = new Scanner( System.in );
    System.out.println("[1] Create an Account");
    System.out.println("[2] Check Balance");
    System.out.println("[3] Deposit");
    System.out.println("[4] Withdraw");
    System.out.println("[5] Print info");
    System.out.println("[6] Exit");
    System.out.println(" ");
    System.out.println("Enter an option: ");
    int option = input.nextInt();
    while (option != 6) {
	    if (option == 1){
	      
		    Scanner input1 = new Scanner( System.in );
		    Scanner input2 = new Scanner( System.in );
		    System.out.println("########## OPEN ACCOUNT ##########");
		    System.out.println("Enter name: ");
		   
		    String nameAcc = input1.nextLine();
		    System.out.println("Enter amount: ");
		    double money = input2.nextDouble();
	      
		    BankAccount.openAccount(nameAcc, money);

		    System.out.println("[1] Create an Account");
		    System.out.println("[2] Check Balance");
		    System.out.println("[3] Deposit");
		    System.out.println("[4] Withdraw");
		    System.out.println("[5] Print info");
		    System.out.println("[6] Exit");
		    System.out.println(" ");
		    System.out.println("Enter an option: ");
		    option = input.nextInt(); 
		    input1.close();
		    input2.close();
	    }
	    else if (option == 2) {
	        System.out.println("########## CHECK BALANCE ##########");
	        System.out.println(BankAccount.getBalance());
		      
		    System.out.println("[1] Create an Account");
		    System.out.println("[2] Check Balance");
		    System.out.println("[3] Deposit");
		    System.out.println("[4] Withdraw");
		    System.out.println("[5] Print info");
		    System.out.println("[6] Exit");
		    System.out.println(" ");
		    System.out.println("Enter an option: ");
		    option = input.nextInt(); 
		}
	    else if (option == 3) {
	        Scanner input3 = new Scanner (System.in);
	        System.out.println("########## DEPOSIT ##########");
	        System.out.println("Enter amount: ");
	        double deposit2 = input3.nextInt();
	        BankAccount.deposit(deposit2);
	        numDep++;
	       
		    System.out.println("[1] Create an Account");
		    System.out.println("[2] Check Balance");
		    System.out.println("[3] Deposit");
		    System.out.println("[4] Withdraw");
		    System.out.println("[5] Print info");
		    System.out.println("[6] Exit");
		    System.out.println(" ");
		    System.out.println("Enter an option: ");
		    option = input.nextInt(); 
		    input3.close();
	    }
	    else if (option == 4){
	        Scanner input4 = new Scanner (System.in);
	        System.out.println("########## WITHDRAW ##########");
	        System.out.println("Enter amount: ");
	        double deposit1 = input4.nextInt();
	        BankAccount.withdraw(deposit1);
	        numWithdraw++;
	        System.out.println(numWithdraw);
	       
		    System.out.println("[1] Create an Account");
		    System.out.println("[2] Check Balance");
		    System.out.println("[3] Deposit");
		    System.out.println("[4] Withdraw");
		    System.out.println("[5] Print info");
		    System.out.println("[6] Exit");
		    System.out.println(" ");
		    System.out.println("Enter an option: ");
		    option = input.nextInt();
		    input4.close();
	    }
	    else if (option == 5) {
	        System.out.println(BankAccount.printInfo());
		      
		    System.out.println("[1] Create an Account");
		    System.out.println("[2] Check Balance");
		    System.out.println("[3] Deposit");
		    System.out.println("[4] Withdraw");
		    System.out.println("[5] Print info");
		    System.out.println("[6] Exit");
		    System.out.println(" ");
		    System.out.println("Enter an option: ");
		    option = input.nextInt(); 
	    }
    }//Closes while loop
    
    System.out.println("Goodbye!");
    input.close(); //Closes scanner
    
  }
}

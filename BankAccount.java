//This program was designed and created by Milap Naik

public class BankAccount{

	private static String name;   //stores the name of the account
	private static double balance;  //stores the balance
	public static int numDep = 0;  //tot num of dep
	public static int numWithdraw = 0; //tot num of withdraw
	final static int MAXWITHDRAW = 6; //max withdraw allowed
 
	public static boolean openAccount(String nameAcc, double money){ 
		if (name == null){
			name = nameAcc;
			balance = money;
			return false;
		}
		else{
			name = nameAcc;
			balance = money;
			return true;
		}
	}
 
	public static double getBalance(){
		return balance;
	}
 
	public static double deposit(double money){
		if (money >= 0){
			balance = balance + money;
			return balance;
		}
		else
			return -1;
    
	}
 
	public static double withdraw(double money){
		if (money >= 0 && money <= balance){
			balance = balance - money;
			return balance;
		}
		else
			return -1;
    
	}

	public static String printInfo(){ //this method is already given to you
		String info = "Account Name: " + name 
				+ " Balance: " + balance + "\n" + "Tot. Deposits: " 
				+ numDep + " Tot. Withdraws: " + numWithdraw;
		return info;
	}

}





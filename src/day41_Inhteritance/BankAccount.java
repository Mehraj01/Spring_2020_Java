package day41_Inhteritance;
/*          Warmup TASK. Not Inheritance

            create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class BankAccount {

    private static String bankName="Bank of America";
    public String firstName;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName+" "+lastName;


    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder, String lastName){
        this.accountHolder=accountHolder+" "+lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //original: 100
    //deposit: 20;
    //new balance: 120
    public void depositing(int amount){
        //balance+=amount
        setBalance(balance+amount);
    }

    public void withdrawing(int amount){// i dont have to use this key word because my paramater is different
                                           //there is no need to use this key word in this case
       // balance-=amount;
        setBalance(balance-amount);// we call setBalance method to execute the action
    }

    public void checkBalance(){
       // System.out.println("Available Balance: "+balance);
        System.out.println("Available Balance: "+getBalance()); // we call method as well to get the result
    }

    public String toString(){
        return "Full Name: "+getAccountHolder()+", Balance: "+getBalance();
                             //accountHolder
    }


}

// check the method with main method
class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Irina = new BankAccount("Irina", "Li");
        System.out.println(Irina);
        System.out.println(Irina.getAccountHolder());// we can private variable direct we have to call them with getter
        // Irina.getAccountHolder();
        System.out.println(Irina.getBalance());
        Irina.checkBalance();
        Irina.depositing(120);
        Irina.checkBalance();
        Irina.withdrawing(80);
        Irina.checkBalance();

        System.out.println(Irina);

        Irina.withdrawing(100);
        System.out.println(Irina);
        Irina.depositing(20000);
        System.out.println(Irina);

    }

    }

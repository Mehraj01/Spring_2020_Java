package MyOwnLibrary.Inheritance;
/*
create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
	create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class Bank_Account {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount){
        balance+=amount;
    }

    public void showBalance(){
        System.out.println("Available Balance: "+balance);

    }

    public String toString(){
        return  "Name is: "+accountHolder+", Balance is: "+balance;
    }
}

//********************************************************************************************************************
class SavingAccount extends Bank_Account {
    /*
    accountNumber-inherited
    accountHolder-inherited
    balance-inherited

    interestRate

    deposit()--inherited
    showBalance()--inherited
    toString()-inherited
     */
    public static double interestRate;

    static{
        interestRate=0.02;
    }
}

//********************************************************************************************************************
class CheckingAccount extends Bank_Account {

     /*
    accountNumber-inherited
    accountHolder-inherited
    balance-inherited

    withDraw

    deposit()--inherited
    showBalance()--inherited
    toString()-inherited
     */

     public void withDraw(int amount){
         balance-=amount;
     }
}

//********************************************************************************************************************
class AccountObjects{
    public static void main(String[] args) {

        CheckingAccount obj=new CheckingAccount();
        obj.accountHolder="Saban";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withDraw(10000);
        obj.showBalance();


        SavingAccount saving=new SavingAccount();
        saving.accountHolder="Elif";

        System.out.println(saving.interestRate);
        System.out.println(saving);
        saving.deposit(3000);
        saving.showBalance();




    }
}
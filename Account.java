package bankAccountApp;

//it's abstract so we won't be able to create account objects (we will create them from its children checking and savings class)
public abstract class Account implements IBaseRate{
  //list common properties for checking and savings accounts
  String name;
  String ssn;
  double balance;
  String accountNumber;
  double rate;
  static int index = 10000;

  //constructor to set base properties and initialize the account
  public Account(String name, String ssn, double initDeposit){
    this.name = name;
    this.ssn = ssn;
    this.balance = initDeposit;
    //set account number
    index++;
    this.accountNumber = setAccountNumber();
    setRate();
  }

  //we are forcing to implement this abstract methods in checking and savings class
  public abstract void setRate();

  //generate account number
  private String setAccountNumber(){
    //get last 2-digits of the ssn
    String lastTwoSsn = ssn.substring(ssn.length()-2);
    //get unique 5-digit number
    int uniqueId = index;
    //get random 3-digit number
    int randomNumber = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoSsn + uniqueId + randomNumber;
  }

  public void compound(){
    double accruedInterest = balance + rate / 100;
    balance = balance + accruedInterest;
    System.out.println("Accrued interest is " + accruedInterest);
    printBalance();
  }

  //list common methods - TRANSACTIONS

  public void deposit(double amount){
    balance = balance + amount;
    System.out.println("Depositing $" + amount);
    printBalance();
  }

  public void withdraw(double amount){
    balance = balance - amount;
    System.out.println("Withdrawing $" + amount);
    printBalance();
  }

  public void transfer(String toWhere, double amount){
    balance = balance - amount;
    System.out.println("Transfe ring $" + amount + " to " + toWhere);
    printBalance();
  }

  public void printBalance() {
    System.out.println("Your balance is now " + balance);
  }

  public void showInfo(){
    System.out.println("Name: " + name + " Account Number: " + accountNumber
        + " Balance: " + balance + " Interest rate: " + rate + "%");
  }

}

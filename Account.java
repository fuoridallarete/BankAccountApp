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
    System.out.println("Name: " + name + " SSN: " + ssn + " Balance: " + balance);
    
    //set account number
    index++;
    this.accountNumber = setAccountNumber();
    System.out.println("Account number: " + this.accountNumber);
  }
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

  //list common methods

}

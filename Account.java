package bankAccountApp;

//it's abstract so we won't be able to create account objects (we will create them from its children checking and savings class)
public abstract class Account implements IBaseRate{
  //list common properties for checking and savings accounts
  String name;
  String ssn;
  double balance;
  String accountNumber;
  double rate;
  //constructor to set base properties and initialize the account
  public Account(String name, String ssn, double initDeposit){
    this.name = name;
    this.ssn = ssn;
    this.balance = initDeposit;
    System.out.println("Name: " + name + " SSN: " + ssn + " Balance: " + balance);
  }

  //list common methods

}

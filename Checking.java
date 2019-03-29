package bankAccountApp;

public class Checking extends Account{
  //list properties specific to checking account
  int debitCardNumber;
  int debitCardPin;
  //constructor to initialize checking account properties
  public Checking(String name, String ssn, double initDeposit){
    super(name, ssn, initDeposit);
    accountNumber = 2 + accountNumber;
    System.out.println("NEW CHECKING ACCOUNT");
  }

  //list any methods specific to the checking account

}

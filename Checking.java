package bankAccountApp;

public class Checking extends Account{
  //list properties specific to checking account
  int debitCardNumber;
  int debitCardPin;
  //constructor to initialize checking account properties
  public Checking(String name){
    super(name);
    System.out.println("NEW CHECKING ACCOUNT");
  }

  //list any methods specific to the checking account

}

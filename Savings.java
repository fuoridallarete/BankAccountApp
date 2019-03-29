package bankAccountApp;

public class Savings extends Account{
  //list properties specific to the saving account
  int safetyDepositBoxId;
  int safetyDepositBoxKey;
  //contructor to initialize settings for the saving properties
  public Savings(String name){
    super(name);
    System.out.println("NEW SAVINGS ACCOUNT");
  }
  //list any methods specific to savings account

}

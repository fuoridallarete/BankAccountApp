package bankAccountApp;

//it's abstract so we won't be able to create account objects (we will create them from its children checking and savings class)
public abstract class Account implements IBaseRate{
  //list common properties for checking and savings accounts

  //constructor to set base properties and initialize the account
  public Account(String name){
    System.out.println("Name: " + name);
    System.out.print("NEW ACCOUNT: ");
  }

  //list common methods

}

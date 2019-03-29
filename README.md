# BankAccountApp
The App should:
-read a .csv file of names, social security numbers, account type and initial deposit
-use a proper data structure to hold all these accounts
-both savings and checking accounts share the following properties:
  -deposit();
  -withdraw();
  -transfer();
  -showInfo();
-11-digit account number generated like this:
  -1 or 2 depending on Savings or Checking
  -last 2 digits of SSN
  -unique 5-digit number
  -random 3-digit number
-savings account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
-checking account holders are assigned a debit card with a 12-digit number and 4-digit PIN
-both accounts will use an interface that determines the base interest rate
  -savings accounts will use .25% of the base rate
  -checking accounts will use 15% of the base rate
-the showInfo() method should reveal relevant account informations as well as informations specific to the savings or checking account  
  

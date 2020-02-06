// Implementation of an Account Class with two derived classes, Savings and Current, using the Concepts of Polymorphism.

// Problem Statement

// Write a code that has:

// A parent class named Account.
// Inside it define:
// 1. a protected double member balance
// 2. public void Withdraw(double amount), public void Deposit(double amount), and public printBalance().

// Then, there are two derived classes: savings and current

//    Savings class
//        has a private member interestRate set to 0.8
//        Withdraw(double amount) deducts amount from balance with interestRate
//        Deposit(float amount) adds amount in balance with interestRate
//        printBalance() displays the balance in the account

//    Current class

//        Withdraw(double amount) deducts amount from balance
//        Deposit(double amount) adds amount in balance
//        printBalance() displays the balance in the account

// Account Class
class Account {

  protected double balance; // protected variable

  public Account(double balance) { // parametrized constructor
    this.balance = balance;
  }

  // member functions
  public void Deposit(double amount){}
  public void Withdraw(double amount){}
  public void printBalance(){}

}

// Savings class extended from Account class
class Savings extends Account {

  double interestRate = 0.8; // member variable

  public Savings(int balance) { // parametrized contructor
    super(balance); // calling base class constructor
  }

  // Implementation of member functions
  public void Deposit(double amount) {
    balance += amount + (amount * interestRate);
  }

  public void Withdraw(double amount) {
    balance -= amount + (amount * interestRate);
  }

  public void printBalance() {
    System.out.println("Balance in your saving account: " + balance);
  }

}

// Current class extended from the Account class
class Current extends Account {

  public Current(int balance) { // Parametrized constructor
    super(balance); // calling base class constructor
  }

  // Implementation of public member functions
  public void Deposit(double amount) {
    balance += amount;
  }

  public void Withdraw(double amount) {
    balance -= amount;
  }

  public void printBalance() {
    System.out.println("Balance in your current account: " + balance);
  }

}

class Demo {

  public static void main(String args[]) {
    // creating savings account object
    Account SAccount = new Savings(50000);

    SAccount.Deposit(1000);
    SAccount.printBalance();

    SAccount.Withdraw(3000);
    SAccount.printBalance();

    System.out.println();

    // creating current account object
    Account CAccount = new Current(50000);
    CAccount.Deposit(1000);
    CAccount.printBalance();

    CAccount.Withdraw(3000);
    CAccount.printBalance();
  }

}

// output

// Balance in your saving account: 51800.0
// Balance in your saving account: 46400.0
// Balance in your current account: 51000.0
// Balance in your current account: 48000.0


// Explanation
//
//    We have implemented the Account class which has the balance double variable, and three public methods Deposit(double amount), Withdraw(double amount) and printBalance()
//
//    Implemented Savings and Current classes extended from the Account class through the extend keyword
//
//    Savings class has private double interestRate variable and following methods:
//
//        Withdraw(double amount) deducts amount from the balance with interestRate
//
//        Deposit(double amount) adds amount in the balance with interestRate
//
//        printBalance() displays the balance in the account
//
//    Current class has following methods:

//        Withdraw(double amount) deducts amount from balance
//        Deposit(double amount) adds amount in balance
//        printBalance() displays the balance in the account`
//
//    Created Savings and Current object by calling parametrized constructors of the classes and printed their balance by calling their respective methods
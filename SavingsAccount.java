public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
        this.setAccountType("SAVINGS");
    }

    @Override
    public void setAccountType(String type) {
        super.setAccountTypeParent(type);
    }

    @Override
    public void deposit(double amount){
        System.out.println("From the SavingsAccount deposit method 1");
        super.deposit((1+interestRate) * amount);
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        super.deposit(interest);
    }
}

/*
* Abstraction: The SavingsAccount class is an example of abstraction because it extends
* the BankAccount class and provides a specific implementation for a savings account,
* adding an addInterest() method that calculates and deposits interest.
*
* Encapsulation: The interestRate variable is encapsulated because it is private and
* can only be accessed through the public constructor and the addInterest() method.
*
* Inheritance: The SavingsAccount class is a subclass that extends the BankAccount class,
* inheriting its properties and methods.
*
*
* Run-time Polymorphism: If we create a BankAccount object or a SavingsAccount object and call
* the deposit() or withdraw() method through a variable of type BankAccount, The specific
* implementation of deposit() in the SavingsAccount class will be called at runtime,
* because the myAccount object is actually an instance of SavingsAccount.
*
* */
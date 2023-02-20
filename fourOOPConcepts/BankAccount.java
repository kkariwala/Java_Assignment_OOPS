public abstract class BankAccount {
    private String accountNumber;
    private String accountType;
    private double balance;

    public abstract void setAccountType(String type);
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        System.out.println("From the BankAccount deposit method 1");
        balance += amount;
    }

    public void deposit(int amount){
        System.out.println("From the BankAccount deposit method 2");
        balance += (double)amount;
    }

    public void deposit(double amount, double depositFees){
        System.out.println("From the BankAccount deposit method 3");
        balance += amount;
        balance -= depositFees;
    }

    public void withdraw(double amount) {
        System.out.println("From the BankAccount withdraw method 1");
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void withdraw(int amount) {
        System.out.println("From the BankAccount withdraw method 2");
        double temp = (double) amount;
        if (balance >= temp) {
            balance -= temp;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void withdraw(double amount,double withdrawFees ) {
        System.out.println("From the BankAccount withdraw method 3");
        double temp = amount +withdrawFees;
        if (balance >= temp) {
            balance -= temp;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType(){
        return accountType;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountTypeParent(String accountType){
        this.accountType = accountType;
    }
}


/*
* Abstraction: The BankAccount class is an example of abstraction because it abstracts away
* the details of how a bank account works, providing a simple interface for depositing, withdrawing,
* and checking the balance of an account.
*
* Encapsulation: The accountNumber and balance variables are encapsulated because they are private
* and can only be accessed through public methods (deposit(), withdraw(), and getBalance()).
*
* Compile-time Polymorphism: Compile-time polymorphism allows us to have more than one method share
* the same name with different signatures and different return types. (deposit() and withdraw())
* have different signatures and different parameters.
* */
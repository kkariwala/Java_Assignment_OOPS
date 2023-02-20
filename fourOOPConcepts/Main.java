public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new SavingsAccount("1234", 0.05);
//        BankAccount myAccount2 = new BankAccount("2345");
        System.out.println(myAccount.getAccountType());
        myAccount.deposit(100.0);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(40);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(40,5);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(20.0);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(20);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(40,5);
        System.out.println(myAccount.getBalance());

//        myAccount2.deposit(100.0);
//        System.out.println(myAccount.getBalance());
    }
}
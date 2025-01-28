public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(2000);

        currentAccount.deposit(500);
        System.out.println(currentAccount.getBalance());
        currentAccount.withdraw(200);
        System.out.println(currentAccount.getBalance());

        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        // savingsAccount.withdraw(500);

        Depositable account = savingsAccount;
        account.deposit(300); 
        System.out.println(savingsAccount.getBalance());
    }
}
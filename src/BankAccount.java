import interfaces.Depositable;

public abstract class BankAccount implements Depositable {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être positif");
        }
        this.balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}